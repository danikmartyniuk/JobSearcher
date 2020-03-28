package tests;

import org.testng.annotations.BeforeClass;
import steps.JPaneSteps;

import javax.swing.*;

public class BaseGui {

    JPaneSteps jPaneSteps;

    @BeforeClass
    public void setUp () {
        JOptionPane.showMessageDialog(null, "Добрый день! Следуйте всем правилам, пожалуйста, и будем тогда жить дружно! <3");
        jPaneSteps = new JPaneSteps();
    }
}
