package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest {

    private static final String FRAMES_URL = INTERNET_HEROKUAPP_URL + "/iframe";
    private static final String EXPECTED_TEXT_IN_IFRAME = "Your content goes here.";

    @Test
    public void checkTextInsideIFrame() {
        framesPage.openPage(FRAMES_URL);
        Assert.assertEquals(framesPage.getTextInsideIFrame(), EXPECTED_TEXT_IN_IFRAME);
    }
}
