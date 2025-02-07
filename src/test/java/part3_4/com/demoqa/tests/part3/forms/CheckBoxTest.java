package part3_4.com.demoqa.tests.part3.forms;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckBoxTest extends BaseTest {


    @Test
    public void testCheckbox(){
        var formsPage = homePage.goToForms().clickPracticeForm();

        formsPage.setFirstAndLastName("Ricardo", "Rivas");

        formsPage.clickSportsCheckbox();
        formsPage.clickMusicCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.unclickReadingCheckbox();
        boolean isReadingCheckboxClicked = formsPage.isReadingCheckboxSelected();
        Assert.assertFalse(isReadingCheckboxClicked,
                "\n Reading Checkbox is selected \n");
    }
}
