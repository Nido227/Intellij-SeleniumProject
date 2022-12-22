package com.cydeo.tests.Day1_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2- Creating instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //3- Test if driver is working
        driver.get("https://www.google.com");

    }
}
