package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    private static final By DASHED_BOX = By.xpath("//*[@id='hot-spot']");

    public void doRightClickInsideDashedBox() {
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(DASHED_BOX)).perform();
    }

    public String getAlertMessageText() {
        return driver.switchTo().alert().getText();
    }

    public void closeAlertWindow() {
        driver.switchTo().alert().accept();
    }

    public boolean isAlertWindowPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException Ex) {
            return false;
        }
    }
}
