package com.balamurugan.testcases;

import com.balamurugan.baseclass.BaseClass;
import com.balamurugan.pages.LoginPage;
import org.testng.annotations.Test;

public class VerifyCreateLead extends BaseClass {

    @Test
    public void verifyCreateLead() {
        new LoginPage(driver)
                .enterUserName()
                .enterPassword()
                .clickLogin()
                .isHomePagePageDisplayed()
                .clickCrmSfa()
                .clickLeads()
                .clickCreateLead()
                .isCreateLeadPageDisplayed()
                .enterCompanyName()
                .enterFirstName()
                .enterLastName()
                .submitCreateLeadForm()
                .isViewLeadPageDisplayed();
    }
}
