package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdvancedPage extends BasePage {

    private static final By WANT_WORK = By.xpath("//a[@data-qa='mainmenu_wantwork']");
    private static final By KEY_WORDS = By.xpath("//input[@data-qa='vacancysearch__keywords-input']");
    private static final By SALARY = By.xpath("//input[@data-qa='vacancysearch__compensation-input']");
    private static final By NECESSARY_SLR = By.xpath("//label[@data-qa='control-vacancysearch__only-with-compensation control-vacancysearch__only-with-compensation_true']");
    private static final By EXPERIENCE = By.name("experience");
    private static final By TYPE_OF_EMPLOYMENT = By.name("employment");
    private static final By SCHEDULE = By.name("schedule");
    private static final By VAC_PERIOD = By.name("search_period");
    private static final By CHOOSE_BUTTON = By.xpath("//input[@value='Найти']");

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

    public void sendKeyWords(String words) {
        driver.findElement(KEY_WORDS).sendKeys(words);
    }

    public void setSalary (String salary) {
        driver.findElement(SALARY).sendKeys(salary);
    }

    public void setSalaryNecc (String userAns) {
        if (userAns.equals("0")) {
            driver.findElement(NECESSARY_SLR).click();
        }
    }

    public void setExperience(String i) {
        WebElement checkbox = driver.findElements(EXPERIENCE).get(Integer.parseInt(i));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", checkbox);
    }

    public void setTypeOfEmployment(String indexes) {
        String[] ind = indexes.split(" ");
        int[] arr = new int[ind.length];
        for (int i = 0; i < arr.length; i++) {
            WebElement checkbox = driver.findElements(TYPE_OF_EMPLOYMENT).get(Integer.parseInt(ind[i]));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", checkbox);
        }
    }

    public void setSchedule(String indexes) {
        String[] ind = indexes.split(" ");
        int[] arr = new int[ind.length];
        for (int i = 0; i < arr.length; i++) {
            WebElement checkbox = driver.findElements(SCHEDULE).get(Integer.parseInt(ind[i]));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", checkbox);
        }
    }

    public void timeOfVacancies(String i) {
        WebElement checkbox = driver.findElements(VAC_PERIOD).get(Integer.parseInt(i));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", checkbox);
    }

    public void find() {
        driver.findElement(CHOOSE_BUTTON).click();
    }
}
