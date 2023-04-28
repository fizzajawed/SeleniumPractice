package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputfield= By.id("file-upload");
    private By uploadButton=By.id("file-submit");
    private  By UploadedFiles= By.id("uploaded-files");

    public FileUploadPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public  void ClickUploadButton()
    {
        driver.findElement(uploadButton).click();

    }

    public void uploadFile(String absolutePathOfFile)
    {
        driver.findElement(inputfield).sendKeys(absolutePathOfFile);
        ClickUploadButton();
    }
    public String getUploadedFiles()
    {
        return driver.findElement(UploadedFiles).getText();
    }

}
