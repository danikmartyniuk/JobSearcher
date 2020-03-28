package steps;

import io.qameta.allure.Step;
import pages.JPaneMethods;

import java.io.IOException;

public class JPaneSteps {

    JPaneMethods jPaneMethods;

    public JPaneSteps () {
        jPaneMethods = new JPaneMethods();
    }

    @Step
    public void getAnswers () throws IOException {
        jPaneMethods
                .getKeyWords()
                .getMinSalary()
                .needSalary()
                .getExp()
                .setSchedule()
                .setTypesOfEmpl()
                .setVacanciesAge();
    }
}
