package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static ultilities.GetUtility.getText;
import static ultilities.WaitUtility.fluentWaitUntilVisible;

public class ProgressBarPage extends WidgetsPage{

    private By startButton = By.id("startStopButton");
    //element that indicates the progress bar has reached 100 percent
    private By progressValue = By.xpath("    //div[@id='progressBar']/div[@aria-valuenow='100']");


    public void clickStartButton(){
        click(startButton);
    }

    //return in string format the progress value on the bar
    public String getProgressValue(){
        fluentWaitUntilVisible(30, progressValue);
        return getText(progressValue);
    }
}
