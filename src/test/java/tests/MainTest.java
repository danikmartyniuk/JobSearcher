package tests;

import models.JobSeeker;
import org.testng.annotations.Test;

import java.util.Scanner;

public class MainTest extends BaseTest {

    @Test
    public void findJob() {
        Scanner s = new Scanner(System.in);
        System.out.println("Your number");
        int number = s.nextInt();
        JobSeeker user = new JobSeeker("QA Automation", "500", "1", "1", "1 4", "0 3", "2");

        mainSteps.findJob();
        advancedSteps
                .openParameters()
                .keyWords(user.getKeyWords())
                .setSchedule(user.getSchedule())
                .setSalary(user.getSalary(), user.getSalaryNecc())
                .setExperience(user.getExperience())
                .setTypeOfEmployment(user.getTypeOfEmployment())
                .vacPeriod(user.getVacPeriod())
                .approve();
    }

}
