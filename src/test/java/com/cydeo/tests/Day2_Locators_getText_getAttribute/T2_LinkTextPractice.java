package com.cydeo.tests.Day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- go to https://www.practice.cydeo.com
        driver.get("https://practice.cydeo.com/");

        Thread.sleep(3000);

        //3 Click to A/B testing from top of the list
        //WebElement abTestLink = driver.findElement(By.linkText("A/B Testing")); //t2
        WebElement abTestLink = driver.findElement(By.partialLinkText("A/B Testing"));  //t3
        abTestLink.click();

       //4- Verify title is: Expected: No A/B test
       String expectedTitle = "No A/B Test";
       String actualTitle = driver.getTitle();

       if (actualTitle.equals(expectedTitle)){
           System.out.println("No A/B Test Title Verification: Passed!");
       }else{
           System.out.println("No A/B Test Title Verification: Failed!");
       }

       Thread.sleep(2000);

       //5- Go back to home page by using .back();
        driver.navigate().back();

       //6- Verify title equals: Expected: Practice
        expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Practice Page Title Verification: Passed!");
        }else{
            System.out.println("Practice Page Title Verification: Failed!");
        }

        driver.quit();





    }
}
