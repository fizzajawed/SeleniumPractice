package Keys;

import base.Basetest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class KeyPress extends Basetest {


    @Test
//    public  void testbackspace()
//
//    {
//           var key=homePage.KeyPress();
//           key.entertext("A"+ Keys.BACK_SPACE);
//           assertEquals(key.getResult(),"You entered: BACK_SPACE");
//    }
    public void testPi(){
        var key=homePage.KeyPress();
        key.enterPi();
     }








}
