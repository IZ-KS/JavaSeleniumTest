package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static utilities.GetUtility.*;
import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.*;

public class DynamicPropertiesPage extends ElementsPage{

    private By visibleAfterButton = By.id("visibleAfter");
    private By colorChangeButton = By.id("colorChange");
    private By enableAfterButton = By.id("enableAfter");
    String  colorButtonChangeText = driver.findElement(colorChangeButton).getCssValue("color");


    public String getVisibleAfterButtonText(){
        explicitWaitUntilVisible(5, visibleAfterButton);
        String visibleText =  getText(visibleAfterButton);
        System.out.println("Button Text: " + visibleText);
        return visibleText;
    }

    public String getColorChangeButton(){
        explicitWaitUntilVisible(10,colorButtonChangeText);
        String colorText = driver.findElement(colorChangeButton).getCssValue("color");
        System.out.println("Button Text: " + colorText);
        return colorText;
    }


    public Boolean checkEnableButton(){
        explicitWaitUntilVisible(10, enableAfterButton);
        //System.out.println("Button Text" + getText(enableAfterButton));
        return find(enableAfterButton).isEnabled();
    }


}
