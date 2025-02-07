package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static ultilities.JavaScriptUtility.clickJS;
import static ultilities.JavaScriptUtility.scrollToElementJS;

//one we click on the practice form we can now mess around with the form
public class PracticeFormPage extends FormsPage{

    private By femaleRadioButton = By.id("gender-radio-2");


    public void clickFemaleRadioButton(){
        scrollToElementJS(femaleRadioButton);
        //when clicking radio button sometimes you need to do with JS
        clickJS(femaleRadioButton);
    }

}
