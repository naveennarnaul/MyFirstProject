package com.Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hook {

    public static WebDriver driver;

    @Before
    public WebDriver SetUp(){

   //     System.setProperty("webdriver.chrome.driver", "src/test/java/com/resources/chromedriver");
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        String url = "http://automationpractice.com/index.php";
        driver.get(url);
        System.out.println("Browser has been opened");


        return driver;


    }





   @After
    public void close() {

        driver.quit();
        System.out.println("browser closed");
    }





}
