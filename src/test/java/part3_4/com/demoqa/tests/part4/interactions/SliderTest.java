package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class SliderTest extends BaseTest {


    @Test
    public void testSliderResult(){
        var sliderPage = homePage.goToWidgets().clickSlider();

    }



}
