package com.pages;

import com.baseclass.Libraryclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPage extends Libraryclass {
    public FilterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@type='text']")
    WebElement search;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
    @FindBy(className = "_167Mu3 _2hbLCH")
    WebElement filter;
    @FindBy(xpath = "(//label[@class='_2iDkf8 t0pPfW'])[1]")
    WebElement realme;

    @FindBy(xpath = "(//div[@class='_4rR01T'])[1]")
    WebElement selecttheproduct;

    @FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
    WebElement addtocart;


    public void clickcart(){
        search.click();
    }
    public void enterProduct(){
        search.sendKeys("Mobiles");
    }

    public void clickSubmit()
    {
        submit.click();
    }
    public void clickFilter() {
      filter.click();
    }
    public void clickRealme() {
        realme.click();
    }
    public void clickSelectProduct(){
        selecttheproduct.click();
    }
    public void clickAddToCart(){
        addtocart.click();
    }
}



