package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    private static final String CONTEXT_MENU_URL = INTERNET_HEROKUAPP_URL + "/context_menu";
    private static final String EXPECTED_ALERT_MESSAGE_TEXT = "You selected a context menu";

    @Test
    public void checkAlertMessageTextTest() {
        contextMenuPage.openPage(CONTEXT_MENU_URL);
        contextMenuPage.doRightClickInsideDashedBox();
        Assert.assertEquals(contextMenuPage.getAlertMessageText(), EXPECTED_ALERT_MESSAGE_TEXT);
    }

    @Test
    public void closeAlertWindowTest() {
        contextMenuPage.openPage(CONTEXT_MENU_URL);
        contextMenuPage.doRightClickInsideDashedBox();
        contextMenuPage.closeAlertWindow();
        Assert.assertFalse(contextMenuPage.isAlertWindowPresent());
    }
}
