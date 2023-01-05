package com.baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Libraryclass {
    public static WebDriver driver;
    public static Properties prop;
    public void launchApplication() throws IOException {

        InputStream input=new FileInputStream("src/test/resources/Config.property/Config.property");
        prop=new Properties();
        prop.load(input);

        if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.navigate().to(prop.getProperty("url"));

    }





    public void quit() {
        driver.close();
    }
}
