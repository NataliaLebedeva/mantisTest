package mantis.site.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.TextArea;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import mantis.entities.Issue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReportIssueForm extends Form<Issue> {

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
            jroot = @JFindBy(id="severity"),
            jlist = @JFindBy(tagName = "option")
    )
    private Dropdown severity;

    @JDropdown(
            jroot = @JFindBy(id="priority"),
            jlist = @JFindBy(tagName = "option")
    )
    private Dropdown priority;

    @JDropdown(
            jroot = @JFindBy(id="handler_id"),
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

    @Override
    public void submit(Issue data) {
//        category.select("General");
        reproducibility.select("всегда");
        severity.select("малое");
        priority.select("низкий");

    }
}
