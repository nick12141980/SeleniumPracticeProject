package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //1. Initialize the driver instance and object of thew class
    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
