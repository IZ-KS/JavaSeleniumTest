package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.DropdownUtility.*;

public class DatePickerMenuPage extends WidgetsPage{

    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropdown = By.className("react-datepicker__month-select");
    private By yearDropdown = By.cssSelector(".react-datepicker__year-select");


    private By dayValue(String day){
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
    }

    public void clickDay(String day){
//        By dayValue = By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
//        click(dayValue);
        click(dayValue(day));
    }

    public boolean isDayInMonth(String day){
//        By dayValue = By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
//        return find(dayValue).isDisplayed();
        return find(dayValue(day)).isDisplayed();
    }
    public void clickSelectDate(){
        click(selectDateField);
    }

    public String getDate(){
        return find(selectDateField).getDomAttribute("value");
    }

    public void selectMonth(String month){
        selectByVisibleText(monthDropdown, month);
    }

    public void selectYear(String year){
        selectByVisibleText(yearDropdown, year);
    }
}
