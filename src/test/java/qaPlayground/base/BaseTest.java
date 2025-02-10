package qaPlayground.base;

import com.base.BasePage;
import com.qaPlayground.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.base.BasePage.delay;
import static ultilities.Utility.setUtilityDriver;

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String QA_PLAYGROUND = "https://qaplayground.dev/#apps";

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/home/casio/Downloads/chromedriver-linux64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApp(){
        driver.get(QA_PLAYGROUND);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage(); //since every test must go through the homepage
    }

    @AfterClass
    public void tearDown(){
        delay(3000); // Delay of 3 seconds for demo purposes
        driver.quit();
    }

}
