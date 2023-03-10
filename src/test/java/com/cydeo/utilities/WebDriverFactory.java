package com.cydeo.utilities;

//task: NEW METHOD CREATION
//Method name: getDriver
//Static Method
//Accepts String arg: browserType
//-This arg will determine what type of browser is opened
//-if "chrome" passed --> it will open Chrome browser
//-if "firefox" passed --> it will open firefox browser
//RETURN TYPE: "WebDriver"

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver getDriver(String browserType){

        if(browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
//            WebDriver driver = new ChromeDriver();
//            return driver;    **below is a shortcut**
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else {
            System.out.println("Given browser type doesn't exist/or not currently supported!");
            return null;
        }
    }
}
