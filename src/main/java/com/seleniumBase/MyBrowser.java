package com.seleniumBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class MyBrowser {
    public static  RemoteWebDriver driver;
    public static Properties properties;
    @BeforeMethod
    public void openBrowser() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        FileInputStream stream = new FileInputStream("config.properties");
        properties = new Properties();
        properties.load(stream);
        driver.navigate().to(properties.getProperty("PageURL"));
    }
    @AfterMethod
    public void closeBrowser() {
      driver.quit();
    }
}
