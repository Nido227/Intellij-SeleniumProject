package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
    /*
    PageFactory class is a Selenium class that support POM
    It has method called initElements. Once its called it will store all elements specified using @FindBy
    annotation with locator, and it will give elements to the classes when they called initElements method accept 2arg
    WebDriver instance and Page class instance (this) means current instance of this class
     */

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "inputEmail")
    public WebElement inputUsername;

    @FindBy (xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy (xpath = "//div[@class='alert alert-danger']")
    public WebElement fieldRequiredErrorMsg;

    @FindBy (xpath = "//*[@id='inputEmail-error']")
    public WebElement enterInvalidEmailErrorMsg;

    @FindBy (xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailAndPasswordErrorMsg;

}
