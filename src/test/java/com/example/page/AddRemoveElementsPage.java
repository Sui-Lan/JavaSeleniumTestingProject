package com.example.page;

import com.example.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsPage {

    IBasePage iBasePage = new BasePage();

    public AddRemoveElementsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@onclick='addElement()']")
    private WebElement addElementButton;

    @FindBy(xpath = "//button[@onclick='deleteElement()']")
    private WebElement deleteButton;


    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public void clickAddElementButton() {
        iBasePage.clickElement(addElementButton);
    }

    public void clickDeleteButton() {
        iBasePage.clickElement(deleteButton);
    }


}
