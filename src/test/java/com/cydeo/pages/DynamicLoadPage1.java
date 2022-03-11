package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadPage1 {

    public DynamicLoadPage1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebDriver startButton;

    @FindBy(css = "div#loading")
    public WebDriver loadingBar;

    @FindBy(css = "#username")
    public WebDriver inputUsername;

    @FindBy(css = "#pwd")
    public WebDriver inputPassword;

    @FindBy(xpath = "//button[.='Submit']")
    public WebDriver submitButton;

    @FindBy(id="flash")
    public WebDriver errorMessage;
}
