package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FormCheckboxTest extends BaseTest {

    @Test
    public void testHobbyCheckbox(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickHobbyCheckbox();
        formsPage.unclickHobbyCheckbox();
        boolean isHobbyCheckboxClick = formsPage.isCheckboxUnclick();
        Assert.assertFalse(isHobbyCheckboxClick,"\n Reading Checkbox is not selected\n");
    }

}
