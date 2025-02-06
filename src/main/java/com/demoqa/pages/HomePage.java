package com.demoqa.pages;

import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;

import static ultilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formscard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    //opens form page
    public FormsPage goToForms(){
        scrollToElementJS(formscard);
        click(formscard);
        return new FormsPage();
    }



}
