package com.example.test;

import com.example.page.ContextMenuPage;
import com.example.page.HomePage;
import com.example.utils.Driver;
import org.junit.Assert;
import org.junit.Test;

public class ContextMenuTest extends BaseTest {

    HomePage homePage = new HomePage();
    ContextMenuPage contextMenuPage = new ContextMenuPage();

    private String message = "You selected a context menu";

    @Test
    public void clickSquareBoxTest() {

        homePage.clickLinkContextMenu();
        contextMenuPage.rightClickSquareHotSpot();

        String getActualAlertContent = Driver.getDriver().switchTo().alert().getText();
        String expectedAlertContent = "You selected a context menu";

        Assert.assertEquals(getActualAlertContent, expectedAlertContent);
    }

}
