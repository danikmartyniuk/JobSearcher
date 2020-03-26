package tests;

import models.JobSeeker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import steps.AdvancedSteps;
import steps.MainSteps;
import steps.ResultsSteps;
import utils.CapabilitiesGenerator;
import utils.TestListener;

import java.util.Scanner;

@Listeners({TestListener.class})
public class BaseTest {

    WebDriver driver;
    MainSteps mainSteps;
    AdvancedSteps advancedSteps;
    ResultsSteps resultsSteps;

    JobSeeker user;
    public void getUserAnswers (JobSeeker user) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите ключевые слова, связанные с ожидаемой работой: ");
        user.setKeyWords(s.nextLine());
        System.out.print("Введите минимальную желаемую зарплату: ");
        user.setSalary(s.nextLine());
        System.out.print("Вы хотите видеть вакансии без указания зарплаты? (Да - 0, Нет - 1");
        user.setSalaryNecc(s.nextLine());
        System.out.print("Какой опыт работы вы желаете выбрать? + \n + 0. Не имеет значения + \n + 1. Нет опыта + \n + 2. От 1 года до 3 лет + \n + " +
                "3. От 3 до 6 лет + \n + 4. Более 6 лет + \n Выберите один вариант ответа");
        user.setExperience(s.nextLine());
        System.out.print("Выберите удобный график работы: + \n + 0. Полный день + \n + 1. Сменный график + \n + 2. Гибкий график + \n + " +
                "3. Удаленная работа + \n + 4. Вахтовый метод + \n Запишите номера выбранных опций через пробел");
        user.setSchedule(s.nextLine());
        System.out.print("Приемлимый для вас тип занятости: + \n + 0. Полная занятость + \n + 1. Частичная занятость + \n + 2. Частичная занятость + \n + " +
                "3. Волонтерство + \n + 4. Стажировка + \n Запишите номера выбранных опций через пробел");
        user.setTypeOfEmployment(s.nextLine());
        System.out.print("Какие вакансии вывести? + \n + 0. За месяц + \n + 1. За неделю + \n 2. За последние три дня + \n 3. За сутки");
        user.setVacPeriod(s.nextLine());
    }

    @BeforeSuite
    public void createUser () {
        getUserAnswers(user);
    }

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
