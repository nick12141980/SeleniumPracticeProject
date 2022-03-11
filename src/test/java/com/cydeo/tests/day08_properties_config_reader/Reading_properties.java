package com.cydeo.tests.day08_properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading_properties {

    @Test
    public void reading_from_properties_test() throws IOException {
        //1. Create the object of Properties class
        Properties properties = new Properties();

        //2. Open the file in Java memory
        FileInputStream file = new FileInputStream("configuration.properties");

        //3. Load the properties objectp
        properties.load(file);

        //4. Use properties object to read the value
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

    }
}
