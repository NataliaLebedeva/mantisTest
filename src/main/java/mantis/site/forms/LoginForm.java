package mantis.site.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import mantis.entities.User;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends Form<User> {

    @FindBy(css = "[id='username']")
    private TextField login;

    @FindBy(css = "[id='password']")
    private TextField password;

    @FindBy(css = "[type='submit']")
    private Button submit;

    public void loginAsUser(User user) {
        login.setValue(user.getLogin());
        submit.click();
        password.setValue(user.getPassword());
        submit.click();
    }


}
