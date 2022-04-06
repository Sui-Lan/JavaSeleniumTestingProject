package com.example.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (Driver.driver == null) {
            initializeDriver();
        }
        return Driver.driver;
    }

    private static void setDriver(WebDriver driver) {
        Driver.driver = driver;
    }

    public static void initializeDriver() {
        if (driver == null) {
            switch (ConfigurationReader.getProperty("browser")) {
                case "firefox":
                    System.out.println("----Firefox----");
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.navigate().to(ConfigurationReader.getProperty("url"));
                case "chrome":
                    System.out.println("----Chrome----");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.navigate().to(ConfigurationReader.getProperty("url"));
            }
        }
        setDriver(driver);
    }

    public static WebDriverWait getDriverWait(int timeOut) {

        return new WebDriverWait(Driver.getDriver(),timeOut);
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
