package com.cydeo.day05_testEng_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_Continue {

    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //Locate name='sports' radio buttons and store them in the list of web elements
        List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));

        //Loop through the list of the elements and select 'hockey'

        for (WebElement each : sportRadioButtons) {
            String eachID = each.getAttribute("id");
            System.out.println("eachID = " + eachID);
            if (eachID.equals("hockey")){
                each.click();
                System.out.println("Hockey is selected: "+each.isSelected());
                break;
            }
        }
        driver.close();


    }
}
