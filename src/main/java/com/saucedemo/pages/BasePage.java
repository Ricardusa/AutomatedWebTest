package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    //public so all the classes can access the webdriver
    public static WebDriver driver;

    //constructor
    public void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }

    //This reduces duplicate code
    protected WebElement find(By locator){
        return driver.findElement(locator);
    }

    protected void set(By locator, String text){
        find(locator).clear(); //if data is present then we would clear it before using it
        find(locator).sendKeys(text);
    }

    protected void click(By locator){
        find(locator).click();
    }
}
