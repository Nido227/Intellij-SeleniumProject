package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoadedPage1 {

    public DynamicallyLoadedPage1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy (xpath = "//div[@id='loading']")
    public WebElement loading;

    @FindBy (css = "#username")
    public WebElement inputUsername;

    @FindBy (id = "pwd")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[.='Submit']")
    public WebElement submitElement;

    @FindBy (xpath = "//div[@class='flash error']")
    public WebElement errorMessage;





}
