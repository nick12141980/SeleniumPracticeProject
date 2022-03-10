package com.cydeo.day11_Actions_JsExecutor_Practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_and_Drop {

    @Test
    public void drag_and_drop_test(){
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

       // BrowserUtils.sleep(2);

        WebElement acceptCookiesBtn = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesBtn.click();

        //Locate the circles
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement largeCircle = Driver.getDriver().findElement(By.id("droptarget"));

        //2. Drag and drop the small circle to bigger circle.
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(2);
        //actions.dragAndDrop(smallCircle, largeCircle).perform();
        actions.clickAndHold(smallCircle).moveToElement(largeCircle).release().perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        Assert.assertEquals(largeCircle.getText(),"You did great!");
    }
}
