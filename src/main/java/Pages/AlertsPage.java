package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By results = By.id("result");
    private By triggerConfrimButton=By.xpath(".//button[text()='Click for JS Confirm']");
    private By TriggerPrompt= By.xpath(".//button[text()='Click for JS Prompt']");

    public AlertsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public  void triggerAlert()
    {
        driver.findElement(triggerAlertButton).click();
    }

    public void alert_ClickToAccept()
    {
        driver.switchTo().alert().accept();
    }

    public String getResult()
    {
        return driver.findElement(results).getText();
    }


    public void triggerConfirm()
    {
        driver.findElement(triggerConfrimButton).click();
    }

    public void triggerPrompt()
    {
        driver.findElement(TriggerPrompt).click();
    }

    public void alert_clickToDismiss()
    {
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText()
    {
        return driver.switchTo().alert().getText();
    }

    public  void alert_setInput(String text)
    {
        driver.switchTo().alert().sendKeys(text);
    }


}







