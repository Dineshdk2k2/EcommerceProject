package com.stepdefinition;

import com.baseclass.Libraryclass;
import com.pages.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.io.IOException;

public class LoginPageStepDefinition extends Libraryclass {
    Loginpage Login;

    @Given("To launch the browser and enter to url")
    public void to_launch_the_browser_and_enter_to_url() throws IOException {
    launchApplication();
    Login=new Loginpage();
    }

    @When("Click the Login")
    public void click_the_Login() {
Login.click_login();
    }

    @When("Enter username and password")
    public void enter_username_and_password() throws InterruptedException {
Login.entermnoandpw("9894746314","Gugan@123" );
    }

    @Then("Click submit")
    public void click_submit() {

        Login.click_submit();
    }
}