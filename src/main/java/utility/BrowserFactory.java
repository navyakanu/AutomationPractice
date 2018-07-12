package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class BrowserFactory extends PropertiesLoader {

    private static WebDriver driver = null;


    public static WebDriver SelectBrowser() throws IOException {

        String browser = PropertiesLoader.getPropertyDetails("Browser");

        switch (browser){
            case "chrome":
                driver = getChromeDriver();
                break;
            case "firefox":
                driver = getFirefoxDriver();
                break;
        }
        return driver;
    }


    private static WebDriver getChromeDriver() {
        String path = System.getProperty("user.dir") + "/src/main/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        return driver;
    }

    private static WebDriver getFirefoxDriver() {
        driver = new FirefoxDriver();
        return driver;
    }


}

//http://automationpractice.com/index.php

