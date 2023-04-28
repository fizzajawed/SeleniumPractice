package Navigation;

import Pages.HomePage;
import base.Basetest;
import org.testng.annotations.Test;
import utils.WindowsManager;

public class NavigationTests extends Basetest {


    @Test
    public void testnavigator()
    {
        homePage.ClickDropDown();
        GetWindowsManager().goback();
        
    }
}
