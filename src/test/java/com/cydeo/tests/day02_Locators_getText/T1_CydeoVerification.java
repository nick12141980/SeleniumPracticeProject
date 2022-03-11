package com.cydeo.tests.day02_Locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");

        if(driver.getCurrentUrl().contains("cydeo")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        if (driver.getTitle().equals("Practice")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }




    }


}
/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
 Expected: Practice
 */