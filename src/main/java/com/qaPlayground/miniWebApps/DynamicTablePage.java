package com.qaPlayground.miniWebApps;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class DynamicTablePage extends HomePage {

    //private By findNameInTable = By.xpath("//table//tr//td//div[text()='Spider-Man']");
    //private By

    private By chooseNameInTable(String hero, String realName){
        return By.xpath("//tr[td//div[text()='"+hero+"']]/td/span[text()='"+realName+"']");
    }


    public boolean isHeroInTable(String hero, String realName){
        //System.out.println("Founder hero" + find(chooseNameInTable(hero, realName)).getText()); >> debugging
        delay(2000); //Wait 2 seconds to make sure the table is fully loaded
        return find(chooseNameInTable(hero, realName)).isDisplayed();
    }


}
