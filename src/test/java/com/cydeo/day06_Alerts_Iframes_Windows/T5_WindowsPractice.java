package com.cydeo.day06_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_WindowsPractice {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //Go to website:  https://practice.cydeo.com/windows
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_windows_test(){

        //Storing main page's window handle
        String mainHandle = driver.getWindowHandle();
        System.out.println(mainHandle);
        //4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

        System.out.println("Title before click: "+actualTitle);

        //5. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        System.out.println("Title after click: "+actualTitle);

        //6. Switch to new Window.
        for (String each : driver.getWindowHandles()){

            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: "+driver.getTitle());

        }

        //7. Assert: Title is “New Window”
        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();

        System.out.println("Title after click: "+actualTitle);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
