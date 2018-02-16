package mantis.site.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.openqa.selenium.support.FindBy;

public class loginForm extends Form {

    @FindBy(css = "input-icon-right")
    private TextField login;


}
