package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CompleteFormTest extends BaseTest {


    @Test
    public void fillFormOut(){
        var formsPage = homePage.goToForms().clickPracticeForm();

        formsPage.setFirstAndLastName("John", "Doe");
        formsPage.setEmail("test@email.com");
        formsPage.clickFemaleRadioButton();
        formsPage.setNumber("1234567890");
        formsPage.setDateOfBirthInput("13 Jan 2001");
        /*formsPage.clickDateOfBirth();
        formsPage.clickDateDay("28");*/
        formsPage.clickSportsCheckbox();
        formsPage.uploadFileInput();
        formsPage.clickSubmitButton();
        Assert.assertTrue(formsPage.isFormSubmissionBeingDisplayed(),
                "\n Form Submission Failed \n");

    }

}
