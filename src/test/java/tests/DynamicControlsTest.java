package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    private static final String DYNAMIC_CONTROLS_URL = INTERNET_HEROKUAPP_URL + "/dynamic_controls";

    @Test
    public void checkWhetherCheckboxDisappearedTest() {
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
