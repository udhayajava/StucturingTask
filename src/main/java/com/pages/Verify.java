package com.pages;

import com.seleniumBase.MyBrowser;
import org.openqa.selenium.By;

public class Verify extends MyBrowser {
    public void verifyTitlePage(){
        String pageTitle = driver.getTitle();
        if (pageTitle.equals(properties.getProperty("ActualPageTitle"))){
            System.out.println("Actual PageTitle--->" +properties.getProperty("ActualPageTitle"));
            System.out.println("page title is equal to actual page");
            System.out.println("Page Title--->" +pageTitle);
        }else {
            System.out.println("Wrong page");
    }}

    public boolean getUserNameBox() {
        return driver.findElement(By.xpath(properties.getProperty("UserNameLabel"))).isDisplayed();
    }

    public boolean getPasswordBox() {
        return driver.findElement(By.xpath(properties.getProperty("PasswordLabel"))).isDisplayed();
    }

    public boolean getLoginButton() {
        return driver.findElement(By.xpath(properties.getProperty("ClickButtonLabel"))).isDisplayed();
    }
}
