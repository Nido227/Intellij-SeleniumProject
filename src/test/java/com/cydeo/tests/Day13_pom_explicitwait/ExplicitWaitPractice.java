package com.cydeo.tests.Day13_pom_explicitwait;

import com.cydeo.pages.DynamicallyLoadedPage1;
import com.cydeo.pages.DynamicallyLoadedPage_7;
import com.cydeo.tests.Day6_alerts_iframe_windows.DropdownPractices;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitPractice {

    @Test
    public void dynamically_loaded_page_elements_7_test(){

        //1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        //2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //3. Assert: Message “Done” is displayed.
        DynamicallyLoadedPage_7 dynamicallyLoadedPage_7 = new DynamicallyLoadedPage_7();
        Assert.assertTrue(dynamicallyLoadedPage_7.doneMessage.isDisplayed());

        //4. Assert: Image is displayed.
        Assert.assertTrue(dynamicallyLoadedPage_7.spongebobImage.isDisplayed());


    }

    @Test
    public void dynamically_loaded_page_elements_1_test(){

        //1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        //2. Click to start
        DynamicallyLoadedPage1 dynamicallyLoadedPage1 = new DynamicallyLoadedPage1();
        dynamicallyLoadedPage1.startButton.click();

        //3. Wait until loading bar disappears
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
//        wait.until(ExpectedConditions.invisibilityOf(dynamicallyLoadedPage1.loading));
        BrowserUtils.waitForInvisibilityOf(dynamicallyLoadedPage1.loading);

        //4. Assert username inputbox is displayed
        //5. Enter username: tomsmith
        dynamicallyLoadedPage1.inputUsername.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        dynamicallyLoadedPage1.inputPassword.sendKeys("incorrectpassword");

        //7. Click to Submit button
        dynamicallyLoadedPage1.submitElement.click();

        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicallyLoadedPage1.errorMessage.isDisplayed());

    }

}
