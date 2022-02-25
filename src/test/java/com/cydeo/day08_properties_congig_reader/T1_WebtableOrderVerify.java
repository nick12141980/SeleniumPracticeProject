package com.cydeo.day08_properties_congig_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebtableOrderVerify {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void order_name_verify_test(){

        //Locate the cell
        WebElement bobMartinCell =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[7]/td[.='Bob Martin']"));

        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”
        String expectedName = "Bob Martin";
        String actualName = bobMartinCell.getText();

        Assert.assertEquals(actualName, expectedName);

        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
        WebElement bobOrderDate =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[7]/td[.='Bob Martin']/following-sibling::td[3]"));
        String expectedDate = "12/31/2021";
        String actualDate = bobOrderDate.getText();

        Assert.assertEquals(expectedDate, actualDate);
    }

    @Test
    public void test2(){
       String customerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Ned Stark");
    }
}
