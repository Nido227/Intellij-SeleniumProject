package com.cydeo.tests.Day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_getText_cssSelector_Practice {
    public static void main(String[] args) {

        //Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Go to link
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //Verify "reset password butt on text is as expected
        //Expected: Reset password
        WebElement resetPasswordBtn = driver.findElement(By.cssSelector("button.login-btn"));

        String expectedResetButtonText = "Reset password";
        String actualResetButtonText = resetPasswordBtn.getText();

        if (actualResetButtonText.equals(expectedResetButtonText)){
            System.out.println("Reset button text verification passed!");
        }else{
            System.out.println("Reset button text verification failed!");
        }

        driver.quit();

    }
}
