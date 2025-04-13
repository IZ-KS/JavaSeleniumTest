package part3_4.com.demoqa.tests.part3.elements;

import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.GetUtility.getURL;

public class LinksTest extends BaseTest {

    @Test
    public void testLinks(){
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickBadRequestLink();
        String actualResponse = linksPage.getResponse();

        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
                "\n Actual Response (" + actualResponse + " \n Does not contain '400' and 'Bad Request'");

//        Assert.assertFalse(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
//                "\n Actual Response (" + actualResponse + " \n Does not contain '400' and 'Bad Request'");
    }

    @Test
    public void testClickSimpleLink(){
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickSimpleLink();
        linksPage.switchToNewTab();
        String actualURL = getURL();
        System.out.println("The weblink is: " + actualURL);
        String expectedLink = "https://demoqa.com/";
        Assert.assertEquals(actualURL,expectedLink,
                "Actual and Expected Links are not match");
    }
}
