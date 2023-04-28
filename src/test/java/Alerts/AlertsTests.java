package Alerts;

import Pages.HomePage;
import base.Basetest;
import org.testng.annotations.Test;

import static java.awt.SystemColor.text;
import static org.testng.AssertJUnit.assertEquals;

public class AlertsTests extends Basetest {
    @Test
    public void TestAcceptAlert()
    {
        var AlertsPg= homePage.ClickJavaScriptAlerts();
        AlertsPg.triggerAlert();
        AlertsPg.alert_ClickToAccept();
        assertEquals(AlertsPg.getResult(), "You successfully clicked an alert");
    }


    @Test
    public void testGetTextFromAlert(){

        var alertsPage = homePage.ClickJavaScriptAlerts();
        alertsPage.triggerConfirm();

        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();

        assertEquals(text, "I am a JS Confirm");
    }

    @Test
    public void testSetInputAlert()
    {
        var alertspg= homePage.ClickJavaScriptAlerts();
        String text = "TAU rocks!";
        alertspg.triggerPrompt();
        alertspg.alert_setInput("TAU rocks!");
        alertspg.alert_ClickToAccept();
        assertEquals(alertspg.getResult(),"You entered: "+text);



    }
}
