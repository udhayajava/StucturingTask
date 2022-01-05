package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VerifyDashBoard extends Login{
    public void getLinkCount(){
        List<WebElement> listList = driver.findElements(By.xpath(properties.getProperty("Linkxpath")));
        int linkCount;
        for (linkCount = 1; linkCount < listList.size() ; ) {
            linkCount++;
        }
        System.out.println("Number of links "+linkCount);
    }
    public boolean isChecked(){
        driver.findElement(By.xpath(properties.getProperty("AdminTabXpath"))).click();
        WebElement checkBox = driver.findElement(By.xpath(properties.getProperty("CheckBoxXpath")));

        if( checkBox.isDisplayed()){
            checkBox.click();
            System.out.println("Checkbox is selected");
        }
        return checkBox.isSelected();
    }

}
