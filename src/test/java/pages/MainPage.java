package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    private static final String JOBS_URL = "https://jobs.tut.by/";
    private static final By DASHBOARD_FOOTER = By.className("supernova-dashboard-footer");
    private static final By SEARCH_INPUT = By.xpath("//input[@data-qa='search-input']");
    private static final By ADVANCED_SEARCH = By.xpath("//a[@data-qa='advanced-search']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openPage() {
        driver.get(JOBS_URL);
        isPageOpened();
        return this;
    }

    public void isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(DASHBOARD_FOOTER));
    }

    public void searchForJob(String job) {
        driver.findElement(SEARCH_INPUT).sendKeys(job, Keys.ENTER);
    }

    public void openAdvancedSearch() {
        driver.findElement(ADVANCED_SEARCH).click();
    }
}
