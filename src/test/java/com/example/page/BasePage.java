package com.example.page;

import com.example.utils.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage implements IBasePage {

    @Override
    public void waitAndClickElement(WebElement element) {
        Driver.getDriverWait(30).until(ExpectedConditions.elementToBeClickable(element));
    }

    @Override
    public void waitDisplayedElement(WebElement element) {
        Driver.getDriverWait(30).until(ExpectedConditions.visibilityOf(element));
    }

    @Override
    public void waitDisplayedAlertBox() {
       Driver.getDriver().switchTo().alert().sendKeys("Text");

    }

    @Override
    public void sendKeys(WebElement element, String text) {
        waitDisplayedElement(element);
        element.sendKeys(text);
    }

    @Override
    public void submitElement(WebElement element) {
        waitDisplayedElement(element);
        element.submit();
    }

    @Override
    public void clickElement(WebElement element) {
        waitDisplayedElement(element);
        element.click();
    }

    @Override
    public boolean verificationDisplayedElement(WebElement element) {
        return element.isDisplayed();
    }

    @Override
    public void hoverElement(WebElement elementPrimary, WebElement elementSecondary) {
    }

    @Override
    public void alertBoxGetText() {
        Driver.getDriverWait(30).until(ExpectedConditions.alertIsPresent());
        Alert promptAlert  = Driver.getDriver().switchTo().alert();
        String alertText = promptAlert.getText();
        System.out.println("Alert text is " + alertText);
    }
}
