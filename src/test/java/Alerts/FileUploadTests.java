package Alerts;

import base.Basetest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.reporters.jq.BasePanel.C;

public class FileUploadTests extends Basetest {

    @Test
    public void testfileupload() {
        var uploadpg = homePage.ClickFileUpload();
        uploadpg.uploadFile("C:\\Users\\SpurSol-Fizza\\IdeaProjects\\WEB_DRIVER\\resources\\chromedriver.exe");
        assertEquals(uploadpg.getUploadedFiles(), "chromedriver.exe");
    }
}
