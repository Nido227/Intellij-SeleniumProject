package com.cydeo.tests.Day11_upload_actions_javascriptexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class T1_JavaFaker_Practice {

    @Test
    public void registration_form() {

        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //3. Enter first name
        Faker faker = new Faker();
        WebElement firstname = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement lastname = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        String userName = faker.name().username().replace(".", "");
        username.sendKeys(userName);

        //6. Enter email address
        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.internet().emailAddress());

        //7. Enter password
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());

        //8. Enter phone number
        WebElement phoneNum = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNum.sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons
        WebElement genderMale = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        genderMale.click();


        //10. Enter date of birth
        WebElement DOB = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        DOB.sendKeys("03/12/1994");

        //11. Select Department/Office
        Select departmentDropDown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropDown.selectByIndex(faker.number().numberBetween(2,9));

        //12. Select Job Title
        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(2,9));

        //13. Select programming language from checkboxes
        // can store using List
        WebElement programLang = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        programLang.click();


        //14. Click to sign up button
        WebElement signUp = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        signUp.click();

        //15. Verify success message “You’ve successfully completed registration.” is


        //displayed.
    }


}
