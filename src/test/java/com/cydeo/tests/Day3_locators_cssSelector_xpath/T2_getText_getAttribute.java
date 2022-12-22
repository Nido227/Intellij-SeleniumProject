package com.cydeo.tests.Day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
        //Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //go to link
        driver.get("https://login1.nextbasecrm.com/");

        //verify "remember me" label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if (expectedRememberMeLabel.equals(actualRememberMeLabel)){
            System.out.println("Verification Passed!");
        }else{
            System.out.println("Verification Failed!");
        }

        //Verify "forgot password" link text is as expected:
        //Expected: forgot your password?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordLink = "FORGOT YOUR PASSWORD?";
        String actualForgotPasswordLink = forgotPasswordLink.getText();

        if (actualForgotPasswordLink.equals(expectedForgotPasswordLink)){
            System.out.println("Verification Passed!");
        }else{
            System.out.println("actualForgotPasswordLink = " + actualForgotPasswordLink);
            System.out.println("expectedForgotPasswordLink = " + expectedRememberMeLabel);
            System.out.println("Verification Failed!");
        }

        //Verify "forgot password" href attribute's value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgotPasswordLink.getAttribute("href");

        if (actualInHref.contains(expectedInHref)){
            System.out.println("Href Attribute Value Verification Passed");
        }else{
            System.out.println("Href Attribute Value Verification Failed");
        }

        driver.quit();

    }
}
