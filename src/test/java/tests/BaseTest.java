package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import steps.AdvancedSteps;
import steps.MainSteps;
import steps.ResultsSteps;
import utils.CapabilitiesGenerator;
import utils.TestListener;

@Listeners({TestListener.class})
public class BaseTest {

    WebDriver driver;
    MainSteps mainSteps;
    AdvancedSteps advancedSteps;
    ResultsSteps resultsSteps;

    @BeforeClass
    public void setUp () {
        driver = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());
        driver.manage().window().maximize();
        mainSteps = new MainSteps(driver);
        advancedSteps = new AdvancedSteps(driver);
        resultsSteps = new ResultsSteps(driver);
    }

    @AfterClass
    public void close () {
        driver.quit();
    }

    public WebDriver getDriver() {
        return this.driver;
    }

}
