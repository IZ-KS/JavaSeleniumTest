package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.time.Month;
import java.util.Calendar;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate(){
        String month = "December";
        String monthNumber ="12";
        String day = "31";
        String year = "2030";

        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate,expectedDate,
                "\n Actual and expected date do not match " +
                "\n Actual Date: " + actualDate +
                "\n Expected Date " + expectedDate);

    }
}
