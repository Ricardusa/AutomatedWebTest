package com.demoqa.pages.alerts_frames_windows;

import com.qaPlayground.HomePage;
import org.openqa.selenium.By;

import static ultilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frames_WindowsPage extends HomePage {

    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");

    public ModalDialogsPage clickModalDialogs(){
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }



}
