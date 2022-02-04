package com.cydeo.day02_Locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Go to google.com
        driver.get("https://google.com");

        //Write "apple" in the search block and press enter using Keys.ENTER
        WebElement searchBox = driver.findElement(By.name("q")); // finds the search box
        searchBox.sendKeys("apple"+ Keys.ENTER);

        //Verify title
        //Title should start with "apple"
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }


    }
}
