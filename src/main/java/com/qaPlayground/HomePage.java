package com.qaPlayground;

import com.base.BasePage;
import com.qaPlayground.miniWebApps.DynamicTablePage;
import com.qaPlayground.miniWebApps.MultiLevelDropdownPage;
import com.qaPlayground.miniWebApps.VerifyAccountPage;
import org.openqa.selenium.By;

import static ultilities.JavaScriptUtility.clickJS;
import static ultilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By dynamicTableCard = By.xpath("//div//h3[text()='Dynamic Table']");
    private By verifyYourAccountCard = By.xpath("//div//h3[text()='Verify Your Account']");
    private By multiLevelDropdownCard = By.xpath("//div//h3[text()='Multi Level Dropdown']");

    public DynamicTablePage goToDynamicTablePage(){
        scrollToElementJS(dynamicTableCard);
        clickJS(dynamicTableCard);
        return new DynamicTablePage();
    }

    public VerifyAccountPage goToVerifyAccountPage(){
        scrollToElementJS(verifyYourAccountCard);
        clickJS(verifyYourAccountCard);
        return new VerifyAccountPage();
    }

    public MultiLevelDropdownPage goToMultiLevelDropdownPage(){
        scrollToElementJS(multiLevelDropdownCard);
        clickJS(multiLevelDropdownCard);
        return new MultiLevelDropdownPage();
    }


}
