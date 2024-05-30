package com.a6.finalproject.swaglabs.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.a6.finalproject.swaglabs.actions.LoginPageActions;
import com.a6.finalproject.swaglabs.actions.CartPageActions;
import com.a6.finalproject.swaglabs.actions.DashboardPageActions;
import com.a6.finalproject.swaglabs.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {
  WebDriver driver = HelperClass.getDriver();
  LoginPageActions loginPageActions = new LoginPageActions(driver);
  DashboardPageActions dashboardPageActions = new DashboardPageActions(driver);
  CartPageActions cartPageActions = new CartPageActions(driver);

  // Background
  @Given("User has logged in with valid credentials")
  public void user_has_logged_in_with_valid_credentials() {
    driver.get("https://www.saucedemo.com/");
    loginPageActions.enterUsername("standard_user");
    loginPageActions.enterPassword("secret_sauce");
    loginPageActions.clickLoginButton();
  }

  @Given("User is on the dashboard page")
  public void user_is_on_the_dashboard_page() {
    String expectedResult = "https://www.saucedemo.com/inventory.html";
    String actualResult = driver.getCurrentUrl();

    assertEquals(expectedResult, actualResult);
  }

  // Scenario 1
  @Given("User clicks the add to cart button on the {string} product")
  public void user_clicks_the_add_to_cart_button_on_the_product(String itemName) {
    switch (itemName) {
      case "Sauce Labs Backpack":
        dashboardPageActions.clickAddToCartSauceLabsBackpack();
        break;
      case "Sauce Labs Bike Light":
        dashboardPageActions.clickAddToCartSauceLabsBikeLight();
        break;
      case "Sauce Labs Bolt T-Shirt":
        dashboardPageActions.clickAddToCartSauceLabsBoltTShirt();
        break;
      case "Sauce Labs Fleece Jacket":
        dashboardPageActions.clickAddToCartSauceLabsFleeceJacket();
        break;
      case "Sauce Labs Onesie":
        dashboardPageActions.clickAddToCartSauceLabsOnesie();
        break;
      case "Test.allTheThings() T-Shirt (Red)":
        dashboardPageActions.clickAddToCartTestAllTheThingsTShirtRed();
        break;
      default:
        throw new IllegalArgumentException("Invalid item name: " + itemName);
    }
  }

  @When("User clicks the cart icon")
  public void user_clicks_the_cart_icon() {
    dashboardPageActions.clickShoppingCartContainer();
  }

  @Then("User is navigated to the cart page")
  public void user_is_navigated_to_the_cart_page() {
    String expectedResult = "https://www.saucedemo.com/cart.html";
    String actualResult = driver.getCurrentUrl();

    assertEquals(expectedResult, actualResult);
  }

  @Then("User sees the {string} product")
  public void user_sees_the_product(String itemName) {
    String actualItemName = cartPageActions.getItemNameFromCartList(itemName);
    String expectedItemName = itemName;

    assertEquals(expectedItemName, actualItemName);
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
