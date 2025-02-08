package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static ultilities.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends ElementsPage{
    private By badReqLink = By.id("bad-request");
    private By unauthRequestLink = By.id("unauthorized");
    private By responseLink = By.id("linkResponse");

    public void clickBadRequestLink(){
        scrollToElementJS(badReqLink);
        click(badReqLink);
    }

    public void clickUnAuthRequestLink(){
        click(unauthRequestLink);
    }



    public String getResponse(){
        delay(2000);
        return find(responseLink).getText();
    }

}
