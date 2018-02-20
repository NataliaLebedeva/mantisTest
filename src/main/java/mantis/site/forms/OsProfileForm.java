package mantis.site.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import mantis.entities.issue.Profile;
import org.openqa.selenium.support.FindBy;

class OsProfileForm extends Section {

    @FindBy(id = "platform")
    private TextField platform;

    @FindBy(id = "os")
    private TextField os;

    @FindBy(id = "os_build")
    private TextField osVersion;

    void fill(Profile profile) {
        platform.setValue(profile.getPlatform());
        os.setValue(profile.getOs());
        osVersion.setValue(profile.getOsVersion());
    }
}
