package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ButtonTest extends BaseTest {

    @Test
    public void testDoubleClickButton(){
        var buttonPage = homePage.goToElements().clickButtonItem();
        buttonPage.clickDoubleButton();
        String actualResult = buttonPage.getDoubleClickMessage();
        String expectedResult = "You have done a double click";
        Assert.assertEquals(actualResult, expectedResult,
                "\n Actual and Expected Result are not match\n");
    }

    @Test
    public void testRightClickButton(){
        var buttonPage = homePage.goToElements().clickButtonItem();
        buttonPage.rightClickButton();
        String actualResult = buttonPage.getRightClickMessage();
        String expectedResult = "You have done a right click";
        Assert.assertEquals(actualResult, expectedResult,
                "\n Actual and Expected Result are not match\n");
    }

    @Test
    public void testClickButton(){
        var buttonPage = homePage.goToElements().clickButtonItem();
        buttonPage.dynamicClickButton();
        String actualResult = buttonPage.getClickMeMessage();
        String expectedResult = "You have done a dynamic click";
        Assert.assertEquals(actualResult, expectedResult,
                "\n Actual and Expected Result are not match\n");
    }
}
