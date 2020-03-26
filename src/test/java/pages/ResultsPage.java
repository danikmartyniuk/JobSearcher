package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultsPage extends BasePage {

    private static final By VACANCY_NAME = By.xpath("//a[@data-qa='vacancy-serp__vacancy-title']");
    private static final By EMPLOYER = By.xpath("//a[@data-qa='vacancy-serp__vacancy-employer']");
    private static final By SALARY = By.xpath("//span[@data-qa='vacancy-serp__vacancy-compensation']");

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage openPage() {
        isPageOpened();
        return this;
    }

    @Override
    public void isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-qa='vacancy-serp__results']")));
    }

    public String[] getVacNames() {
        String[] names = new String[45];
        for (int i = 0; i < names.length; i++) {
            names[i] = driver.findElements(VACANCY_NAME).get(i).getText();
        }
        return names;
    }

    public String[] getEmployers() {
        String[] employers = new String[45];
        for (int i = 0; i < employers.length; i++) {
            employers[i] = driver.findElements(EMPLOYER).get(i).getText();
        }
        return employers;
    }

    public String[] getSalaries() {
        String[] salaries = new String[45];
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = driver.findElements(SALARY).get(i).getText();
        }
        return salaries;
    }

    public String[] getLinks() {
        String[] jobLinks = new String[45];
        for (int i = 0; i < jobLinks.length; i++) {
            jobLinks[i] = driver.findElements(VACANCY_NAME).get(i).getAttribute("href");
        }
        return jobLinks;
    }

    public void getFullInfo(String[] names, String[] employers, String[] salaries, String[] links) {
        for (int i = 0; i < 45; i++) {
            System.out.println(String.format("%s. %s, %s, %s, %s", i+1, names[i], employers[i], salaries[i], links[i]));
        }
    }
}
