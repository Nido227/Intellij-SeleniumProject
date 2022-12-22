package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetSpeedPage {

    public InternetSpeedPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[normalize-space()='Results']")
    public WebElement resultLink;

    @FindBy (xpath = "//span[@class='start-text']")
    public WebElement goButton;

    @FindBy (className = "gauge-speed-text")
    public WebElement gaugeSpeedNeedle;

    @FindBy (className = "//span[@class='result-data-large number result-data-value download-speed']")
    public WebElement downloadMbps;

    @FindBy (className = "//span[@class='result-data-large number result-data-value upload-speed']")
    public WebElement uploadMbps;

    }
