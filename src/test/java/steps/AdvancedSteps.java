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

    public AdvancedSteps sendKeyWords () {
        String words = "QA Automation";
        advancedPage.sendKeyWords(words);
        return this;
    }

    public AdvancedSteps chooseProf () {
        advancedPage.getListOfProf();
        String indexes = "1 5 6 9";
        advancedPage.setProfession(indexes);
        return this;
    }

    public AdvancedSteps chooseIndustry () {
        advancedPage.getListOfIndustries();
        return this;
    }

    public AdvancedSteps setSalary () {
        String salary = "450";
        String userAnw = "1";
        advancedPage.setSalary(salary);
        advancedPage.setSalaryNecc(userAnw);
        return this;
    }

    public AdvancedSteps setExperience () {
        advancedPage.getExp();
        String exp = "2";
        advancedPage.setExperience(exp);
        return this;
    }

    public AdvancedSteps setSchedule () {
        advancedPage.getSchedule();
        String indexes = "1 4";
        advancedPage.setSchedule(indexes);
        return this;
    }

    public AdvancedSteps setTypeOfEmpl () {
        advancedPage.getTypesOfEmployment();
        String indexes = "0 3";
        advancedPage.setTypeOfEmployment(indexes);
        return this;
    }

    public AdvancedSteps vacPeriod () {
        advancedPage.getTimeOfVacancies();
        String index = "2";
        advancedPage.timeOfVacancies(index);
        return this;
    }

    public AdvancedSteps approve () {
        advancedPage.find();
        return this;
    }
}
