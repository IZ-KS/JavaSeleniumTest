package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import static utilities.ActionsUtility.*;
import static utilities.JavaScriptUtility.*;

public class ButtonMenuPage extends ElementsPage{

        private By doubleClickButton = By.id("doubleClickBtn");
        private By doubleClickMessage = By.id("doubleClickMessage");
        private By rightClickButton = By.id("rightClickBtn");
        private By rightClickMessage = By.id("rightClickMessage");
        private By clickMeButton = By.xpath("//div/button[text()='Click Me']");
        private By clickMeMessage = By.id("dynamicClickMessage");

        public String getDoubleClickMessage(){
            return find(doubleClickMessage).getText();
        }

        public void clickDoubleButton(){
            scrollToElementJS(doubleClickButton);
            doubleClick(find(doubleClickButton));
        }

    public String getRightClickMessage(){
        return find(rightClickMessage).getText();
    }

    public void rightClickButton(){
        scrollToElementJS(rightClickButton);
        rightClick(find(rightClickButton));
    }

    public void dynamicClickButton(){
        scrollToElementJS(clickMeButton);
        click(clickMeButton);
    }

    public String getClickMeMessage(){
        return find(clickMeMessage).getText();
    }


}
