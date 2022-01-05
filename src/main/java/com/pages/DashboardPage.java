package com.pages;

public class DashboardPage extends Login {
    public DashboardPage() {

    }

    /**
     * @description - here checking the current page is correctPage or not
     *
     */
    public VerifyDashBoard isCorrectPage() {
        if (driver.getCurrentUrl().equals(properties.getProperty("dashboardUrl"))) {
            System.out.println("DashBoard Window");
            return new VerifyDashBoard();
        }
            return null;
    }


}
