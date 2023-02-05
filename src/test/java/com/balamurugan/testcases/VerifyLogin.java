package com.balamurugan.testcases;

import com.balamurugan.baseclass.BaseClass;
import com.balamurugan.pages.LoginPage;
import org.testng.annotations.Test;

public class VerifyLogin extends BaseClass  {

    @Test
    public void runLogin() {
        new LoginPage(driver)
                .enterUserName()
                .enterPassword()
                .clickLogin()
                .isHomePagePageDisplayed();
    }
}
