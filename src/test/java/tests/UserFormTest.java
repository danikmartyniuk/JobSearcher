package tests;

import org.testng.annotations.Test;

import java.io.IOException;

public class UserFormTest extends BaseGui {

    @Test
    public void getUserAnswers () throws IOException {
        jPaneSteps.getAnswers();
    }

}
