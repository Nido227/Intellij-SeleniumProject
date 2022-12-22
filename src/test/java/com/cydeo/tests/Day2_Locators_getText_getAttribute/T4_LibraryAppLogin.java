package com.cydeo.tests.Day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryAppLogin {
    public static void main(String[] args) {

        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2 Go to http://library2.cydeo.com/login.html
        driver.get("http://library2.cydeo.com/login.html");

        //3 Enter username incorrect@email.com
        WebElement usernameInput = driver.findElement(By.id("inputEmail"));
        usernameInput.sendKeys("incorrect@email.com");

        //4 Enter password incorrect password
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");


        //5 Click to Sign in button
        WebElement signinBtn = driver.findElement(By.tagName("button"));
        signinBtn.click();

        //6 Verify: visually "Sorry, Wrong email or password" displayed
    }
}
