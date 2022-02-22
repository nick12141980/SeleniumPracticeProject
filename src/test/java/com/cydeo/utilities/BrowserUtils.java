package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    //Only general utility methods not related to a specific page.

    public static void sleep(int second){
        second *= 1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }
//• Arg1: WebDriver
//• Arg2: String expectedInUrl
//• Arg3: String expectedTitle
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle){

        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String each : allWindowHandles){
            driver.switchTo().window(each);
            System.out.println("Current url: "+driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }



}
