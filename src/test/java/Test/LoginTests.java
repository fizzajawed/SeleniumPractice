package Test;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.Basetest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginTests extends Basetest {
    @Test
    public void testSuccessfulLogin()
    {

        LoginPage loginpage=homePage.ClickFormAuthentication();
        loginpage.SetUsername("tomsmith");
        loginpage.SetPassword("SuperSecretPassword!");
        SecureAreaPage secureareapage=loginpage.clickLoginButton();
        assertTrue(secureareapage.GetAlertText()
                        .contains("You logged into a secure area!"),
                "Alert text is incorrect");


    }


}
