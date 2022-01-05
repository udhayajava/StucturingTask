package com.pages;

public class DashboardPage extends Login {
    public DashboardPage() {

    }

    public VerifyDashBoard isCorrectPage() {
        if (driver.getCurrentUrl().equals(properties.getProperty("dashboardUrl"))) {
            System.out.println("DashBoard Window");
            return new VerifyDashBoard();
        }
        return null;
    }


}
