package part3_4.com.demoqa.tests.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FramesTest extends BaseTest {

    @Test
    public void testFramesBigBox(){
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualBigBoxText = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";

        Assert.assertEquals(actualBigBoxText, expectedBigBoxText,
                "\n Actual BigBox Text and Expected BigBox Text Do Not Match \n");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText,expectedHeaderText,
                "\n Actual and Expected Header Text Do Not Match");
    }

    @Test
    public void testFramesSmallBox(){
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualSmallBoxText = framesPage.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";

        Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText,
                "\n Actual SmallBox Text and Expected SmallBox Text Do Not Match \n");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText,expectedHeaderText,
                "\n Actual and Expected Header Text Do Not Match");
    }


}
