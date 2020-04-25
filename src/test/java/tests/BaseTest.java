package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import steps.AdvancedSteps;
import steps.MainSteps;
import steps.ResultsSteps;
import utils.CapabilitiesGenerator;
import utils.FilesWriter;
import utils.TestListener;

import javax.swing.*;
import java.io.IOException;

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
    public void close () throws IOException {
        driver.quit();
        FilesWriter.cleanFile("userAnswers.txt");
        JOptionPane.showMessageDialog(null, "Список вакансий находится в фвйле jobresults.txt. Спасибо за использование!");
    }

    public WebDriver getDriver() {
        return this.driver;
    }

}
