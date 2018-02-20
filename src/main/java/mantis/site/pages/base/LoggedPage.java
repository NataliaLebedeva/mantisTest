package mantis.site.pages.base;

import com.epam.jdi.uitests.core.interfaces.complex.IMenu;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import mantis.site.sections.Header;

public class LoggedPage extends WebPage {
    public Header header;

    @JFindBy(css = ".nav-list")
    public IMenu menu;
}
