package com.pages;

import com.seleniumBase.MyBrowser;
import org.openqa.selenium.By;

public class Login extends MyBrowser {
    /**
     * @description In this method .Sending userName and Entering it.
     * @param userName - Passing userName
     * @return
     */
    public Login enterUserName(String userName) {
        driver.findElement(By.xpath(properties.getProperty("UsernameXpath"))).sendKeys(userName);
        return this;

    }

    /**
     * @discription - In this method. Sending Password and Entering it.
     * @param userPassword-Passing userPassword
     * @return
     */
    public Login enterUserPassword(String userPassword) {
        driver.findElement(By.xpath(properties.getProperty("PasswordXpath"))).sendKeys(userPassword);
        return this;
    }

    /**
     * @discription - In this function. Click action is done
     * @return - to dashboardPage
     */
    public Login clickLogin() {
        driver.findElement(By.xpath(properties.getProperty("clickLoginXpath"))).click();
        return new DashboardPage();
    }

    public Login forgetPassword() {
        driver.findElement(By.xpath(properties.getProperty("forgetPassword")));
        return new forgetPassWordPage();
    }

}
