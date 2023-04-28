package base;

import Pages.HomePage;
import jdk.dynalink.beans.StaticClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.WindowsManager;

import java.util.List;

//import static sun.security.util.Debug.args;


public class Basetest {

    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        gohome();
    }

    @BeforeMethod
    public void gohome(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }


        //driver.close();
//        System.out.println(driver.getTitle());
//        List<WebElement> links=driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//        WebElement input = driver.findElement(By.linkText("Shifting Content"));
//        input.click();
//        driver.findElement(By.linkText("Example 1: Menu Element")).click();
//        List<WebElement> list= driver.findElements(By.tagName("a"));
//        System.out.println(list.size());

//    @AfterClass
////    public void tearDown(){
//        driver.quit();
////    }

public  WindowsManager GetWindowsManager()
{
return new WindowsManager(driver);
}



    }



