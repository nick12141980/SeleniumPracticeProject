package com.cydeo.day05_testNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    @Test
    public void seleniumTest(){
        //Create browser driver setup
        //Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //Maximize the page
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Get https://google.com
        driver.get("https://google.com");

        //Assert: title is "Google"
        Assert.assertEquals(driver.getTitle(), "Google");

        driver.close();
    }
}
