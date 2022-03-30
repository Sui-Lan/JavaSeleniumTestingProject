package com.example.page;

import com.example.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeLoginPage {

    public WelcomeLoginPage() {
        // PageFactory.initElements() takes the driver instance
        // of the given class and the class type, and returns a Page Object with its fields fully initialized.
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='button secondary radius']")
    private WebElement buttonLogout;

    @FindBy(className = "subheader")
    private WebElement successMessage;

    public WebElement getButtonLogout() {
        return buttonLogout;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

}
