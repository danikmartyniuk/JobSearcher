package tests;

import org.testng.annotations.Test;

public class MainTest extends BaseTest {

    @Test (description = "Input parameters of job seeker", priority = 1)
    public void findJob() {
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

    @Test (description = "Getting the appropriate list of job for user", priority = 2)
    public void getListOfJobs() {
        resultsSteps
                .openResults()
                .getVacInfo();
    }

}
