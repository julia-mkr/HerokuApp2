package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    private static final String DYNAMIC_CONTROLS_URL = "http://the-internet.herokuapp.com/dynamic_controls";

    @Test
    public void checkWhetherCheckboxIsDisappearedTest() {
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_URL);
        dynamicControlsPage.clickOnCheckbox();
        dynamicControlsPage.clickOnRemoveButton();
        Assert.assertTrue(dynamicControlsPage.isCheckboxDisplayed());
    }

    @Test
    public void checkWhetherInputFieldDisabledTest() {
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_URL);
        Assert.assertFalse(dynamicControlsPage.isInputFieldDisabled());
    }

    @Test
    public void checkWhetherInputFieldEnabledTest() {
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_URL);
        dynamicControlsPage.clickOnEnableButton();
        Assert.assertTrue(dynamicControlsPage.isInputFieldEnabled());
    }
}
