package mantis.site.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import org.openqa.selenium.support.FindBy;

public class Header extends Section {

    @FindBy(css = "[href='/mantisbt/my_view_page.php']")
    public Button myViewPage;

    @FindBy(css = "[href='bug_report_page.php']")
    public Button reportIssue;

    @JDropdown(
            root = @FindBy(css = ".dropdown-toggle"),
            list = @FindBy(tagName = "li"),
            value = @FindBy()
    )
    public Dropdown userInfo;

}
