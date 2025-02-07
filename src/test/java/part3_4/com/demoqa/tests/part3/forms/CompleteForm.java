package part3_4.com.demoqa.tests.part3.forms;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CompleteForm extends BaseTest {


    @Test
    public void fillFormOut(){
        var formsPage = homePage.goToForms().clickPracticeForm();

        formsPage.setFirstAndLastName("John", "Doe");
        formsPage.setEmail("test@email.com");
        formsPage.clickFemaleRadioButton();
        formsPage.setNumber("1234567890");
        formsPage.clickSportsCheckbox();
        formsPage.clickSubmitButton();

    }

}
