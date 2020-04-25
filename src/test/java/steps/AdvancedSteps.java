package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.AdvancedPage;

public class AdvancedSteps {

    AdvancedPage advancedPage;

    public AdvancedSteps (WebDriver driver) {
        advancedPage = new AdvancedPage(driver);
    }

    @Step ("Opening advanced search page")
    public AdvancedSteps openParameters () {
        advancedPage.openPage();
        return this;
    }

    @Step ("Input keywords")
    public AdvancedSteps keyWords (String words) {
        advancedPage.sendKeyWords(words);
        return this;
    }

    @Step ("Setting salary")
    public AdvancedSteps setSalary (String salary, String userAnsw) {
        advancedPage.setSalary(salary);
        advancedPage.setSalaryNecc(userAnsw);
        return this;
    }

    @Step ("Setting experience")
    public AdvancedSteps setExperience (String exp) {
        advancedPage.setExperience(exp);
        return this;
    }

    @Step ("Setting schedule")
    public AdvancedSteps setSchedule (String indexes) {
        advancedPage.setSchedule(indexes);
        return this;
    }

    @Step ("Setting types of employment")
    public AdvancedSteps setTypeOfEmployment (String indexes) {
        advancedPage.setTypeOfEmployment(indexes);
        return this;
    }

    @Step ("Choosing vacancy period")
    public AdvancedSteps vacPeriod (String index) {
        advancedPage.timeOfVacancies(index);
        return this;
    }

    @Step ("Approving parameters")
    public AdvancedSteps approve () {
        advancedPage.find();
        return this;
    }

}
