package com.pages;

import com.baseclass.Libraryclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectionPage extends Libraryclass {
    public CollectionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//div[text()='Appliances']" )
    WebElement appliances;
    @FindBy(className = "kJjFO0 _3DIhEh")
    WebElement airconditioner;
    @FindBy(xpath = "//div[text()='CARRIER 1 Ton 3 Star Split Air Filtration with High Density Filter AC  - White']")
    WebElement typesofac;
    @FindBy(className ="_2KpZ6l _2U9uOA _3v1-ww" )
    WebElement actocart;

    public void clickapp(){
        appliances.click();
    };
    public void clickac(){
        airconditioner.click();
    }
    public void setTypesofac(){
        typesofac.click();
    }
    public void setActocart(){
        actocart.click();
    }
}

