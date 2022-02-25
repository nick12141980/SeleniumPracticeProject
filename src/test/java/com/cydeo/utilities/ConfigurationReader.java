package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1. Create the object of Properties class
    private static Properties properties = new Properties();

    static {

        try {
            //2. Open the file in Java memory
            FileInputStream file = new FileInputStream("configuration.properties");
            //3. Load the properties object
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found in ConfigurationReader class.");
        }
    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
