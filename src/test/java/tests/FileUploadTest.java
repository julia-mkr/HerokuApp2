package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

    private static final String FILE_UPLOAD_URL = INTERNET_HEROKUAPP_URL + "/upload";
    private static final String EXPECTED_FILE_NAME = "image.jpg";

    @Test
    public void uploadFileTest() {
        fileUploadPage.openPage(FILE_UPLOAD_URL);
        fileUploadPage.chooseFile("C:\\Users\\Julie\\Desktop\\HerokuApp2\\image.jpg");
        fileUploadPage.clickOnUploadButton();
        Assert.assertEquals(fileUploadPage.getNameOfUploadedFile(), EXPECTED_FILE_NAME);
    }
}
