package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage {

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    private static final By IFRAME = By.id("mce_0_ifr");
    private static final By TEXT_IN_IFRAME = By.xpath("//*[contains (text(),'Your content goes here.')]//ancestor::*[@id='tinymce']//p");

    public String getTextInsideIFrame() {
        driver.switchTo().frame(driver.findElement(IFRAME));
        return driver.findElement(TEXT_IN_IFRAME).getText();
    }
}
