package com.cydeo.tests.Day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Ifram_Practice {

    //1. Create a new class called: T4_Iframes
    //2. Create new test and make setups
    //3. Go to: https://practice.cydeo.com/iframe
    //4. Assert: “Your content goes here.” Text is displayed.
    //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iframeTask(){

        //switching to iframe using index number
        //driver.switchTo().frame(0);

        //switch to iframe using id value
        //driver.switchTo().frame("mce_0_ifr");

        //switch to iframe using iframe locator
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));


        //4. Assert: “Your content goes here.” Text is displayed.
        WebElement textArea = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(textArea.isDisplayed());

        //we are switching to main html with using defaultContent()
        driver.switchTo().defaultContent();

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor” is displayed
        WebElement headerText = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());




    }






}
