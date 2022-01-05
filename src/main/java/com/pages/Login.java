package com.pages;

import com.seleniumBase.MyBrowser;
import org.openqa.selenium.By;

public class Login extends MyBrowser {

    public Login enterUserName(String userName) {
        driver.findElement(By.xpath(properties.getProperty("UsernameXpath"))).sendKeys(userName);
        return this;

    }

    public Login enterUserPassword(String userPassword) {
        driver.findElement(By.xpath(properties.getProperty("PasswordXpath"))).sendKeys(userPassword);
        return this;
    }

    public Login clickLogin() {
        driver.findElement(By.xpath(properties.getProperty("clickLoginXpath"))).click();
        return new DashboardPage();
    }

    public Login forgetPassword() {
        driver.findElement(By.xpath(properties.getProperty("forgetPassword")));
        return new forgetPassWordPage();
    }

}
