package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;

public class SwitchToUtility extends Utility{

    private static WebDriver.TargetLocator switchTo(){
        return driver.switchTo();
    }

    public static String getAlertText(){
        return switchTo().alert().getText();
    }

    public static void acceptAlert(){
        switchTo().alert().accept();
    }

    public static void dismissAlert( ){
        switchTo().alert().dismiss();
    }

    public static void setAlertText(String text){
        switchTo().alert().sendKeys(text);
    }

    public static void switchToFrameString(String value){
        switchTo().frame(value);
    }

    public static void switchToDefaultContent(){
        switchTo().defaultContent();
    }

    public static void switchToFrameIndex(int index){
        switchTo().frame(index);
    }

    public static void switchToFrameElement(WebElement element){
        switchTo().frame(element);
    }

    //this can be used for Windows and Tabs
    public static void switchToWindowOrTab(String handle){
        switchTo().window(handle);
    }

    public void switchToNewTab() {
        switchTo().newWindow(WindowType.TAB);

    }
}
