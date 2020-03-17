package tests;

import org.testng.annotations.Test;

public class MainTest extends BaseTest {

    @Test
    public void findJob() {
        mainSteps.findJob();
        advancedSteps
                .openParameters()
                .sendKeyWords()
                .setSchedule()
                .setSalary()
                .setExperience()
//                .chooseProf()
//                .chooseIndustry()
                .setTypeOfEmpl()
                .vacPeriod()
                .approve();
    }

}
