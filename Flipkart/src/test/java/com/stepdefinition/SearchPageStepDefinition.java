package com.stepdefinition;

import com.baseclass.Libraryclass;
import com.pages.Loginpage;
import com.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SearchPageStepDefinition extends Libraryclass {
    SearchPage spage;
    @Given("To launch the browser and enter to url site")
    public void to_launch_the_browser_and_enter_to_url() throws IOException {
        launchApplication();
        spage=new SearchPage();
    }

    @When("To Click the search")
    public void to_click_the_search() {
      spage.clickcart();

    }

    @And("Enter the search of product")
    public void enter_the_search_of_product() {
        spage.enterProduct();
    }

    @When("Click the Search Box")
    public void click_the_search_box() {
        spage.clickSubmit();
    }

    @And("Click The product")
    public void click_the_product() {
        spage.clickSelectProduct();
    }

    @Then("Add to cart in Search Page")
    public void add_to_cart() {
        spage.clickAddToCart();
    }

    }