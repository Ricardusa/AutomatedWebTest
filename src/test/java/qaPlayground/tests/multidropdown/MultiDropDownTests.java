package qaPlayground.tests.multidropdown;

import org.testng.Assert;
import org.testng.annotations.Test;
import qaPlayground.base.BaseTest;

import static com.base.BasePage.delay;

public class MultiDropDownTests extends BaseTest {

    @Test
    public void navToSubMenu(){
        var multiLevelDropdownPage = homePage.goToMultiLevelDropdownPage();

        multiLevelDropdownPage.clickNavbarButton();
        multiLevelDropdownPage.clickSettingsButton();
        boolean isHTMLDisplayed = multiLevelDropdownPage.verifyItem("HTML");
        //boolean isCSSDisplayed = multiLevelDropdownPage.verifyItem("CSS");
        //boolean isJSDisplayed = multiLevelDropdownPage.verifyItem("JavaScript");
        //boolean isAwesomeDisplayed = multiLevelDropdownPage.verifyItem("Awesome");
        Assert.assertTrue(isHTMLDisplayed, "HTML is not displayed");
        //Assert.assertTrue(isAwesomeDisplayed, "Awesome is not displayed");
        //Assert.assertTrue(isJSDisplayed, "JavaScript is not displayed");

    }
}
