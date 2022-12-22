package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtilsGoodMaybe {
        //Method info:
        //• Name: verifyTitle()
        //• Return type: void
        //• Arg1: WebDriver
        //• Arg2: String expectedTitle
        //BrowserUtils.verifyTitle(driver, "Google")

        public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle){
            Set<String> allWindowHandles = driver.getWindowHandles();

            for (String eachWindow: allWindowHandles){

                driver.switchTo().window(eachWindow);

                if(driver.getCurrentUrl().contains(expectedInUrl)){
                    break;
                }
            }

            String actualTitle = driver.getTitle();

            Assert.assertTrue(actualTitle.contains(expectedTitle),"Title verification failed!");
        }


        public static void verifyTitle(WebDriver driver, String expectedTitle){

            Assert.assertEquals(driver.getTitle(),expectedTitle);

        }

        public static void waitForInvisibilityOf(WebElement element){
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
            wait.until(ExpectedConditions.invisibilityOf(element));
        }

        public static void sleep(int seconds) {
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Exception happened in sleep  method");
            }
        }

    }

