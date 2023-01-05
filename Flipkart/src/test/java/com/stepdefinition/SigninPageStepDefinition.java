package com.stepdefinition;

import com.baseclass.Libraryclass;
import com.pages.SigninPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninPageStepDefinition extends Libraryclass {
    SigninPage sipage;
    @Given("Click the LoginButton")
    public void click_the_login_button() {
        sipage.click_login();
    }

    @Given("Click The New User Account")
    public void click_the_new_user_account() {
        sipage.click_newacc();
    }

    @When("Enter the Mobile Number")
    public void enter_the_mobile_number() throws InterruptedException {
        sipage.setNewaccount();

    }



    @Then("Click signin  button")
    public void click_signin_button() {
        sipage.setSignup();

    }
}
