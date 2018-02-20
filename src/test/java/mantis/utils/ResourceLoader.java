package mantis.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import mantis.entities.issue.Issue;
import mantis.entities.issue.IssueRaw;
import mantis.entities.user.User;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ResourceLoader {

    private static Map<EntityFile, Type> dataSet = new HashMap<EntityFile, Type>() {{
        put(new EntityFile(User.class, "users"), new TypeToken<Map<String, User>>() {{
        }}.getType());
        put(new EntityFile(IssueRaw.class, "issue"), new TypeToken<Map<String, IssueRaw>>() {{
        }}.getType());
    }};
    private static Map<Class, Map<String, Object>> collect;

    @SneakyThrows
    private static JsonReader getJReader(String path) {
        return new JsonReader(new FileReader(ResourceLoader.class.getClassLoader().getResource(path).getFile()));
    }

    private static void loadResources() {
        collect = dataSet.entrySet().stream().collect(Collectors.toMap(
                e -> e.getKey().aClass,
                e -> new Gson().fromJson(
                        ResourceLoader.getJReader(String.format("data/%s.json", e.getKey().path)),
                        e.getValue()))
        );
        collect.put(Issue.class, collect.get(IssueRaw.class).entrySet().stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                e -> IssueAdapter.mutate((IssueRaw) e.getValue())
        )));
    }

    private static Map<String, Object> getCommon(Class aClass) {
        if (Objects.isNull(collect))
            loadResources();
        return collect.get(aClass);
    }

    public static User getUser(String id) {
        return (User) getCommon(User.class).get(id);
    }

    public static Issue getIssue(String id) {
        return (Issue) getCommon(Issue.class).get(id);
    }

    @SuppressWarnings("unchecked")
    public static <T> T get(Class<T> tClass, String id) {
        return (T) getCommon(tClass).get(id);
    }

    @AllArgsConstructor
    public static class EntityFile {
        Class aClass;
        String path;
    }
}
