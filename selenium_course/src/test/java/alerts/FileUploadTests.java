package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUploadPage();
        uploadPage.uploadFile("C:\\Users\\Luan\\Desktop\\TAU\\selenium_course\\resources\\PIX-PNG.png");
        assertEquals(uploadPage.getUploadedFiles(), "PIX-PNG.png", "Uploaded Wrong files!");
        uploadPage.clickUploadButton();
    }
}
