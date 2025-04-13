package part3_4.com.demoqa.tests.part4.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;


public class DynamicWaitTests extends BaseTest {

    @Test
    public void testVisibleAfterButtonText(){
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText,
                "\n Actual and Expected Text do not match");
    }

    @Test
    public void testColorChangeButtonText(){
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String expectedColor = "rgba(220, 53, 69, 1)";
        String actualColor = dynamicPage.getColorChangeButton();
        Assert.assertEquals(actualColor, expectedColor,
                "\n Color do not match\n");

    }

    @Test
    public void testEnableButton(){
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        //dynamicPage.clickEnableButton();
        boolean enableButtonClick = dynamicPage.checkEnableButton();
        Assert.assertTrue(enableButtonClick,
                "\nButton is not enable\n");

    }

    @Test
    public void testProgressBar(){
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";
        Assert.assertEquals(actualValue,expectedValue,
                "\n Value Is Not 100%");
    }
}
