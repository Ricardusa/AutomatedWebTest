package com.qaPlayground;

import com.base.BasePage;
import com.qaPlayground.miniWebApps.DynamicTablePage;
import org.openqa.selenium.By;

import static ultilities.JavaScriptUtility.clickJS;
import static ultilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By dynamicTableCard = By.xpath("//div//h3[text()='Dynamic Table']");


    public DynamicTablePage goToDynamicTablePage(){
        scrollToElementJS(dynamicTableCard);
        clickJS(dynamicTableCard);
        return new DynamicTablePage();
    }


}
