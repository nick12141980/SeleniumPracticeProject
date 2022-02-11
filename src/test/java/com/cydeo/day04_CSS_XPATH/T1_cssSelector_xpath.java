package com.cydeo.day04_CSS_XPATH;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_cssSelector_xpath {

    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get(" https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link using css selector
        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']")); //class value
        WebElement homeLink2 = driver.findElement(By.cssSelector("a.nav-link")); //css selector syntax 2
        WebElement homeLink3 = driver.findElement(By.cssSelector("a[href='/']")); //href value

        //b. “Forgot password” header using css selector: locate parent element and move down to h2
        WebElement header1 = driver.findElement(By.cssSelector("div.example > h2")); //syntax 2
        //Locate header using xpath and using element's text
        WebElement header2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement header3 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement inputBox1 = driver.findElement(By.xpath("//input[@name='email']"));
        //using xpath contains method
        WebElement inputBox2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //e. “Retrieve password” button
        // //button[@class='radius']
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        driver.quit();

        //4. Verify all web elements are displayed.
        System.out.println("header1.isDisplayed() = " + header1.isDisplayed());
        System.out.println("header1.isDisplayed() = " + header1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox1.isDisplayed() = " + inputBox1.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible
    }
}
