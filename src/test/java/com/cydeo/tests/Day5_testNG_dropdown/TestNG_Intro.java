package com.cydeo.tests.Day5_testNG_dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @Test (priority = 1)
    public void test1(){
        System.out.println("Test1 is running...");
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);
    }

    @Test (priority = 2)
    public void mytest2(){
        System.out.println("Test2 is running...");
        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));

    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("--> Before Method is running...");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--> After Method is running...");
    }

    @BeforeClass
    public void setUp(){
        System.out.println("Before class is running...");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("After class is running...");
    }





}
