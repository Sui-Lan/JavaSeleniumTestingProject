package com.example.test;

import com.example.page.AddRemoveElementsPage;
import com.example.page.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class AddRemoveElementsPageTest extends BaseTest {

    HomePage homePage = new HomePage();
    AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage();

    @Test
    public void addElementTest() {
        homePage.clickLinkAddRemoveElements();
        addRemoveElementsPage.clickAddElementButton();
        Assert.assertTrue(addRemoveElementsPage.getDeleteButton().isDisplayed());
    }

    @Test
    public void removeElementTest() {
        homePage.clickLinkAddRemoveElements();
        addRemoveElementsPage.clickAddElementButton();
        addRemoveElementsPage.clickDeleteButton();
        Assert.assertTrue(!addRemoveElementsPage.getDeleteButton().isDisplayed());
    }



}
