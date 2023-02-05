package com.balamurugan.pages;

import com.balamurugan.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomePage extends BaseClass {

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public HomePage isHomePagePageDisplayed() {
        if (driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).isDisplayed()) {
            return this;
        } else {
            Assert.fail("Home Page navigation not successful");
        }
        return this;
    }

    public HomePage clickCrmSfa() {
        driver.findElement(By.linkText("CRM/SFA")).click();
        return this;
    }

    public HomePage clickLeads() {
        driver.findElement(By.linkText("Leads")).click();
        return this;
    }

    public CreateLead clickCreateLead() {
        driver.findElement(By.linkText("Create Lead")).click();
        return new CreateLead(driver);
    }
}
