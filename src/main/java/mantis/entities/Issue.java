package mantis.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Issue {
//    public static final Issue DEFAULT = new Issue();

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
