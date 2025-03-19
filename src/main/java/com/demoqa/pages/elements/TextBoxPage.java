package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static ultilities.ActionsUtility.sendKeys;
import static ultilities.GetUtility.getText;
import static ultilities.JavaScriptUtility.scrollToElementJS;
import static ultilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage{

    private By fullNameField = By.id("userName");
    private By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    private By submitButton = By.id("submit");
    private By currentAddressResult = By.xpath("//p[@id='currentAddress']");

    public void setFullName(String name){
        scrollToElementJS(fullNameField);
        //send keys from the actions class
        sendKeys(find(fullNameField), Keys.chord(name));
    }

    public void setEmail(String email){
        setFullName(Keys.chord(Keys.TAB, email));
    }

    public void setCurrentAddress(String currentAddress){
        //setEmail(Keys.chord(Keys.TAB, currentAddress + Keys.ENTER));
        find(currentAddressField).sendKeys(currentAddress + Keys.ENTER);
    }

    public void clickSubmitButton(){
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public String getCurrentAddress(){
        explicitWaitUntilVisible(5, currentAddressResult); // wait 5 seconds
        return getText(currentAddressResult);
    }
}
