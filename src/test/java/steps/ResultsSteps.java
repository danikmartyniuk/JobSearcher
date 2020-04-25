package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.ResultsPage;

import java.io.IOException;

public class ResultsSteps {

    ResultsPage resultsPage;

    public ResultsSteps (WebDriver driver) {
        resultsPage = new ResultsPage(driver);
    }

    @Step ("Open results page")
    public ResultsSteps openResults () {
        resultsPage.openPage();
        return this;
    }

    @Step ("Get all info about vacancies")
    public ResultsSteps getVacInfo () throws IOException {
        resultsPage.getFullInfo(resultsPage.getVacNames(), resultsPage.getEmployers(), resultsPage.getSalaries(), resultsPage.getLinks());
        return this;
    }

}
