package steps;

import org.openqa.selenium.WebDriver;
import pages.AdvancedPage;

public class AdvancedSteps {

    AdvancedPage advancedPage;

    public AdvancedSteps (WebDriver driver) {
        advancedPage = new AdvancedPage(driver);
    }

    public AdvancedSteps setParameters () {
        advancedPage.openPage();
        return this;
    }
}
