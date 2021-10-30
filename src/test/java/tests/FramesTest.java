package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest {

    private static final String FRAMES_URL = "http://the-internet.herokuapp.com/iframe";
    private static final String EXPECTED_TEXT_IN_IFRAME = "Your content goes here.";

    @Test
    public void checkTextInsideIFrame() {
        framesPage.openPage(FRAMES_URL);
        Assert.assertEquals(framesPage.getTextInsideIFrame(), EXPECTED_TEXT_IN_IFRAME);
    }
}
