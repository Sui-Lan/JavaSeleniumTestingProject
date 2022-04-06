package com.example.page;

import com.example.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    IBasePage iBasePage = new BasePage();

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement linkFormAuthentication;

    @FindBy(xpath = "//a[contains(@href, '/add_remove_elements')]")
    private WebElement linkAddRemoveElements;

    @FindBy(xpath = "//a[@href='/basic_auth']")
    private WebElement linkBasicAuth;

    @FindBy(xpath = "//a[@href='/broken_images']")
    private WebElement linkBrokenImages;

    @FindBy(xpath = "//a[@href='/checkboxes']")
    private WebElement linkCheckBoxes;

    @FindBy(xpath = "//a[@href='/context_menu']")
    private WebElement linkContextMenu;

    public void clickLinkFormAuthentication() {
        iBasePage.clickElement(linkFormAuthentication);
    }

    public void clickLinkAddRemoveElements() {
        iBasePage.clickElement(linkAddRemoveElements);
    }

    public void clickLinkBasicAuth() {
        iBasePage.clickElement(linkBasicAuth);
    }

    public void clickLinkBrokenImages() {
        iBasePage.clickElement(linkBrokenImages);
    }

    public void clickLinkContextMenu() {
        iBasePage.clickElement(linkContextMenu);
    }

}
