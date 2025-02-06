package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    private By productsHeader = By.xpath("//span[text()='Products']");

    //Verifies if the test made it to the products page
    public boolean isProductHeaderDisplayed(){
        return find(productsHeader).isDisplayed();
    }



}
