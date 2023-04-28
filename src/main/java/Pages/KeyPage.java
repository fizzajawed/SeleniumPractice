package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPage {
    private WebDriver driver;
    private By InputField= By.id("target");
    private By resultText = By.id("result");



    public KeyPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void entertext(String text)
    {
        driver.findElement(InputField).sendKeys(text);

    }
   public String getResult()
   {
       return driver.findElement(resultText).getText();
   }
    public void enterPi(){
        entertext(Keys.chord(Keys.ALT, "p") + "=3.14");
    }


}
