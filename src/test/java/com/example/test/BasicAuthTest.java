package com.example.test;

import com.example.page.BasePage;
import com.example.page.BasicAuthPage;
import com.example.page.HomePage;
import com.example.page.IBasePage;
import org.junit.Test;

public class BasicAuthTest extends BaseTest {

    BasicAuthPage basicAuthPage = new BasicAuthPage();
    HomePage homePage = new HomePage();
    IBasePage iBasePage = new BasePage();


    @Test
    public void popUpBoxIsDisplayedTest() {
        homePage.clickLinkBasicAuth();
        iBasePage.alertBoxGetText();
    }



}
