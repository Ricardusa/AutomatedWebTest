package com.demoqa.pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static ultilities.JavaScriptUtility.clickJS;
import static ultilities.JavaScriptUtility.scrollToElementJS;

//one we click on the practice form we can now mess around with the form
public class PracticeFormPage extends FormsPage{

    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");

    //TODO: REMOVE THIS
    public void setFirstAndLastName(String setFirstName, String setLastname){
        WebElement firstNameField = find(firstName);
        WebElement lastNameField = find(lastName);
        firstNameField.sendKeys(setFirstName);
        lastNameField.sendKeys(setLastname);
    }

    public void clickFemaleRadioButton(){
        scrollToElementJS(femaleRadioButton);
        //when clicking radio button sometimes you need to do with JS
        clickJS(femaleRadioButton);
    }

    //verify the button was clicked
    public boolean isFemaleSelected(){
        //see if a certain button is selected with .isSelected
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsCheckbox(){
        //condition to check if the checkbox is not selected
        if(!find(sportsHobbyCheckbox).isSelected()){
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }

    public void clickReadingCheckbox(){
        //condition to check if the checkbox is not selected
        if(!find(readingHobbyCheckbox).isSelected()){
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void clickMusicCheckbox(){
        //condition to check if the checkbox is not selected
        if(!find(musicHobbyCheckbox).isSelected()){
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public void unclickReadingCheckbox(){
        //condition to check if checkbox is selected
        if(find(readingHobbyCheckbox).isSelected()){
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public boolean isReadingCheckboxSelected(){
        return find(readingHobbyCheckbox).isSelected();
    }

}
