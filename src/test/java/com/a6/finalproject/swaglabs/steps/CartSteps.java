package com.a6.finalproject.swaglabs.steps;

import org.openqa.selenium.WebDriver;

import com.a6.finalproject.swaglabs.actions.CartPageActions;
import com.a6.finalproject.swaglabs.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {
  WebDriver driver = HelperClass.getDriver();
  CartPageActions cartPageActions = new CartPageActions(driver);

  // Background
  @Given("User has logged in with valid credentials")
  public void user_has_logged_in_with_valid_credentials() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Given("User is on the dashboard page")
  public void user_is_on_the_dashboard_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  // Scenario 1
  @Given("User clicks the Add to cart button on the {string} product")
  public void user_clicks_the_add_to_cart_button_on_the_product(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @When("User clicks the cart icon")
  public void user_clicks_the_cart_icon() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("User is navigated to the cart page")
  public void user_is_navigated_to_the_cart_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("User sees the {string} product")
  public void user_sees_the_product(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  // Scenario 2
  @Given("User has added {string} to the cart")
  public void user_has_added_to_the_cart(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @When("User clicks the Checkout button")
  public void user_clicks_the_checkout_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("User is navigated to the checkout page")
  public void user_is_navigated_to_the_checkout_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("User sees the checkout information form")
  public void user_sees_the_checkout_information_form() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  // Scenario 3
  @Given("User is on the cart page")
  public void user_is_on_the_cart_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @When("User clicks the continue shopping button")
  public void user_clicks_the_continue_shopping_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("User is redirected to the dashboard page")
  public void user_is_redirected_to_the_dashboard_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
  
}
