package com.cydeo.tests.Day1_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        //1- set up web driver manager
        WebDriverManager.chromedriver().setup();

        //2- opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();

        //making window full screen
        driver.manage().window().maximize();

        //3- go to tesla.com
        driver.get("https://tesla.com");

        //navigate().to() method is the same at get() method
        //driver.navigate().to("https://tesla.com");

        //stops execution of code for 3 sec
        Thread.sleep(3000);

        //navigate().back() will take previous page
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");
        String currentTitle = driver.getTitle();
        System.out.println("title = "+ currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL );

        //close() method will close current opened page
        //driver.close();

        //quit() will close all open pages
        driver.quit();

    }
}
