package com.stepdefinition;

import com.baseclass.Libraryclass;
import com.pages.FilterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterPageStepDefinition extends Libraryclass {
    FilterPage fpage;
    @Given("To Click the search field")
    public void to_click_the_search_field() {
        fpage.clickcart();
    }

    @Given("Enter the product")
    public void enter_the_product() {
        fpage.enterProduct();
    }

    @Given("Click the Magnifying Glass")
    public void click_the_magnifying_glass() {
        fpage.clickSubmit();
    }

    @When("Click the Filter Options")
    public void click_the_filter_options() {
    fpage.clickFilter();
        fpage.clickRealme();
    }

    @When("Click on The Select product")
    public void click_on_the_select_product() {
fpage.clickSelectProduct();
    }


    @Then("Add to The cart in Filter Page")
    public void add_to_cart() {
fpage.clickAddToCart();
    }
}
