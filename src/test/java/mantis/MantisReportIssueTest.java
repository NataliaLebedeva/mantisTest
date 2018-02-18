package mantis;

import mantis.entities.User;
import mantis.site.MantisSite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MantisReportIssueTest extends TestInit{

    @BeforeMethod
    public void beforeMethod() {
        MantisSite.loginPage.open();
    }

    @Test
    public void reportTest() {
        System.out.println("mantis test has been started");
        MantisSite.login(User.Lead1);

    }
}
