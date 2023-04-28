package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By status = By.id("flash");

    public SecureAreaPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public String GetAlertText()
    {
       return driver.findElement(status).getText();
    }










}
