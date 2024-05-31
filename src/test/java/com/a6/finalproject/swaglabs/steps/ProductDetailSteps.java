package com.a6.finalproject.swaglabs.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.openqa.selenium.WebDriver;

import com.a6.finalproject.swaglabs.actions.DashboardPageActions;
import com.a6.finalproject.swaglabs.actions.ProductDetailPageActions;
import com.a6.finalproject.swaglabs.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailSteps {
  WebDriver driver = HelperClass.getDriver();
  DashboardPageActions dashboardPageActions = new DashboardPageActions(driver);
  ProductDetailPageActions productDetailPageActions = new ProductDetailPageActions(driver);

  // Sudah ada di CartSteps
  // Background 
  // @Given("User has logged in with valid credentials")
  // public void user_has_logged_in_with_valid_credentials() {
  //   // Write code here that turns the phrase above into concrete actions
  //   throw new io.cucumber.java.PendingException();
  // }

  // Scenario 1
  // Sudah ada di CartSteps
  // @Given("User is on the dashboard page")
  // public void user_is_on_the_dashboard_page() {
  //   // Write code here that turns the phrase above into concrete actions
  //   throw new io.cucumber.java.PendingException();
  // }

  @When("User clicks on the product image of {string} on the dashboard page")
  public void user_clicks_on_the_product_image_of_on_the_dashboard_page(String itemName) {
    switch (itemName) {
      case "Sauce Labs Backpack":
        dashboardPageActions.clickSauceLabsBackpackImg();
        break;
      case "Sauce Labs Bike Light":
        dashboardPageActions.clickSauceLabsBikeLightImg();
        break;
      default:
        throw new IllegalArgumentException("Invalid item name: " + itemName);
    }
  }

  @Then("User sees the image, name, description, and price information of {string}")
  public void user_sees_the_image_name_description_and_price_information_of(String itemName) {
    productDetailPageActions.isProductInformationTrue(itemName);
  }

  // Scenario 2
  @Given("User is on the product detail page")
  public void user_is_on_the_product_detail_page() {
    dashboardPageActions.clickSauceLabsBackpackImg();
  }
  @When("User clicks the add to cart button")
  public void user_clicks_the_add_to_cart_button() {
    productDetailPageActions.clickAddToCartBtn();
  }
  @Then("The product is added to the cart")
  public void the_product_is_added_to_the_cart() {
    assertNotNull(dashboardPageActions.getNumberOfItemsInCart());
  }

  // Scenario 3
  @When("User clicks the back to products button")
  public void user_clicks_the_back_to_products_button() {
    productDetailPageActions.clickBackToProductsBtn();
  }
  @Then("User is navigated to the dashboard page")
  public void user_is_navigated_to_the_dashboard_page() {
    String expectedResult = "https://www.saucedemo.com/inventory.html";
    String actualResult = driver.getCurrentUrl();

    assertEquals(expectedResult, actualResult);
  }

}
