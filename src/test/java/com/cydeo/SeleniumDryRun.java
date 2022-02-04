package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDryRun {

    public static void main(String[] args) {

        //Set up Web Driver manger
        WebDriverManager.chromedriver().setup();

        //Create WebDriver object
        WebDriver driver = new ChromeDriver();

        //Navigate to https://google.com
         driver.get("https://google.com");



    }
}
