package com.cydeo.tests.Day7_windows_webtable;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_MultipleWindows {

    //1. Open a Chrome browser
    //2. Go to : https://practice.cydeo.com/windows
    //3. Assert: Title is “Windows”
    //4. Click to: “Click Here” link
    //5. Click to: “CYDEO” link
    //6. Switch to Cydeo page.
    //7. Assert: Title is “Cydeo”

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_windows_test(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";

        Assert.assertEquals(actualTitle,expectedTitle);
        //Assert.assertEquals(driver.getTitle(),"Windows");


        WebElement clickMeBtn = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        //WebElement clickMeBtn = driver.findElement(By.linkText("Click Here"));
        clickMeBtn.click();

        WebElement cydeoLinkBtn = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        cydeoLinkBtn.click();
        
        Set<String> allWindows = driver.getWindowHandles();

        for (String eachWindow : allWindows) {
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());

            if (driver.getTitle().equals("Cydeo")){
                break;
            }
        }

        Assert.assertEquals(driver.getTitle(),"Cydeo");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
