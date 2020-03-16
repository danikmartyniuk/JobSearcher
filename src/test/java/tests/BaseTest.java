package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import steps.AdvancedSteps;
import steps.MainSteps;

public class BaseTest {

    WebDriver driver;
    MainSteps mainSteps;
    AdvancedSteps advancedSteps;

    @BeforeTest
    public void setUp () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainSteps = new MainSteps(driver);
        advancedSteps = new AdvancedSteps(driver);
    }

    @AfterTest
    public void close () {
        driver.quit();
    }
}
