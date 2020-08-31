package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day10_isDisplayed {
    static WebDriver driver; // instance variable
    @BeforeClass
    public static void setUp(){
        // driver'ı kullanabilir hale getiriyoruz.
        WebDriverManager.chromedriver().setup();
        // driver nesnesini oluşturalım.
        driver = new ChromeDriver();
        // driver komutlarımı girelim.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test1(){

    }





    @AfterClass
    public static void tearDown(){
        // driver.quit();
    }




}
