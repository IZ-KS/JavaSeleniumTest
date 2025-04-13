package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.util.Set;

import static utilities.JavaScriptUtility.*;
import static utilities.SwitchToUtility.*;

public class LinksPage extends ElementsPage{

    private By badRequestLink = By.id("bad-request");
    private By responseLink = By.id("linkResponse");
    private By simpleLink = By.id("simpleLink");
    private By simpleLinkWebsite = By.xpath("//header/a");
    //*[@id="app"]/header/a

    public void clickBadRequestLink(){
        scrollToElementJS(badRequestLink);
        click(badRequestLink);
    }

    public String getResponse(){
        delay(2000);
        return find(responseLink).getText();
    }

    public void clickSimpleLink(){
        scrollToElementJS(simpleLink);
        click(simpleLink);
    }

    public void switchToNewTab(){
        //Step 1: Get the Current "Main" Tab Handle
        String currentHandle = driver.getWindowHandle();
        System.out.println("Main Current ID: " + currentHandle + "\n");

        //Step 2: Get All Tab Handles
        Set<String> allHandles =  driver.getWindowHandles();
        System.out.println("# of Open Tab: " + allHandles.size());

        for (String handle: allHandles){
            if(currentHandle.equals(handle)){
                System.out.println("1st Tab ID: " + handle);
            }else{
                switchToWindowOrTab(handle);
                //driver.switchTo().window(handle);
                System.out.println("2nd Tab ID: " + handle);
            }
        }

        //Step 3: Switch to the New Window Using Window Handle
    }

}
