package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

public class SelectDropDownTests extends BaseTest {

    @Test
    public void testMultiSelectDropDown(){
       var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
       selectMenuPage.selectStandardMulti("Volvo");
       selectMenuPage.selectStandardMulti(1);
       selectMenuPage.selectStandardMulti("Audi");
       selectMenuPage.selectStandardMulti(2);
        //since its by value it has to be lowercase
       selectMenuPage.deselectStandardMulti("volvo");
       //Allows us to search to the list
       List<String> actualSelectedOptions =
               selectMenuPage.getAllSelectedStandardMultiOptions();
        Assert.assertFalse(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertTrue(actualSelectedOptions.contains("Saab"));
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));
    }
}
