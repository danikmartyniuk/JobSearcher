package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.FilesWriter;

import java.io.IOException;

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
        String[] names = new String[driver.findElements(VACANCY_NAME).size()];
        for (int i = 0; i < names.length; i++) {
            names[i] = driver.findElements(VACANCY_NAME).get(i).getText();
        }
        return names;
    }

    public String[] getEmployers() {
        String[] employers = new String[driver.findElements(EMPLOYER).size()];
        for (int i = 0; i < employers.length; i++) {
            employers[i] = driver.findElements(EMPLOYER).get(i).getText();
        }
        return employers;
    }

    public String[] getSalaries() {
        String[] salaries = new String[driver.findElements(SALARY).size()];
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = driver.findElements(SALARY).get(i).getText();
        }
        return salaries;
    }

    public String[] getLinks() {
        String[] jobLinks = new String[driver.findElements(VACANCY_NAME).size()];
        for (int i = 0; i < jobLinks.length; i++) {
            jobLinks[i] = driver.findElements(VACANCY_NAME).get(i).getAttribute("href");
        }
        return jobLinks;
    }

    public void getFullInfo(String[] names, String[] employers, String[] salaries, String[] links) throws IOException, ArrayIndexOutOfBoundsException {
        int length = Math.min(Math.min(names.length, employers.length), Math.min(salaries.length, links.length));
        for (int i = 0; i < length; i++) {
            FilesWriter.writeResultsFile(String.format("%s. %s, %s, %s, %s", i+1, names[i], employers[i], salaries[i], links[i]));
        }
        FilesWriter.writeResultsFile("Это всё, что удалось найти :(");
    }

}
