package steps;

import org.openqa.selenium.WebDriver;
import pages.ResultsPage;

import java.io.IOException;

public class ResultsSteps {

    ResultsPage resultsPage;

    public ResultsSteps (WebDriver driver) {
        resultsPage = new ResultsPage(driver);
    }

    public ResultsSteps openResults () {
        resultsPage.openPage();
        return this;
    }

    public ResultsSteps getVacInfo () throws IOException {
        resultsPage.getFullInfo(resultsPage.getVacNames(), resultsPage.getEmployers(), resultsPage.getSalaries(), resultsPage.getLinks());
        return this;
    }

}
