package com.example.test;

import com.example.page.HomePage;
import com.example.page.LoginPage;
import com.example.page.WelcomeLoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    WelcomeLoginPage welcomeLoginPage = new WelcomeLoginPage();

    @Test
    public void loginTest() {
        homePage.clickLinkFormAuthentication();
        loginPage.typeUsername();
        loginPage.typeValidPassword();
        loginPage.clickLoginButton();
        Assert.assertTrue(welcomeLoginPage.getButtonLogout().isDisplayed());
    }

    @Test
    public void loginFailedTest() {
        homePage.clickLinkFormAuthentication();
        loginPage.invalidLoginCredentialsMessage();
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.getInvalidLoginMessage().isDisplayed());
    }

}
