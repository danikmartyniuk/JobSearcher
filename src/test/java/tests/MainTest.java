package tests;

import org.testng.annotations.Test;
import utils.FilesWriter;

import java.io.IOException;

public class MainTest extends BaseTest {

    @Test (description = "Input parameters of job seeker", priority = 1)
    public void findJob() throws IOException {
        mainSteps.findJob();
        advancedSteps
                .openParameters()
                .keyWords(FilesWriter.readFromFile(0))
                .setSchedule(FilesWriter.readFromFile(4))
                .setSalary(FilesWriter.readFromFile(1), FilesWriter.readFromFile(2))
                .setExperience(FilesWriter.readFromFile(3))
                .setTypeOfEmployment(FilesWriter.readFromFile(5))
                .vacPeriod(FilesWriter.readFromFile(6))
                .approve();
    }

    @Test (description = "Getting the appropriate list of job for user", priority = 2)
    public void getListOfJobs() throws IOException {
        resultsSteps
                .openResults()
                .getVacInfo();
    }

}
