package com.util;

import java.io.*;
import java.util.Properties;

public class Utility {

    static File file ;
    static Properties prop ;


    public static String readDataFromPropertyFile(String key)
    {
        try {

            file = new File("src/config.properties");
            FileInputStream fileInput ;
            prop = new Properties();
            fileInput = new FileInputStream(file);
            prop.load(fileInput);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return prop.getProperty(key);
    }





}
