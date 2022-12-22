package com.cydeo.tests.Day14_explicitwait_review;

import com.cydeo.pages.InternetSpeedPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InternetSpeedTest {

    @Test
    public void Internet_Speed_test(){

        //1- Open a chrome browser
        //2- Go to: https://www.speedtest.net
        Driver.getDriver().get("https://www.speedtest.net");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),60);
        InternetSpeedPage internetSpeedPage = new InternetSpeedPage();

        //3- Wait until Results link is displayed
        wait.until(ExpectedConditions.invisibilityOf(internetSpeedPage.resultLink));

        //4- Click on Go button
        internetSpeedPage.goButton.click();

        //5- Wait until gauge-speed-needle displayed
        wait.until(ExpectedConditions.invisibilityOf(internetSpeedPage.gaugeSpeedNeedle));

        //6- Wait until gauge-speed-needle disappear
        wait.until(ExpectedConditions.invisibilityOf(internetSpeedPage.gaugeSpeedNeedle));

        //7- Print Download and Upload Speeds
        System.out.println("internetSpeedPage.downloadMbps = " + internetSpeedPage.downloadMbps);
        System.out.println("internetSpeedPage.uploadMbps = " + internetSpeedPage.uploadMbps);


    }



}
