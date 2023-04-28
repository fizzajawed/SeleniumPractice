package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

//    private By formAuthenticationLink = By.linkText("Form Authentication");
      private By formAuthenticationLink = By.linkText("Form Authentication");
      private WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public LoginPage ClickFormAuthentication()
    {
     // driver.findElement(formAuthenticationLink).click();
        ClickLink("Form Authentication");
        return new LoginPage(driver);
    }

    private void ClickLink(String LinkText)   // generic method for all links
    {
        driver.findElement(By.linkText(LinkText)).click();
    }
    public DropdownPage ClickDropDown()
    {
        ClickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHover()
    {
        ClickLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPage KeyPress()
    {
        ClickLink("Key Presses");
        return new KeyPage(driver);
    }
    public AlertsPage ClickJavaScriptAlerts()
    {
        ClickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public FileUploadPage ClickFileUpload()
    {
        ClickLink("File Upload");
        return new FileUploadPage(driver);
    }


    public WysiwgEditorPage clickWysiwgEditor()
    {
        ClickLink("WYSIWYG Editor");
        return new WysiwgEditorPage(driver);
    }















}
