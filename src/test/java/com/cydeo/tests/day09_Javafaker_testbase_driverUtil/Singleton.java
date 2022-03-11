package com.cydeo.tests.day09_Javafaker_testbase_driverUtil;

public class Singleton {

    //Create private constructor
    private Singleton(){}

    //Create private static String
    //prevent access and provide getter method
    private static String word;

    //This utility method will return "word" in the way we want to return it
    public static String getWord(){
        if (word == null){
            System.out.println("First time call. Word object is null. Assigning value to it now.");
            word = "something";
        }else{
            System.out.println("Word has value already");
        }
        return word;
    }








}
