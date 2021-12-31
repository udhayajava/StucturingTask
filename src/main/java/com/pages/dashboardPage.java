package com.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

public class dashboardPage extends Login {
    String dashboardUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
    public dashboardPage() {
        if (driver.getCurrentUrl().equals(dashboardUrl)){
            System.out.println("Dashboard page is opened");
        } else {
            System.out.println("check username and password");
        }

    }
}
