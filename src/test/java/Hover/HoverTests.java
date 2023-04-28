package Hover;

import base.Basetest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class HoverTests extends Basetest {

@Test
    public void HoverUser1()
{
    var hoversPage=homePage.clickHover();
    var caption= hoversPage.hoverOverFigure(1);

    assertTrue(caption.IsCaptionDisplayed(), "Caption not displayed");
    assertEquals(caption.getTitle(), "name: user1");
    assertEquals(caption.getLinkText(), "View profile");
    assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
}





}
