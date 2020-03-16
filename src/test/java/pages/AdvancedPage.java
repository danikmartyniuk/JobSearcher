package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdvancedPage extends BasePage {

    private static final By WANT_WORK = By.xpath("//a[@data-qa='mainmenu_wantwork']");
    //key words
    //profession
    //industry
    //region
    //salary
    //if necessary
    //exp
    //type of empl
    //schedule
    //the latest or all
    //find button

    public AdvancedPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AdvancedPage openPage() {
        isPageOpened();
        return this;
    }

    @Override
    public void isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(WANT_WORK));
    }

    public void sendKeyWords() {

    }

    public void setProfession() {

    }

    public void setIndustry() {

    }

    public void editRegion() {

    }

    public void setSalary() {

    }

    public void setExperience() {

    }

    public void setTypeOfEmployment() {

    }

    public void setSchedule() {

    }

    public void timeOfVacancies() {

    }

    public void find() {

    }
}
