package com.cydeo.day03;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected
        //Expected: Log In
        WebElement logInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedLoginButtonText = "Log In";
        //Getting the value of the attribute value
        String actualLoginButtonText = logInButton.getAttribute("value");

        if (expectedLoginButtonText.equals(actualLoginButtonText)){
            System.out.println("Passed");
        }else{
            System.out.println("actualLoginButtonText = " + actualLoginButtonText);
            System.out.println("expectedLoginButtonText = " + expectedLoginButtonText);
            System.out.println("Failed");
        }


    }
}
