package mantis;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import mantis.site.MantisSite;
import org.testng.annotations.BeforeSuite;

public class TestInit extends TestNGBase {

    @BeforeSuite(alwaysRun = true)
    public static void steUp() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebSite.init(MantisSite.class);

    }
}
