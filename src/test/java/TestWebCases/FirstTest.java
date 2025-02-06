package TestWebCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {



//webdriver is used to work with the browser
WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/casio/Downloads/chromedriver-linux64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @AfterClass
    public void tearDown(){
        //driver.quit(); //quits the driver and browser
    }

    @Test
    public void testLoggingApp() throws InterruptedException {
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.name("username")); //we found the username
        username.sendKeys("Admin"); //now we need to login

        var password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click(); //only 1 of 1 button

        Thread.sleep(2000);
        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";

        Assert.assertEquals(actualResult, expectedResult);
    }
}
