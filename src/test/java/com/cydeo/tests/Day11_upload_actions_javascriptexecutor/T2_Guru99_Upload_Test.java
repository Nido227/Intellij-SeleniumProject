package com.cydeo.tests.Day11_upload_actions_javascriptexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Guru99_Upload_Test {

    @Test
    public void guru99_upload_test(){
        //1. Go to  “https://demo.guru99.com/test/upload”
        Driver.getDriver().get("https://demo.guru99.com/test/upload");

        //2. Upload file into Choose File
        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@id='uploadfile_0']"));
        chooseFile.sendKeys("C:\\Users\\Nido\\Desktop\\SteamProfile Pictures\\godfather.png");

        //3. Click terms of service check box
        WebElement serviceBox = Driver.getDriver().findElement(By.xpath("//input[@type='checkbox']"));
        serviceBox.click();

        //4. Click Submit File button
        WebElement submitBtn = Driver.getDriver().findElement(By.xpath("//button[@type='button']"));
        submitBtn.click();

        //5. Verify expected message appeared. Expected: “1 file has been successfully uploaded.”
        WebElement resultMsg = Driver.getDriver().findElement(By.id("res"));
                String expectedMsg = "1 file has been successfully uploaded.";
                String actualMsg = resultMsg.getText();

        BrowserUtils.sleep(3);

        Assert.assertEquals(actualMsg,expectedMsg);
    }
}
