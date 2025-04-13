package part3_4.com.demoqa.tests.part3.widgets;


import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;


public class SelectDropDownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown() throws InterruptedException {

        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");
        Thread.sleep(2000);
        selectMenuPage.selectStandardMulti(1);
        Thread.sleep(2000);
        selectMenuPage.selectStandardMulti("Audi");
        Thread.sleep(2000);
        selectMenuPage.selectStandardMulti(2);
        Thread.sleep(2000);

        selectMenuPage.deselectStandardMulti("saab");
        List<String> actualSelectedOptions =
                selectMenuPage.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"));
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));
    }



}
