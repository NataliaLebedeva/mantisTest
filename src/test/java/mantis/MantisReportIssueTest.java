package mantis;

import mantis.entities.issue.Issue;
import mantis.entities.user.User;
import mantis.enums.MANTIS_PAGES;
import mantis.site.MantisSite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static mantis.utils.ResourceLoader.getIssue;
import static mantis.utils.ResourceLoader.getUser;

public class MantisReportIssueTest extends TestInit{

    @BeforeMethod
    public void beforeMethod() {
        MantisSite.loginPage.open();
    }

    @Test
    public void reportTest() {
        Issue issue = getIssue("issue_1");
        User user = getUser("user_1");

        MantisSite.login(user);
        MantisSite.myViewPage.header.reportIssue.click();
        MantisSite.reportPage.issueForm.submit(issue);
        MantisSite.reportPage.menu.select(MANTIS_PAGES.VIEW_ISSUES.getPage());
    }
}
