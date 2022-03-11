package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ClassLocatorPractice {

    public static void main(String[] args) {

        //1- Open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get(" https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        WebElement homeButton = driver.findElement(By.className("nav-link"));
        homeButton.click();

        //4- Verify title is as expected:
        //Expected: Practice
        String expectedInTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (expectedInTitle.equals(actualTitle)) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        driver.close();

    }
}
/*
TC #4: Practice Cydeo – Class locator practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice
PS: Locate “Home” link using “className” locator
 */