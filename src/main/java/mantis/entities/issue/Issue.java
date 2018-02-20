package mantis.entities.issue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mantis.entities.user.User;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Issue {
    private String category;
    private String reproducibility;
    private String severity;
    private String priority;
    private Profile profile;
    private User assignTo;
    private String summary;
    private String description;
    private String stepsToReproduce;
    private String additionalInfo;
}
