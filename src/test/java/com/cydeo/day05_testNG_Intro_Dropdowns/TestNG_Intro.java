package com.cydeo.day05_testNG_Intro_Dropdowns;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Intro {

    @BeforeTest
    public void setUpMethod(){
        System.out.println("BeforeMethod is running...");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 is running...");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 is running...");
    }

}
