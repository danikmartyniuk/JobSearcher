package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class MainSteps {

    MainPage mainPage;

    public MainSteps (WebDriver driver) {
        mainPage = new MainPage(driver);
    }

    @Step ("Search for {job}")
    public MainSteps findJob (String job) {
        mainPage.openPage().searchForJob(job);
        return this;
    }

    @Step ("Clicking advanced search")
    public MainSteps findJob () {
        mainPage.openPage().openAdvancedSearch();
        return this;
    }

}
