package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;


public class DropdownUtility  extends Utility{

    private static Select findDropdown(By locator){
        return new Select(driver.findElement(locator));
    }

    public static void selectByVisibleText(By locator, String text){
        findDropdown(locator).selectByVisibleText(text);
    }

    public static void selectByIndex(By locator, int index){
        findDropdown(locator).selectByIndex(index);
    }

    public static void selectByValue(By locator, String value){
        findDropdown(locator).selectByValue(value);
    }

    public static void deSelectByValue(By locator, String value){
        findDropdown(locator).deselectByValue(value);
    }

    public static List<String> getAllSelectedOptions(By locator){
        List<WebElement> allSelectedOption =
                findDropdown(locator).getAllSelectedOptions();
        return allSelectedOption.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}
