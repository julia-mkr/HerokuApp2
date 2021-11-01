package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    ContextMenuPage contextMenuPage;
    FileUploadPage fileUploadPage;
    FramesPage framesPage;
    DynamicControlsPage dynamicControlsPage;

    public static final String INTERNET_HEROKUAPP_URL = "http://the-internet.herokuapp.com";

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        contextMenuPage = new ContextMenuPage(driver);
        fileUploadPage = new FileUploadPage(driver);
        framesPage = new FramesPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
}
