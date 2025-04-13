package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility extends Utility{

    private static Actions act(){
        return new Actions(driver);
    }

    public static void dragAndDropBy(WebElement source, int x, int y){
        act().dragAndDropBy(source, x, y).perform();
    }

    public static void sendKeys(WebElement source,CharSequence keys){
        act().sendKeys(source, keys).perform();
    }

    public static void doubleClick(WebElement source){
        act().doubleClick(source).perform();
    }

    public static void rightClick(WebElement source){
        act().contextClick(source).perform();
    }

    public static void hoverBy(WebElement source){
        act().moveToElement(source).perform();
    }

}
