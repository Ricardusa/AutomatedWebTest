package qaPlayground.tests.dynamicTable;

import org.testng.Assert;
import org.testng.annotations.Test;
import qaPlayground.base.BaseTest;

import static com.base.BasePage.delay;

public class VerifyAccountTest extends BaseTest {

    @Test
    public void testInputCode(){
        var dynamicTablePage = homePage.goToVerifyAccountPage();

        delay(2000);
        dynamicTablePage.setInput("999999");
        boolean successfulVerification = dynamicTablePage.isSuccessDisplayed();
        Assert.assertTrue(successfulVerification, "invalid code");
    }
}
