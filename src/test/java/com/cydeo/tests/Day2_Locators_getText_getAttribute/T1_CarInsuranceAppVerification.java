package com.cydeo.tests.Day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CarInsuranceAppVerification {
    public static void main(String[] args) {

        //1- set up web driver manager
        WebDriverManager.chromedriver().setup();

        //2- opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();

        //making window full screen
        driver.manage().window().maximize();

        //- go to www.qa1.excelsoirinsurance.com/login
        driver.get("https://www.qa1.excelsoirinsurance.com/login");

        //3- Verify URL contains expected: excelsoirinsurance
        String expectedURL = "excelsoirinsurance"; //comes from requirement
        String actualURL = driver.getCurrentUrl(); //comes from browser

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verifixation: PASSED!");
        }else{
            System.out.println("URL Verification: FAILED!");
        }

        //4. Verify title: Expected: :Login | Excelsoir Insurance"
        String expectedTitle = "Login | Excelsoir Insurance";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification: PASSED!");
        }else{
            System.out.println("Title Verification: FAILED!");
        }



    }

}
