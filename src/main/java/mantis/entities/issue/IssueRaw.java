package mantis.entities.issue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class IssueRaw {
//    public static final IssueRaw DEFAULT = new IssueRaw();

    private String category;
    private String reproducibility;
    private String severity;
    private String priority;
    private Profile profile;
    private String assignTo;
    private String summary;
    private String description;
    private String stepsToReproduce;
    private String additionalInfo;

}
