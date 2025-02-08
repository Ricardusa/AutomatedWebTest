package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Website(https://demoqa.com/webtables)
public class WebTablesPage extends ElementsPage{

    private By registrationAgeField = By.id("age");
    private By submitButton = By.id("submit");
    private By registrationDepartmentField = By.id("department");
    private By registrationFirstNameField = By.id("firstName");
    private By registrationLastNameField = By.id("lastName");

    //this will allow us to click any edit button based on the users email
    public void clickEdit(String email){
        By editButton = By.xpath("//div[text()='"+ email +"']//following::span[@title='Edit']");
        click(editButton);
    }

    public void setAge(String sAge){
        set(registrationAgeField, sAge);
    }

    public void setDepartment(String sDepartment){
        set(registrationDepartmentField, sDepartment);
    }

    public void setFirstName(String sFirstName){
        set(registrationFirstNameField, sFirstName);
    }

    public void setLastName(String sLastName){
        set(registrationLastNameField, sLastName);
    }

    public void clickSubmitButton(){
        click(submitButton);
    }

    public String getTableAge(String email){
        By tableAge = By.xpath("//div[text()='"+ email +"']//preceding::div[1]");
        return find(tableAge).getText(); //returns the age of person
    }



}
