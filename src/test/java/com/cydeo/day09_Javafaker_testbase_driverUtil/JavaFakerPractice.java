package com.cydeo.day09_Javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){
        //Creating faker object to access methods
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        //random numbers
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));
        System.out.println("faker.numerify(\"347-###-####\") = " + faker.numerify("347-###-####"));

        //random letters
        System.out.println("faker.letterify(\"??????????\") = " + faker.letterify("??????????"));
        //random letters and numbers
        System.out.println("faker.bothify(\"##??-###??\") = " + faker.bothify("##??-###??"));

        
    }
}
