package com.cydeo.tests.Day12_actions_javascriptexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Y7_JavaScriptExecutor_Scroll {

    @Test
    public void task_7_jse_scroll(){

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large
       Driver.getDriver().get("https://practice.cydeo.com/large");

        //3- Scroll down to “Cydeo” link
        JavascriptExecutor js = ((JavascriptExecutor)Driver.getDriver());

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));


        BrowserUtils.sleep(2);

        //Scroll Down to Cydeo Link
       // js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink,homeLink);
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);


        //Scroll up to Home link
        //js.executeScript("arguments[1].scrollIntoView(true)", cydeoLink0,homeLink); The 1 here means you have 2 arguments
        js.executeScript("arguments[0].scrollIntoView(true)",homeLink);


        //5- Use below provided JS method only
    }
}
