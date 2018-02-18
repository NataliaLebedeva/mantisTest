package mantis.site;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import mantis.entities.User;
import mantis.site.pages.LoginPage;

@JSite("http://localhost/mantisbt")
public class MantisSite extends WebSite {

    @JPage(url = "login_page.php")
    public static LoginPage loginPage;
    // init pages


    public static void login(User user) {
        loginPage.loginForm.loginAsUser(user);
    }


}
