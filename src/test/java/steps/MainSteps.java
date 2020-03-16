package steps;

import org.openqa.selenium.WebDriver;
import pages.MainPage;

import java.util.Scanner;

public class MainSteps {

    MainPage mainPage;

    public MainSteps (WebDriver driver) {
        mainPage = new MainPage(driver);
    }

    public MainSteps findJob (String job) {
        mainPage.openPage().searchForJob(job);
        return this;
    }

    public MainSteps findJob () {
        mainPage.openPage().openAdvancedSearch();
        return this;
    }

}
