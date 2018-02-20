package mantis.site.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextArea;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import mantis.entities.issue.Issue;
import org.openqa.selenium.support.FindBy;

public class ReportIssueForm extends Form<Issue> {

    private OsProfileForm osProfileForm = new OsProfileForm();

    @JDropdown(
            jroot = @JFindBy(id = "category_id"),
            jlist = @JFindBy(tagName = "option")
    )
    private Dropdown category;

    @JDropdown(
            jroot = @JFindBy(id = "reproducibility"),
            jlist = @JFindBy(tagName = "option")
    )
    private Dropdown reproducibility;

    @JDropdown(
            jroot = @JFindBy(id = "severity"),
            jlist = @JFindBy(tagName = "option")
    )
    private Dropdown severity;

    @JDropdown(
            jroot = @JFindBy(id = "priority"),
            jlist = @JFindBy(tagName = "option")
    )
    private Dropdown priority;

    @JDropdown(
            jroot = @JFindBy(id = "handler_id"),
            jlist = @JFindBy(tagName = "option")
    )
    private Dropdown assignTo;

    @FindBy(id = "summary")
    private TextField summary;

    @FindBy(id = "description")
    private TextArea description;

    @FindBy(id = "steps_to_reproduce")
    private TextArea steps;

    @FindBy(id = "additional_info")
    private TextArea additionalInfo;

    @FindBy(css = "[type ='submit']")
    private Button submit;


    @Override
    public void submit(Issue issue) {
        reproducibility.select(issue.getReproducibility());
        severity.select(issue.getSeverity());
        priority.select(issue.getPriority());

        osProfileForm.fill(issue.getProfile());

        assignTo.select(issue.getAssignTo().getLogin());
        summary.newInput(issue.getSummary());
        description.sendKeys(issue.getDescription());
        steps.sendKeys(issue.getStepsToReproduce());
        additionalInfo.sendKeys(issue.getAdditionalInfo());

        submit.click();
    }
}
