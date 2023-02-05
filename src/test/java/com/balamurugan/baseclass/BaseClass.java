package com.balamurugan.baseclass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {

    public ChromeDriver driver;

    @BeforeMethod
    public void preCondition() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://leaftaps.com/opentaps/");
    }

    @AfterMethod
    public void postCondition() {
        driver.quit();
    }
}
