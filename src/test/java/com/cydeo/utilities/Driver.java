package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {


    //Creating a private Constructor to close the access to tho object of this class from outside the class
    private Driver(){

    }

    //Making WebDriver private to close access from outside the class
    //It is static because it will be used in a static method
    private static WebDriver driver;

    //Creating a reusable utility method which will return the same driver instance when we call it
    public static WebDriver getDriver(){

        if (driver == null){

            //Reading browser type from configuration.properties so we can control which browser is opened from outside
            //our code
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }else{
            return driver;
        }


    }

}
