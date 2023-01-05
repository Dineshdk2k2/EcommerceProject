package com.stepdefinition;

import com.baseclass.Libraryclass;
import com.pages.CollectionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CollectionPageStepDefinition extends Libraryclass {
    CollectionPage cpage;
    @Given("To Click the Collection field Appliances")
    public void to_click_the_collection_field_appliances() {
        cpage.clickapp();

    }

    @When("Click The Select product ac")
    public void click_the_select_product_ac() {
        cpage.clickac();
        cpage.setTypesofac();
    }

    @Then("Add to Cart in Collction Page")
    public void add_into_cart() {
        cpage.setActocart();
    }
}
