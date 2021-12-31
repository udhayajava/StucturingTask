package com.pages;

import com.seleniumBase.Browser;
import org.openqa.selenium.By;

public class Verify extends Browser {
    String actualPageTitle = "OrangeHRM";
    public void verifyTitlePage(){
        String pageTitle = driver.getTitle();
        if (pageTitle.equals(actualPageTitle)){
            System.out.println("Actual PageTitle--->" +actualPageTitle);
            System.out.println("page title is equal to actual page");
            System.out.println("Page Title--->" +pageTitle);
        }else {
            System.out.println("Wrong page");
    }}

    public boolean getUserNameBox() {
        return driver.findElement(By.xpath("//span[normalize-space()='Username']")).isDisplayed();
    }

    public boolean getPasswordBox() {
        return driver.findElement(By.xpath("//span[normalize-space()='Password']")).isDisplayed();
    }

    public boolean getLoginButton() {
        return driver.findElement(By.xpath("//div[@id='divLoginButton']//following::input")).isDisplayed();
    }
}
