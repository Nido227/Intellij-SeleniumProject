package com.cydeo.tests.Day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class T1_Locators_getText {
    public static void main(String[] args) {

        //1- Open a chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2 go to link
        driver.get("https://login1.nextbasecrm.com/");

        //3 enter incorrect username "incorrect"
        WebElement usernameBox = driver.findElement(By.name("USER_LOGIN"));
        usernameBox.sendKeys("incorrect");

        //4 enter incorrect password: "incorrect"
        WebElement passwordBox = driver.findElement(By.name("USER_PASSWORD"));
        passwordBox.sendKeys("incorrect" + Keys.ENTER);

        //5 click the login button
        WebElement loginButton = driver.findElement(By.name("login-btn"));
        loginButton.click();

        //6 verify error message text is as expected
        //Expected: Incorrect login or email

        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedMessage = "Incorrect login or password";
        String actualMessage = errorMessage.getText();

        if (actualMessage.equals(expectedMessage)){
            System.out.println("Verification Passed");
        }else{
            System.out.println("Verification Failed");
        }
        driver.quit();

    }
}
