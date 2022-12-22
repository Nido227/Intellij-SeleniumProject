package com.cydeo.tests.Day4_xpath_findElements;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSeletor {
    public static void main(String[] args) {

        //set up chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // go to link
        driver.get("https://practice.cydeo.com/forgot_password");

        //locate using cssSelector with class attr syn#2
        WebElement homeLink1 = driver.findElement(By.cssSelector("a.nav-link"));

        //locate using cssSelector with class attr syn#1
        WebElement homeLink2 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //locate using xpath with class attr #1
        WebElement homeLink3 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //forgot password header
        WebElement forgotPassword = driver.findElement(By.cssSelector("div[class='example']>h2"));

        //locating using cssSelector with class attr syntax2
        WebElement forgotPassword2 = driver.findElement(By.cssSelector("div.example>h2"));

        //locating using xpath with class attr syntax1
        WebElement forgotPassword3 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //locating using xpath with class attr from parent to child
        WebElement forgotPassword4 = driver.findElement(By.xpath("//div[@class='example']/h2"));

        //Email text
        //locate using xpath with text
        WebElement emailText = driver.findElement(By.xpath("//label[.='E-mail']"));

        //locate using xpath with contains
        WebElement emailText2 = driver.findElement(By.xpath("//label[contains(@for,'email')]"));

        //Email input box
        WebElement emailInput = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z')]"));

        //Retrieve password button
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']>i"));

        //Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //Verify all web elements are displayed
        //isDisplayed() method, this method returns boolean "true/false"
        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("forgotPassword3 = " + forgotPassword3.isDisplayed());
        System.out.println("emailText1.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());













    }
}
