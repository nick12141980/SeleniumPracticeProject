package com.cydeo.tests.day06_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractice {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //2. Go to https://practice.cydeo.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }


    @Test
    public void dropdown_task5() throws InterruptedException {

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //3. Select Illinois
        //Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        //Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

        //5. Select California
        //Thread.sleep(1000);
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText);

    }

    @Test
    public void dropdown_task6(){
        //Select “December 1st, 1923” and verify it is selected.
        Select yearDropDown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropDown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropDown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using  : visible text
        yearDropDown.selectByVisibleText("1923");
        //Select month using   : value attribute
        monthDropDown.selectByValue("11");
        //Select day using : index number
        dayDropDown.selectByIndex(0);

        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        String actualYear = yearDropDown.getFirstSelectedOption().getText();
        String actualMonth = monthDropDown.getFirstSelectedOption().getText();
        String actualDay = dayDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedYear, actualYear);
        Assert.assertEquals(expectedMonth, actualMonth);
        Assert.assertEquals(expectedDay, actualDay);


    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


}
