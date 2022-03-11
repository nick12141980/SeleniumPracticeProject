package com.cydeo.tests.day01_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException{

        //1. Set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2. Create instance of the Selenium WebDriver
        //Following line opens empty browser
        WebDriver driver = new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        Thread.sleep(1000);

       // driver.manage().window().fullscreen();

        //3. Go to tesla.com
        driver.get("https://tesla.com");

        //slow down the execution
        Thread.sleep(1000);

        //Use Selenium to navigate back
        driver.navigate().back();

        //slow down the execution
        Thread.sleep(1000);

        //Use Selenium to navigate forward
        driver.navigate().forward();

        //slow down the execution
        Thread.sleep(1000);

        //Use Selenium to refresh
        driver.navigate().refresh();

        //slow down the execution
        Thread.sleep(1000);

        //get the title of a page
        System.out.println(driver.getTitle());

        //get current URL
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        //use navigate().to() method
         driver.navigate().to("https://google.com");

        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);

        currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        //this will close currently open window
        //driver.close();

        //this will close all the opened windows, close the current session
        driver.quit();



    }
}
