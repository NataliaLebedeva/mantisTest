package mantis.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    public static User Lead1 = new User("lead1", "leader");

    private String login;
    private String password;
}
