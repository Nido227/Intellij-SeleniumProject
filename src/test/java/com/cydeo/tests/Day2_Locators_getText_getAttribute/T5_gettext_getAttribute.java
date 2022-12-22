package com.cydeo.tests.Day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_gettext_getAttribute {
    public static void main(String[] args) {

        //1 Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2 go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3 Verify header text is as expected Expected: Registration form
        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedHeader = "Registration form";
        String actualHeader = headerText.getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header text verification passed!");
        }else{
            System.out.println("Header text verification failed!");
        }

        //4 Locate "First name" input box
        WebElement firstNameInput = driver.findElement(By.name("firstname"));

        //5  Verify placeholder attributes value is as expected: Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Placeholder text verification passed!");
        }else{
            System.out.println("Placeholder text verification failed!");
        }

        driver.quit();
    }
}
