package com.cydeo.tests.Day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getText_cssSelector {
    public static void main(String[] args) {

        //1-Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2-Go to link
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify "Log in" button text is as expected:
        //Expected: Log in
        //Locate with using cssSelector by type attribute
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[type='submit']"));

        //Locate with using cssSelector by value attribute:
        //WebElement logInBtn2 = driver.findElement(By.cssSelector("input[value='Log In']"));

        //Locate with using cssSelector by class attribute:
        //WebElement logInBtn3 = driver.findElement(By.cssSelector("input[class='login-btn']"));

        //Locate with using cssSelector by class attribute with syntax2:
        //WebElement logInBtn4 = driver.findElement(By.cssSelector("input.login-btn"));

        //Locate with using cssSelector by onclick attribute with syntax2:
        //WebElement logInBtn5 = driver.findElement(By.cssSelector("input[onclick=\"BX.addClass(this, 'wait');\"]"));

        //Locate with using cssSelector by class attribute:
        WebElement logInBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));

        String expectedLogInBtnText = "Log In";
        String actualLogInBtnText = logInBtn.getAttribute("value");

        if (actualLogInBtnText.equals(expectedLogInBtnText)){
            System.out.println("Login text verification passed!");
        }else{
            System.out.println("Login text verification failed!");
        }

        driver.quit();

    }
}
