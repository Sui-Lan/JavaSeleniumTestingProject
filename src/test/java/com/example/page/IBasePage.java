package com.example.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public interface IBasePage {

    void waitAndClickElement(WebElement element);
    void waitDisplayedElement(WebElement element);
    void waitDisplayedAlertBox();
    void sendKeys(WebElement element, String text);
    void submitElement(WebElement element);
    void clickElement(WebElement element);
    boolean verificationDisplayedElement(WebElement element);
    void hoverElement(WebElement elementPrimary, WebElement elementSecondary);
    void alertBoxGetText();

}
