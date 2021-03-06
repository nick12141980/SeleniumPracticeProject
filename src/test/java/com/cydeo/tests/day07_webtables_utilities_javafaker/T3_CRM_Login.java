package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_utilities;
import org.testng.annotations.Test;

public class T3_CRM_Login extends TestBase {



    /*
    ////1. Create new test and make set ups
    @Test
    public void crmLoginTest(){

        //2. Go to : https://login1.nextbasecrm.com/
        driver.get(" https://login1.nextbasecrm.com/");

        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser

        //3. Enter valid username
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk13@cybertekschool.com");

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");
    }
*/
    @Test
    public void crmLoginTest2(){

        //2. Go to : https://login1.nextbasecrm.com/
        driver.get(" https://login1.nextbasecrm.com/");

        //calling utility method to log in helpdesk1
        CRM_utilities.crm_login(driver);

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");
    }

    @Test
    public void crmLoginTest3(){

        //2. Go to : https://login1.nextbasecrm.com/
        driver.get(" https://login1.nextbasecrm.com/");

        BrowserUtils.sleep(3);

        //calling utility method to log in helpdesk5
        CRM_utilities.crm_login(driver, "helpdesk5@cybertekschool.com","UserUser");

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"(2) Portal");
    }
}
