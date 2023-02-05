package com.balamurugan.pages;

import com.balamurugan.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CreateLead extends BaseClass {

    public CreateLead(ChromeDriver driver) {
        this.driver = driver;
    }

    public CreateLead isCreateLeadPageDisplayed() {
        if (driver.findElement(By.xpath("//div[contains(@class,'sectionHeaderTitle')][text()='Create Lead']")).isDisplayed()) {
            return this;
        } else {
            Assert.fail("View Lead page not displayed");
        }
        return this;
    }

    public CreateLead enterCompanyName() {
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        return this;
    }

    public CreateLead enterFirstName() {
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bala");
        return this;
    }

    public CreateLead enterLastName() {
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murugan");
        return this;
    }

    public ViewLead submitCreateLeadForm() {
        driver.findElement(By.name("submitButton")).click();
        return new ViewLead(driver);
    }
}
