package com.pages;

import com.baseclass.Libraryclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage extends Libraryclass {
    public SigninPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Login']")
    WebElement login;
    @FindBy(xpath = "//a[text()='New to Flipkart? Create an account']")
    WebElement newaccount;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    WebElement mblnum;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement signup;

    public void click_login() {
        login.click();
    }
    public void click_newacc(){
        newaccount.click();
    }
    public void setNewaccount() throws InterruptedException {
        Thread.sleep(5000);
        mblnum.sendKeys( "9894746314");
    }

    public void setSignup(){
        signup.click();
    }


}
