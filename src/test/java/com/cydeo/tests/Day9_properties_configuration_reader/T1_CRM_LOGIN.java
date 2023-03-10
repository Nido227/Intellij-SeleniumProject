package com.cydeo.tests.Day9_properties_configuration_reader;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_CRM_LOGIN extends TestBase {


    @Test
    public void crm_login_test(){
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys("hr2@cydeo.com");

        //4. Enter valid password
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement logInButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        logInButton.click();

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");
    }

    @Test
    public void crm_login_test2(){

        driver.get("http://login1.nextbasecrm.com/");
        CRM_Utilities.login_crm(driver);
        BrowserUtils.verifyTitle(driver,"Portal");

    }

    @Test
    public void crm_login_test3(){

        driver.get("http://login1.nextbasecrm.com/");
        CRM_Utilities.login_crm(driver, " hr3@cydeo.com", "UserUser");
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle(driver,"Portal");

    }

}
