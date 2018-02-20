package mantis.entities.issue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Profile {
    private String platform;
    private String os;
    private String osVersion;
}
