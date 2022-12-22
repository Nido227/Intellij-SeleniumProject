package com.cydeo.tests.Day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }

    @Test
    public void dropdownTask4() throws InterruptedException {

        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //Select illinois using visible text
        selectState.selectByVisibleText("Illinois");

        Thread.sleep(2000);

        //Select Virginia using value
        selectState.selectByValue("VA");

        Thread.sleep(2000);

        //Select California using index
        selectState.selectByIndex(5);

        Thread.sleep(2000);

        //Verify final selected option is California
        String actualFinalOption = selectState.getFirstSelectedOption().getText();
        String expectedFinalOption = "California";

        Assert.assertEquals(actualFinalOption, expectedFinalOption, "Final selected option verification has failed");

        //Finding index number for options
        int index = -1;
        for (WebElement eachState : selectState.getOptions()) {
            index++;
            if (eachState.getText().equals("California")) {
                System.out.println(index);
            }
        }

    }

        @Test
        public void dropdownTask7() throws InterruptedException {
            Select selectLanguage = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

            //Select all the options from multiple select dropdown
            for (WebElement eachLanguage : selectLanguage.getOptions()){
                eachLanguage.click();
                System.out.println("eachLanguage.getText() = " + eachLanguage.getText());
                Thread.sleep(2000);
            }

            Thread.sleep(2000);

            //Deselect all values
            selectLanguage.deselectAll();


        }













}
