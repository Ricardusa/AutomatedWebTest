package com.qaPlayground.miniWebApps;

import com.qaPlayground.HomePage;
import org.openqa.selenium.By;

import static ultilities.JavaScriptUtility.scrollToElementJS;

public class MultiLevelDropdownPage extends HomePage {

    private By dropdownButton = By.xpath("(//ul[@class='navbar-nav']/li[@class='nav-item']/a)[4]\n");
    private By settingsButton = By.xpath("//a[contains(@href,'settings')]");

    public void clickNavbarButton(){
        scrollToElementJS(dropdownButton);
        click(dropdownButton);
    }

    public void clickSettingsButton(){
        scrollToElementJS(settingsButton);
        click(settingsButton);
    }

    public Boolean verifyItem(String item){
        delay(1000);
        return find(By.xpath("//a[contains(@href,'"+item+"')]")).isDisplayed();
    }
}
