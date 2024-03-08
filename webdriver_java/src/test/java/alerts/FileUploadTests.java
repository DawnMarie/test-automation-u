package alerts;

import static org.testng.Assert.assertEquals;

import base.BaseTests;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile(
                "C:\\Users\\dunnd\\Documents\\githome\\test-automation-u\\webdriver_java\\resources\\msedgedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "msedgedriver.exe", "Upload not successful");
    }

}
