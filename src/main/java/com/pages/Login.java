package com.pages;

import com.seleniumBase.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Login extends Browser {
//    public Login(RemoteWebDriver driver){
//        this.driver=driver;
//    }


    public Login enterUserName(String userName) {
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
        return this;

    }

    public Login enterUserPassword(String userPassword) {
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(userPassword);
        return this;
    }

    public Login clickLogin() {
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        return new dashboardPage();
    }

    public Login forgetPassword() {
        driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']"));
        return new forgetPassWordPage();
    }

}
