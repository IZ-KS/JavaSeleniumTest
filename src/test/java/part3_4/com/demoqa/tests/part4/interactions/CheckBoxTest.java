package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckBoxTest extends BaseTest {

    @Test
    public void testHomeCheckBox(){

        var checkBoxPage = homePage.goToElements().clickCheckBox();
        checkBoxPage.clickHomeCheckBox();
        String actualCheckBoxResult =checkBoxPage.getCheckBoxTextResult();
        Assert.assertTrue(actualCheckBoxResult.contains("home"),
                "\n Actual Result Does Not Contain Home\n");
        boolean checkBoxChecked = checkBoxPage.isCheckBoxChecked();
        Assert.assertTrue(checkBoxChecked,
                "\n Home Checkbox is not checked\n");
    }


    @Test
    public void testDesktopCheckBoxDisplayed(){
        var checkBoxPage = homePage.goToElements().clickCheckBox();
        checkBoxPage.clickHomeToggleButton();
        boolean desktopCheckBoxDisplayed = checkBoxPage.isDesktopCheckBoxDisplayed();
        Assert.assertTrue(desktopCheckBoxDisplayed,
                "\n Desktop Checkbox is not Displayed");

    }
}
