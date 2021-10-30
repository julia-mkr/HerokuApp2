package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

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
}
