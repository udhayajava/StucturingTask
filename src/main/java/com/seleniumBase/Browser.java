package com.seleniumBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Browser {
    public static  RemoteWebDriver driver;
    String URL = "https://opensource-demo.orangehrmlive.com/";
    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.navigate().to(URL);
    }
    @AfterMethod
    public void closeBrowser() {
      driver.quit();
    }
}
