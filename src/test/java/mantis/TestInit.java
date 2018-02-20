package mantis;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import mantis.site.MantisSite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

import java.util.function.Supplier;

@SuppressWarnings("unchecked")
public class TestInit extends TestNGBase {

    private static Supplier<WebDriver> driverSupplier = () -> {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en-us");
        return new ChromeDriver(options);
    };

    @BeforeSuite(alwaysRun = true)
    public static void steUp() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        WebSettings.useDriver(driverSupplier);
        WebSite.init(MantisSite.class);
    }
}
