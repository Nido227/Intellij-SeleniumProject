package com.cydeo.tests.Day10_javafaker_driver_util;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Old_driver_test {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //st up chrome and create WebDriver instance
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void googleTitle(){
        Driver.getDriver().get("https://google.com");
        System.out.println("google test driver = " + ((RemoteWebDriver)Driver.getDriver()).getSessionId());
    }

    @Test
    public void yahooTitle(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("search.keyword") + Keys.ENTER);

        System.out.println("yahoo test driver = " + ((RemoteWebDriver)Driver.getDriver()).getSessionId());
    }

    @Test
    public void etsyTitle(){
        String actualTitle = driver.getTitle();

//        String expectedTitle = "apple" + "- Google search";
//        String expectedTitle = ConfigurationReader.getProperty("search.keyword") + " - Google Search";
//        Assert.assertEquals(actualTitle,expectedTitle);

        Driver.getDriver().get("https://etsy.com");
        System.out.println("etsy test driver = " + ((RemoteWebDriver)Driver.getDriver()).getSessionId());
    }

    @AfterMethod
    public void tearDown(){

    }










}
