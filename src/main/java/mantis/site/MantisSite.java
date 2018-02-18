package mantis.site;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import mantis.entities.User;
import mantis.site.pages.BugReportPage;
import mantis.site.pages.LoginPage;
import mantis.site.pages.MyViewPage;

@JSite("http://localhost/mantisbt")
public class MantisSite extends WebSite {

    @JPage(url = "login_page.php")
    public static LoginPage loginPage;

    @JPage(url = "my_view_page.php")
    public static MyViewPage myViewPage;

    @JPage(url = "bug_report_page.php")
    public static BugReportPage reportPage;

    public static void login(User user) {
        loginPage.loginForm.loginAsUser(user);
    }

}
