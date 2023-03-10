package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {
    //Method #1 info:
    //• Name: login_crm()
    //• Return type: void
    //• Arg1: WebDriver

    public static void login_crm(WebDriver driver,String username, String password){

        //3. Enter valid username
        WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys(username);

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);

        //5. Click to `Log In` button
        WebElement logInButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        logInButton.click();

    }

    public static void login_crm(WebDriver driver){

        //3. Enter valid username
        WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys("hr2@cydeo.com");

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement logInButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        logInButton.click();

    }
    //Method #2 info:
    //• Name: login_crm()
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String username
    //• Arg3: String password











}
