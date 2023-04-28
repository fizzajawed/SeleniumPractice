package DropDown;

import base.Basetest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends Basetest {



    @Test
    public void testSelectOption()


    {

        String option = "Option 1";
        var DropDPage=homePage.ClickDropDown();
        DropDPage.SelectFromDropDown("Option 1");
        var selectedOptions = DropDPage.GetSelectedOptions();
        assertEquals(selectedOptions.size(),1 , "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");




    }
}
