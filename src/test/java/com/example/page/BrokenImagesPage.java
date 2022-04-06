package com.example.page;

import com.example.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BrokenImagesPage {

    public BrokenImagesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    IBasePage iBasePage = new BasePage();

    @FindBy(tagName = "img")
    private List<WebElement> listImages;

    public List<WebElement> getListImages() {
        return listImages;
    }
}
