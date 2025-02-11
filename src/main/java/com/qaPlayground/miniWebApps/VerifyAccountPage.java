package com.qaPlayground.miniWebApps;

import com.qaPlayground.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static ultilities.DropDownUtility.findElements;
import static ultilities.DropDownUtility.selectByVisibleText;

public class VerifyAccountPage extends HomePage {
    private By inputCode = By.xpath("//div[@class='code-container']/input");
    private By successText = By.xpath("//div//small[@class='info success']");

    public void setInput(String code){
        //List<WebElement> inputs = findElements(inputCode);


        for(int i = 0; i < code.length(); i++){
            if (i < findElements(inputCode).size()){
                findElements(inputCode).get(i).sendKeys(String.valueOf(code.charAt(i)));
            }
        }
        //set(inputCode, code);
    }

    public Boolean isSuccessDisplayed(){
        return find(successText).isDisplayed();
    }
}
