package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate(){
        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        String month = "January";
        String day = "13";
        String year = "2001";
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day); //clicking the day closes the Date Menu

        String actualDate = datePickerPage.getDate();
        String expectedDate = month + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate);
    }
}
