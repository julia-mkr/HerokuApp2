package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage extends BasePage {

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    private static final By CHECKBOX_INPUT = By.xpath("//*[@type='checkbox']");
    private static final By REMOVE_BUTTON = By.xpath("//*[contains (text(),'Remove')]//ancestor::*[@id='checkbox-example']/button");

    private static final By INPUT_FIELD = By.xpath("//*[@type='text']");
    private static final By ENABLE_BUTTON = By.xpath("//*[@type='button']//ancestor::*[@id='input-example']//button");

    public void clickOnCheckbox() {
        driver.findElement(CHECKBOX_INPUT).click();
    }

    public void clickOnRemoveButton() {
        driver.findElement(REMOVE_BUTTON).click();
    }

    public void clickOnEnableButton() {
        driver.findElement(ENABLE_BUTTON).click();
    }

    public boolean isInputFieldDisabled() {
        return driver.findElement(INPUT_FIELD).isDisplayed();
    }

    public boolean isInputFieldEnabled() {
        return driver.findElement(INPUT_FIELD).isEnabled();
    }
}
