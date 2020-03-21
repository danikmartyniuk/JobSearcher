package steps;

import org.openqa.selenium.WebDriver;
import pages.AdvancedPage;

public class AdvancedSteps {

    AdvancedPage advancedPage;

    public AdvancedSteps (WebDriver driver) {
        advancedPage = new AdvancedPage(driver);
    }

    public AdvancedSteps openParameters () {
        advancedPage.openPage();
        return this;
    }

    public AdvancedSteps keyWords (String words) {
        advancedPage.sendKeyWords(words);
        return this;
    }

    public AdvancedSteps setSalary (String salary, String userAnsw) {
        advancedPage.setSalary(salary);
        advancedPage.setSalaryNecc(userAnsw);
        return this;
    }

    public AdvancedSteps setExperience (String exp) {
        advancedPage.setExperience(exp);
        return this;
    }

    public AdvancedSteps setSchedule (String indexes) {
        advancedPage.setSchedule(indexes);
        return this;
    }

    public AdvancedSteps setTypeOfEmployment (String indexes) {
        advancedPage.setTypeOfEmployment(indexes);
        return this;
    }

    public AdvancedSteps vacPeriod (String index) {
        advancedPage.timeOfVacancies(index);
        return this;
    }

    public AdvancedSteps approve () {
        advancedPage.find();
        return this;
    }

}
