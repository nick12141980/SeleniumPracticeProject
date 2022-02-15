package com.cydeo.day05_testNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //Create browser driver setup
        //Open browser
        driver = WebDriverFactory.getDriver("chrome");
        //Maximize the page
        driver.manage().window().maximize();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void seleniumTest(){

        //Get https://google.com
        driver.get("https://google.com");

        //Assert: title is "Google"
        Assert.assertEquals(driver.getTitle(), "Google", "Title is not matching");

        driver.close();
    }
}