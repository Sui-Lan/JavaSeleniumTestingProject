package com.example.page;

import com.example.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    IBasePage iBasePage = new BasePage();

    public LoginPage() {
        // PageFactory.initElements() takes the driver instance
        // of the given class and the class type, and returns a Page Object with its fields fully initialized.
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(css = "button")
    private WebElement buttonLogin;

    @FindBy(id = "flash-messages")
    private WebElement invalidLoginMessage;

    private String validUsername = "tomsmith";

    private String validPassword = "SuperSecretPassword!";

    public WebElement getInvalidLoginMessage() {
        return invalidLoginMessage;
    }

    private String invalidPassword = "invalidPass";

    public void typeUsername() {
        iBasePage.sendKeys(usernameField, validUsername);
    }

    public void typeValidPassword() {
        iBasePage.sendKeys(passwordField, validPassword);
    }

    public void clickLoginButton() {
        iBasePage.clickElement(buttonLogin);
    }

    public void invalidLoginCredentialsMessage() {
        iBasePage.sendKeys(passwordField, invalidPassword);
    }


}
