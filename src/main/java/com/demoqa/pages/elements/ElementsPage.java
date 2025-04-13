package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {

    private By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']//span[text()='Links']");
    private By dynamicPropertiesMenuItem = By.xpath("//li[@id='item-8']/span[text()='Dynamic Properties']");
    private By textBoxMenuItem = By.xpath("//li[@id='item-0']/span[text()='Text Box']");
    private By checkBoxMenuItem = By.xpath("//li[@id='item-1']/span[text()='Check Box']");
    private By buttonMenuItem = By.xpath("//li[@id='item-4']/span[text()='Buttons']");


    public ButtonMenuPage clickButtonItem(){
        scrollToElementJS(buttonMenuItem);
        click(buttonMenuItem);
        return new ButtonMenuPage();
    }


    public CheckBoxPage clickCheckBox(){
        scrollToElementJS(checkBoxMenuItem);
        click(checkBoxMenuItem);
        return new CheckBoxPage();
    }
    public TextBoxPage clickTextBox(){
        scrollToElementJS(textBoxMenuItem);
        click(textBoxMenuItem);
        return new TextBoxPage();
    }

    public DynamicPropertiesPage clickDynamicProperties(){
        scrollToElementJS(dynamicPropertiesMenuItem);
        click(dynamicPropertiesMenuItem);
        return new DynamicPropertiesPage();
    }

    public WebTablesPage clickWebTables(){
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks(){
        click(linksMenuItem);
        return new LinksPage();
    }



}
