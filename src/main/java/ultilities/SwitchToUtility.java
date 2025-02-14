package ultilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utility{

    private static WebDriver.TargetLocator switchTo(){
        return driver.switchTo();
    }

    //returns a string within an alert
    public static String getAlertText(){
       return switchTo().alert().getText();
    }

    //.accept -> automatically clicks the ok button
    public static void acceptAlert(){
        switchTo().alert().accept();
    }

    public static void dismissAlert(){
        switchTo().alert().dismiss();
    }

    public static void setAlertText(String text){
        switchTo().alert().sendKeys(text);
    }

    public static void switchToFrameString(String value){
        switchTo().frame(value);
    }

    public static void switchToDefaultContent(){
        switchTo().defaultContent();
    }

    public static void switchToFrameIndex(int index){
        switchTo().frame(index);
    }

    public static void switchToFrameElement(WebElement element){
        switchTo().frame(element);
    }


}
