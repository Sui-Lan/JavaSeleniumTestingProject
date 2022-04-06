package com.example.page;

import com.example.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPage {

    public ContextMenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    IBasePage iBasePage = new BasePage();

    @FindBy(id = "hot-spot")
    private WebElement squareHotSpot;

    public WebElement getSquareHotSpot() {
        return squareHotSpot;
    }

    public void rightClickSquareHotSpot() {
        iBasePage.waitDisplayedElement(squareHotSpot);
        iBasePage.secondaryClickElement(squareHotSpot);
        iBasePage.waitAlertIsPresent();
    }

}
