package mantis.utils;

import mantis.entities.issue.Issue;
import mantis.entities.issue.IssueRaw;

class IssueAdapter {
    static Issue mutate(IssueRaw raw) {
        return new Issue(
                raw.getCategory(),
                raw.getReproducibility(),
                raw.getSeverity(),
                raw.getPriority(),
                raw.getProfile(),
                ResourceLoader.getUser(raw.getAssignTo()),
                RandomUtils.getByRegEx(raw.getSummary()),
                RandomUtils.getByRegEx(raw.getDescription()),
                RandomUtils.getByRegEx(raw.getStepsToReproduce()),
                RandomUtils.getByRegEx(raw.getAdditionalInfo())
        );
    }
}
