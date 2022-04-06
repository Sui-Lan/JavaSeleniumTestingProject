package com.example.page;

import com.example.utils.Driver;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BasePage implements IBasePage {

    Actions actions = new Actions(Driver.getDriver());

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

    @Override
    public void verifyImageActive(List<WebElement> imagesList) {
        int invalidImageCount = 0;
        try {
            for (WebElement img : imagesList) {
                if (img != null) {
                    HttpClient client = HttpClientBuilder.create().build();
                    HttpGet request = new HttpGet(img.getAttribute("src"));
                    HttpResponse response = client.execute(request);
                    // verifying response code, the HttpStatus should be 200 if not,
                    // increment as invalid images count
                    if (response.getStatusLine().getStatusCode() != 200)
                        invalidImageCount++;
                }
            }
            System.out.println("Total no. of images broken are " + invalidImageCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void secondaryClickElement(WebElement element) {
        actions.contextClick(element).perform();
    }

    @Override
    public void waitAlertIsPresent() {
        Driver.getDriverWait(30).until(ExpectedConditions.alertIsPresent());
    }
}
