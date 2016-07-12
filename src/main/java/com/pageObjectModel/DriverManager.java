package com.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 8/05/2016.
 */
public class DriverManager {
    public  DriverManager(){
        PageFactory.initElements(driver,this);
    }
    public static WebDriver driver;


    public void openBrowser() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
        properties.load(fileInputStream);
        String browser = properties.getProperty("browser");
        String url = properties.getProperty("url");


        System.out.println(browser);
        System.out.println(url);
        if (browser.matches("Firefox"))
            driver = new FirefoxDriver();
        else if (browser.matches("IE"))
            driver = new InternetExplorerDriver();
        else if (browser.matches("chrome"))
            driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void closeBrowser() {
        driver.quit();
    }


}
