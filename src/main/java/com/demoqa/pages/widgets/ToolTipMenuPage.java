package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.ActionsUtility.*;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class ToolTipMenuPage extends WidgetsPage{

    private By greenButtonHoverMeToSee =By.id("toolTipButton");
    WebElement greenButtonHoverMessage = driver.findElement(greenButtonHoverMeToSee);

    public void hoverGreenButtonToSee(){
        scrollToElementJS(greenButtonHoverMeToSee);
        hoverBy(greenButtonHoverMessage);
    }
}
