package com.pages;

import com.baseclass.Libraryclass;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Libraryclass {
    WebDriver driver;
    public SearchPage() {
        this.driver = Libraryclass.driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
    WebElement popup;
    @FindBy(xpath = "//input[@type='text']")
    WebElement search;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;

    @FindBy(xpath = "//div[@class='_4rR01T']/../../..")
    WebElement selectproduct;

    @FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
    WebElement addtocart;

    public void clickcart(){
        popup.click();
        search.click();
    }

    public void enterProduct(){
        search.sendKeys("Mobiles");
    }

    public void clickSubmit()
    {
        submit.click();
    }
    public void clickSelectProduct(){
        selectproduct.click();
    }
    public void clickAddToCart(){
        addtocart.click();
    }
}
