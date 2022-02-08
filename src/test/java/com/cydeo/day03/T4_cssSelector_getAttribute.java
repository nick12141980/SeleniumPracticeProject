package com.cydeo.day03;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getAttribute {


    public static void main(String[] args) {

       // 1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        //WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedButtonText = "Reset password";
        String actualButtonText = resetPasswordButton.getText();

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
