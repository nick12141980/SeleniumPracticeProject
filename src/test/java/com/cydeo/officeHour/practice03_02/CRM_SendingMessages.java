package com.cydeo.officeHour.practice03_02;

import com.cydeo.utilities.CRM_utilities;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CRM_SendingMessages {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //Getting th browser type dynamically from configuration.properties file
        String browserType = ConfigurationReader.getProperty("browser");

        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(ConfigurationReader.getProperty("env"));

        CRM_utilities.crm_login(driver);
    }

    @Test
    public void sendMessageTest(){
        //        Users are on the homepage
//        Users click the MESSAGE tab
        driver.findElement(By.id("feed-add-post-form-tab-message")).click();

//        Users write test message
        driver.switchTo().frame(driver.findElement(By.cssSelector(".bx-editor-iframe")));
        WebElement msgFrame=driver.findElement(By.tagName("body"));
        msgFrame.sendKeys("Hello!");

//        Users click the SEND button
        driver.switchTo().defaultContent();
        driver.findElement(By.id("blog-submit-button-save")).click();

//        Verify the message is displayed on the feed
        WebElement feed= driver.findElement(By.xpath("//div[starts-with(@id,'blog_post_body')]"));
        Assert.assertEquals(feed.getText(),"Hello!","Message did not appear!");
    }

    @AfterMethod
    public  void tearDown(){
        driver.quit();
    }

}
