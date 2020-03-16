package tests;

import org.testng.annotations.Test;

public class MainTest extends BaseTest {

    @Test
    public void findJob() {
        mainSteps.findJob();
        advancedSteps.setParameters();
    }

}
