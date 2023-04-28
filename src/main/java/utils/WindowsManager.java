package utils;

import org.openqa.selenium.WebDriver;

public class WindowsManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowsManager(WebDriver driver)
    {
      navigate=driver.navigate();
    }

    public  void goback()
    {
        driver.navigate().back();
    }

    public  void goForward()
    {
        driver.navigate().forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }
}
