package com.example.test;

import com.example.page.BasePage;
import com.example.page.BrokenImagesPage;
import com.example.page.HomePage;
import com.example.page.IBasePage;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.util.List;

public class BrokenImagesTest {

    IBasePage iBasePage = new BasePage();
    BrokenImagesPage brokenImagesPage = new BrokenImagesPage();
    HomePage homePage = new HomePage();

    @Test
    public void validateInvalidImages() {
        homePage.clickLinkBrokenImages();
        System.out.println("Total no. of images are " + brokenImagesPage.getListImages().size());
        iBasePage.verifyImageActive(brokenImagesPage.getListImages());
    }
}
