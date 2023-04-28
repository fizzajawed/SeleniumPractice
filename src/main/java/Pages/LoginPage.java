package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
   private WebDriver driver;
   private By UsernameField = By.id("username");
   private By passwordField = By.id("password");
   private By LoginBtn =  By.cssSelector("#login button");


   public LoginPage(WebDriver driver)
   {
       this.driver = driver;
   }

   public void SetUsername(String username)
   {
       driver.findElement(UsernameField).sendKeys(username);
   }

   public  void SetPassword(String password)
   {
       driver.findElement(passwordField).sendKeys(password);
   }

   public SecureAreaPage clickLoginButton()
   {
       driver.findElement(LoginBtn).click();
       return new SecureAreaPage (driver);
   }


}
