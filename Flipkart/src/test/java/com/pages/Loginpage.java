package com.pages;

import com.baseclass.Libraryclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class Loginpage extends Libraryclass {
    WebDriver driver;
    public Loginpage() {
        this.driver = Libraryclass.driver;
        PageFactory.initElements(driver, this);
    }



        @FindBy(xpath = "//a[text()='Login']")
        WebElement login;


        @FindBy(xpath="(//input[@type='text'])[2]")
        WebElement entermobilenumber;

        @FindBy(xpath="//input[@type='password']")
        WebElement enterpassword;

        @FindBy(xpath="(//span[text()='Login'])[2]")
        WebElement submit;
        public void click_login() {
           login.click();
        }

        public void entermnoandpw(String MobileNum, String password) throws InterruptedException {
              Thread.sleep(3000);
              entermobilenumber.sendKeys(MobileNum);
              Thread.sleep(3000);
              enterpassword.sendKeys(password);}

          public void click_submit() {
          submit.click();

      }


}







