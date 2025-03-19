package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static ultilities.ActionsUtility.dragAndDropBy;
import static ultilities.GetUtility.getAttribute;

public class SliderPage extends WidgetsPage{

 private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
 private By sliderValue = By.id("sliderValue");

 public void moveSlider(int x, int y) {
     //TODO: Added code within utility class to it simpler and reusable
     //Actions act = new Actions(driver);
     //act.dragAndDropBy(find(slider), x, y).perform();
     //act.perform(); //perform all actions without calling build()
     dragAndDropBy(find(slider), x, y);
 }

 public String getSliderValue(){
     return getAttribute(sliderValue, "value");
 }


}
