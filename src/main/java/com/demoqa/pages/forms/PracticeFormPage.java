package com.demoqa.pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

import static ultilities.JavaScriptUtility.*;

//one we click on the practice form we can now mess around with the form
public class PracticeFormPage extends FormsPage{

    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("userEmail");
    private By mobileNum = By.id("userNumber");
    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");
    private By dateOfBirthInput = By.id("dateOfBirthInput");
    private By submitButton = By.id("submit");
    private By uploadFileButton = By.id("uploadPicture");
    private File uploadFile = new File("/home/casio/Pictures/FPL/unai.jpg");
    private By formSubmission = By.id("example-modal-sizes-title-lg");

    //TODO: REMOVE THIS
    public void setFirstAndLastName(String setFirstName, String setLastname){
        //set(firstName, setFirstName); same as below
        WebElement firstNameField = find(firstName);
        WebElement lastNameField = find(lastName);
        firstNameField.sendKeys(setFirstName);
        lastNameField.sendKeys(setLastname);
    }

    public void setEmail(String setEmail){
        WebElement emailField = find(email);
        emailField.sendKeys(setEmail);
    }

    public void setNumber(String setNum){
        WebElement numberField = find(mobileNum);
        numberField.sendKeys(setNum);
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

    //TODO: Combine clickDateOfBirth() & clickDateDay() into one method
    public void clickDateOfBirth(){
        scrollToElementJS(dateOfBirthInput);
        click(dateOfBirthInput);
    }

    public void clickDateDay(String day){
        //TODO: make seperate private method for By.xpath
        By clickDay = By.xpath("//div[@id='dateOfBirth']//div[contains(@class, 'react-datepicker__day') and text()='" + day + "']");
        click(clickDay);
    }

    public void setDateOfBirthInput(String setDateOfBirth){
        scrollToElementJS(dateOfBirthInput);
        click(dateOfBirthInput);
        clearInput(dateOfBirthInput);
        delay(1000);
        set(dateOfBirthInput, setDateOfBirth);
    }

    public void uploadFileInput(){
        scrollToElementJS(uploadFileButton);
        //WebElement fileInput = find(uploadFileButton);
        //fileInput.sendKeys(uploadFile.getAbsolutePath());
        find(uploadFileButton).sendKeys(uploadFile.getAbsolutePath());
    }

    public void clickSubmitButton(){
        click(submitButton);
    }

    public boolean isFormSubmissionBeingDisplayed(){
        return find(formSubmission).isDisplayed();
    }

}
