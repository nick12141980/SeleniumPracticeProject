package com.cydeo.tests.day01_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");

        String expTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String title = driver.getTitle();

        if (title.equals(expTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed: "+driver.getTitle());
        }

        Thread.sleep(4000);
        driver.close();
    }
}
/*
TC #1: Yahoo Title Verification
1.Open Chrome browser
2.Go to https://www.yahoo.com
3.Verify title:
Expected: Yahoo
 */