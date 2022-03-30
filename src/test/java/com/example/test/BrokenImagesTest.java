package com.example.test;

import com.example.page.BrokenImagesPage;
import com.example.page.HomePage;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class BrokenImagesTest {

    BrokenImagesPage brokenImagesPage = new BrokenImagesPage();
    HomePage homePage = new HomePage();

    private int invalidImageCount = 0;

    public void verifyimageActive(WebElement image) {
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(image.getAttribute("src"));
            HttpResponse response = client.execute(request);
            // verifying response code, the HttpStatus should be 200 if not,
            // increment as invalid images count
            if (response.getStatusLine().getStatusCode() != 200)
                invalidImageCount++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validateInvalidImages() {
        invalidImageCount = 0;
        homePage.clickLinkBrokenImages();

        System.out.println("Total no. of images are " + brokenImagesPage.getListImages().size());
        for (WebElement i : brokenImagesPage.getListImages()) {
            if (i != null) {
                verifyimageActive(i);
            }
        }
    }
}
