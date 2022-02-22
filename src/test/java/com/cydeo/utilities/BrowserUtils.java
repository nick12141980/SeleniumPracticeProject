package com.cydeo.utilities;

public class BrowserUtils {

    //Only general utility methods not related to a specific page.

    public static void sleep(int second){
        second *= 1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }


}
