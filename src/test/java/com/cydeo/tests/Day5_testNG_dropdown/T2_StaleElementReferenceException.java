package com.cydeo.tests.Day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_StaleElementReferenceException {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");


        //3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));


        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[text()='Delete']"));
        System.out.println("delete button is displayed:  " + deleteButton.isDisplayed());


        //5. Click to “Delete” button.
        deleteButton.click();


        //6. Verify “Delete” button is NOT displayed after clicking.
        try {
            System.out.println("Delete button is displayed: " + deleteButton.isDisplayed());

        }catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException is thrown and this is already known");
        }

        driver.quit();




    }
}
