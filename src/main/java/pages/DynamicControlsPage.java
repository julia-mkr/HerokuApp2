package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage extends BasePage {

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    private static final By CHECKBOX_INPUT = By.xpath("//*[@type='checkbox']");
    private static final By REMOVE_BUTTON = By.xpath("//*[contains (text(),'Remove')]//ancestor::*[@id='checkbox-example']/button");
    private static final By MESSAGE_TEXT = By.id("message");
    private static final By INPUT_FIELD = By.xpath("//*[@type='text']");
    private static final By ENABLE_BUTTON = By.xpath("//*[@type='button']//ancestor::*[@id='input-example']//button");

    public void clickOnCheckbox() {
        driver.findElement(CHECKBOX_INPUT).click();
    }

    public void clickOnRemoveButton() {
        driver.findElement(REMOVE_BUTTON).click();
        waitForElementLocated(MESSAGE_TEXT, 5);
    }

    public boolean isCheckboxDisplayed() {
        return driver.findElements(CHECKBOX_INPUT).size() < 1;
    }

    public void clickOnEnableButton() {
        driver.findElement(ENABLE_BUTTON).click();
        waitForElementLocated(MESSAGE_TEXT, 5);
    }

    public boolean isInputFieldDisabled() {
        System.out.println(driver.findElement(INPUT_FIELD).isEnabled());
        return driver.findElement(INPUT_FIELD).isEnabled();
    }

    public boolean isInputFieldEnabled() {
        return driver.findElement(INPUT_FIELD).isEnabled();
    }
}
