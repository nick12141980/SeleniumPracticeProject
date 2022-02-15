package com.cydeo.day05_testEng_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {

    public static void main(String[] args) throws InterruptedException {

        //TC #1: StaleElementReferenceException handling

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        Thread.sleep(1500);
        addElementButton.click();

        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        System.out.println("deleteButton = " + deleteButton.isDisplayed());

        //5. Click to “Delete” button.
        deleteButton.click();
        try {
            System.out.println("deleteButton = " + deleteButton.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException is thrown");
            System.out.println("deleteButton.isDisplayed() = false");
        }

        //6. Verify “Delete” button is NOT displayed after clicking.
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
