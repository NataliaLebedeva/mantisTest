package mantis.utils;

import com.mifmif.common.regex.Generex;

import java.util.HashMap;
import java.util.Map;

class RandomUtils {

    private static Map<String, String> regEx = new HashMap<String, String>() {{
        put("regEx_1", "[a-z0-9]+");
        put("regEx_summary", "Summary [a-z]{10} [0-9]{5}");
    }};

    static String getByRegEx(String id) {
        if (regEx.containsKey(id)) {
            return new Generex(regEx.get(id)).random(15, 20);
        } else {
            return id;
        }
    }
}
