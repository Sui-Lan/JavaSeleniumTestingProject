package com.example.page;

import com.example.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAuthPage {

    IBasePage iBasePage = new BasePage();
    HomePage homePage = new HomePage();

    public BasicAuthPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Sign in']")
    private WebElement SignInText;

    public WebElement getSignInText() {
        return SignInText;
    }

}
