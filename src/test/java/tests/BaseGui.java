package tests;

import org.testng.annotations.BeforeClass;
import steps.JPaneSteps;
import utils.FilesWriter;

import javax.swing.*;
import java.io.IOException;

public class BaseGui {

    JPaneSteps jPaneSteps;

    @BeforeClass
    public void setUp () throws IOException {
        FilesWriter.cleanFile("jobresults.txt");
        JOptionPane.showMessageDialog(null, "Добрый день! Следуйте всем правилам, пожалуйста, и будем тогда жить дружно! <3");
        jPaneSteps = new JPaneSteps();
    }

}
