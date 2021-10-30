package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    private static final String CONTEXT_MENU_URL = "http://the-internet.herokuapp.com/context_menu";
    private static final String EXPECTED_ALERT_MESSAGE_TEXT = "You selected a context menu";

    @Test
    public void checkAlertMessageTextTest() {
        contextMenuPage.openPage(CONTEXT_MENU_URL);
        contextMenuPage.doRightClickInsideDashedBox();
        Assert.assertEquals(contextMenuPage.getAlertMessageText(), EXPECTED_ALERT_MESSAGE_TEXT);
        contextMenuPage.closeAlertWindow();
    }

    // TODO think up how to assert that the popup isn't displayed
}
