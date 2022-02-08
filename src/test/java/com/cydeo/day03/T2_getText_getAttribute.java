package com.cydeo.day03;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get(" https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)) {
            System.out.println("Passed");
        }else{
            System.out.println("actualRememberMeLabel = " + actualRememberMeLabel);
            System.out.println("expectedRememberMeLabel = " + expectedRememberMeLabel);
            System.out.println("Failed");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotYourPassword = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotYourPassword = "Forgot your password?";
        String actualForgotYourPassword = forgotYourPassword.getText();

        if (actualForgotYourPassword.equals(expectedForgotYourPassword)){
            System.out.println("Passed");
        }else{
            System.out.println("actualForgotYourPassword = " + actualForgotYourPassword);
            System.out.println("expectedForgotYourPassword = " + expectedForgotYourPassword);
            System.out.println("Failed");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualHrefAttribute = forgotYourPassword.getAttribute("href");

        if (expectedInHref.equals(actualHrefAttribute)) {
            System.out.println("Passed");
        }else{
            System.out.println("actualHrefAttribute = " + actualHrefAttribute);
            System.out.println("expectedInHref = " + expectedInHref);
            System.out.println("Failed");
        }

    }
}
/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes
 */