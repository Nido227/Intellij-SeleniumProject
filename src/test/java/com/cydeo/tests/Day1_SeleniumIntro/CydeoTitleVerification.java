package com.cydeo.tests.Day1_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleVerification {
    public static void main(String[] args) {

        //TASK 1

        //Open chrome browser
        WebDriverManager.chromedriver().setup();

        //opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //go to cydeo.com
        driver.get("https://cydeo.com");

        //verify title: Exptected: Cydeo
        String expectedTitle = "Cydeo";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification: PASSED");
        }else{
            System.out.println("Title verification: FAILED");
        }

        driver.quit();
    }
}
