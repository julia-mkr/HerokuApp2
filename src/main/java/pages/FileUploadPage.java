package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    private static final By CHOOSE_FILE_INPUT = By.xpath("//*[@id='file-upload']");
    private static final By UPLOAD_BUTTON = By.xpath("//*[@id='file-submit']");
    private static final By UPLOADED_FILE = By.xpath("//*[@id='uploaded-files']");

    public void chooseFile(String pathToFile) {
        driver.findElement(CHOOSE_FILE_INPUT).sendKeys(pathToFile);
    }

    public void clickOnUploadButton() {
        driver.findElement(UPLOAD_BUTTON).click();
    }

    public String getNameOfUploadedFile() {
        return driver.findElement(UPLOADED_FILE).getText();
    }
}
