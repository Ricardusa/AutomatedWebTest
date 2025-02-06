package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTests extends BaseTest {



    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("incorrectPassword");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        //Error Message should appear
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }

}
