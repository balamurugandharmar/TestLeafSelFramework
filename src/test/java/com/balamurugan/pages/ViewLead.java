package com.balamurugan.pages;

import com.balamurugan.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ViewLead extends BaseClass {

    public ViewLead(ChromeDriver driver) {
        this.driver = driver;
    }

    public ViewLead isViewLeadPageDisplayed() {
        if (driver.findElement(By.xpath("//div[contains(@class,'sectionHeaderTitle')][text()='View Lead']")).isDisplayed()) {
            return this;
        } else {
            Assert.fail("View Lead page not displayed");
        }
        return this;
    }

}
