package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDefinitions {

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        System.out.println("User is on Google search page");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        System.out.println("User is seeing title is Google");
    }

}
