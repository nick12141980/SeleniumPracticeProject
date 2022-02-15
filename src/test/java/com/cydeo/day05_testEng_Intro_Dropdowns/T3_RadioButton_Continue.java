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

       clickAndVerifyRadioButton(driver, "sport","hockey");
        driver.close();


    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){

        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButtons) {
            String eachID = each.getAttribute("id");

            if (eachID.equals(idValue)){
                each.click();
                System.out.println(eachID +" is selected: "+each.isSelected());
                break;
            }
        }
    }
}
