package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.ActionsUtility.*;
import static utilities.JavaScriptUtility.*;
import static utilities.WaitUtility.*;

public class CheckBoxPage extends ElementsPage{

    private By homeCheckBox = By.xpath("//ol/li/span/label/input[@id='tree-node-home']");
    //private By homeCheckBoxID = By.id("tree-node-home");
    private By checkBoxResult = By.id("result");
    private By parentHomeToggleButton = By.xpath("//div[@id='tree-node']/ol/li/span/button");
    private By desktopCheckBox = By.xpath("//div[@id='tree-node']/ol/li/ol/li/span/label/input[@id='tree-node-desktop']");
    private By desktopTextCheckBox = By.xpath("//div[@id='tree-node']/ol/li/ol/li/span/label/span[text()='Desktop']");

    public void clickHomeCheckBox(){
        scrollToElementJS(homeCheckBox);
        clickJS(homeCheckBox);
    }

    public void clickHomeToggleButton(){
        scrollToElementJS(parentHomeToggleButton);
        clickJS(parentHomeToggleButton);
    }

    public String getCheckBoxTextResult (){
        return find(checkBoxResult).getText();
    }

    public boolean isCheckBoxChecked(){
        return find(homeCheckBox).isSelected();
    }

    public boolean isDesktopCheckBoxDisplayed(){
        return find(desktopTextCheckBox).isDisplayed();
    }


}
