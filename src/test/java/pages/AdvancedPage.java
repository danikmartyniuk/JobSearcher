package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class AdvancedPage extends BasePage {

    private static final By WANT_WORK = By.xpath("//a[@data-qa='mainmenu_wantwork']");
    private static final By KEY_WORDS = By.xpath("//input[@data-qa='vacancysearch__keywords-input']");
    private static final By PROF_AREA = By.xpath("//button[@data-qa='profarea-changeFromList']");
    private static final By CHECKBOX = By.xpath("//input[@data-qa='bloko-tree-selector-input']");
    private static final By INDUSTRY = By.xpath("//span[@data-qa='industry-addFromList']");
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

    public void getListOfProf() {
        driver.findElement(PROF_AREA).click();
        String[] profAreas = new String[driver.findElements(CHECKBOX).size()];
        for (int i = 0; i < profAreas.length; i++) {
            profAreas[i] = driver.findElements(CHECKBOX).get(i).getText();
        }
        for (int i = 39; i < profAreas.length; i++) {
            System.out.println(i - 39 + ". " + profAreas[i]);
        }
    }

    public void setProfession(String indexes) {
        String[] array = indexes.split(" ");
        int[] prof = new int[array.length];
        for (int i = 0; i < prof.length; i++) {
            WebElement chb = driver.findElements(CHECKBOX).get(prof[i] + 39);
            actions.moveToElement(chb).perform();
            chb.click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
        driver.findElement(CHOOSE_BUTTON).click();
    }

    public void getListOfIndustries() {
        driver.findElement(INDUSTRY).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Быстрый поиск']")));
        String[] industries = new String[driver.findElements(CHECKBOX).size()];
        for (int i = 0; i < industries.length; i++) {
            industries[i] = driver.findElements(CHECKBOX).get(i).getText();
        }
        for (int i = 0; i < industries.length; i++) {
            System.out.println(i + ". " + industries[i]);
        }
    }

    public void setIndustries(String indexes) {

    }

    public void setSalary(String salary) {
        driver.findElement(SALARY).sendKeys(salary);
    }

    public void setSalaryNecc(String userAns) {
        if (userAns.equals("0")) {
            driver.findElement(NECESSARY_SLR).click();
        }
    }

    public void getExp() {
        System.out.println("Какой у вас опыт работы?");
        for (int i = 0; i < driver.findElements(EXPERIENCE).size(); i++) {
            System.out.println(i + ". " + driver.findElements(By.xpath("//span[@class='bloko-radio__text']")).get(i).getText());
        }
    }

    public void setExperience(String i) {
        WebElement checkbox = driver.findElements(EXPERIENCE).get(Integer.parseInt(i));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", checkbox);
    }

    public void getTypesOfEmployment() {
        System.out.println("Типы занятости:");
        for (int i = 0; i < driver.findElements(By.xpath("//label[contains(@data-qa,'control-vacancysearch__employment-item control-vacancysearch__employment-item')]")).size(); i++) {
            System.out.println(i + ". " + driver.findElements(By.xpath("//label[contains(@data-qa,'control-vacancysearch__employment-item control-vacancysearch__employment-item')]")).get(i).getText());
        }
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

    public void getSchedule() {
        System.out.println("График работы:");
        for (int i = 0; i < driver.findElements(By.xpath("//label[contains(@data-qa,'control-vacancysearch__schedule-item control-vacancysearch__schedule-item')]")).size(); i++) {
            System.out.println(i + ". " + driver.findElements(By.xpath("//label[contains(@data-qa,'control-vacancysearch__schedule-item control-vacancysearch__schedule-item')]")).get(i).getText());
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

    public void getTimeOfVacancies() {
        System.out.println("Вывести вакансии:");
        for (int i = 0; i < driver.findElements(By.xpath("//label[contains(@data-qa,'control-vacancysearch__searchperiod-item control-vacancysearch__searchperiod-item')]")).size(); i++) {
            System.out.println(i + ". " + driver.findElements(By.xpath("//label[contains(@data-qa,'control-vacancysearch__searchperiod-item control-vacancysearch__searchperiod-item')]")).get(i).getText());
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
