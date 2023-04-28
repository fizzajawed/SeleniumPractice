package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwgEditorPage {
    private WebDriver driver;
    public  String EditorFrameID = "mce_0_ifr";
    private By textarea= By.id("tinymce");


    public WysiwgEditorPage(WebDriver driver)
    {
        this.driver=driver;
    }

    private void ClearTextArea()
    {   SwitchToEditArea();
        driver.findElement(textarea).clear();
        SwitchToMainArea();
    }

    private void  SwitchToEditArea()
    {
        driver.switchTo().frame(EditorFrameID);
    }

    private void SwitchToMainArea()
    {
        driver.switchTo().parentFrame();
    }




}
