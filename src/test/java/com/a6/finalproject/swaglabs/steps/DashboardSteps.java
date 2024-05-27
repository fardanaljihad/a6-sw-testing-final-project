package com.a6.finalproject.swaglabs.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.a6.finalproject.swaglabs.actions.LoginPageActions;
import com.a6.finalproject.swaglabs.actions.DashboardPageActions;

public class DashboardSteps {
    LoginPageActions loginPageActions = new LoginPageActions(Hooks.driver);
    DashboardPageActions dashboardPageActions = new DashboardPageActions(Hooks.driver);

    @Given("I am has logged in with valid credentials")
    public void i_am_has_logged_in_with_valid_credentials() {
        Hooks.driver.get("https://www.saucedemo.com/");
        loginPageActions.enterUsername("standard_user");
        loginPageActions.enterPassword("secret_sauce");
        loginPageActions.clickLoginButton();
    }

    @Given("I am on the dashboard page")
    public void i_am_on_the_dashboard_page() {
        Hooks.driver.get("https://www.saucedemo.com/inventory.html");
    }

    @When("I Click Add to Cart button on {string}")
    public void i_click_add_to_cart_button_on(String itemName) {
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

    @When("I Click Add to Cart button for all items")
    public void i_click_add_to_cart_button_for_multiple_items() {
        dashboardPageActions.clickAddToCartSauceLabsBackpack();
        dashboardPageActions.clickAddToCartSauceLabsBikeLight();
        dashboardPageActions.clickAddToCartSauceLabsBoltTShirt();
        dashboardPageActions.clickAddToCartSauceLabsFleeceJacket();
        dashboardPageActions.clickAddToCartSauceLabsOnesie();
        dashboardPageActions.clickAddToCartTestAllTheThingsTShirtRed();
    }

    @Then("I should see the {string} in the cart")
    public void i_should_see_the_items_in_the_cart(String itemname) {
        boolean itemInCart = Hooks.driver.findElement(By.className("inventory_item_name")).getText().contains(itemname);

        assertEquals(true, itemInCart);
    }

    @And("I Click Remove button on {string}")
    public void i_click_remove_button_on(String itemName) {
        switch (itemName) {
            case "Sauce Labs Backpack":
                dashboardPageActions.clickRemoveSauceLabsBackpack();
                break;
            case "Sauce Labs Bike Light":
                dashboardPageActions.clickRemoveSauceLabsBikeLight();
                break;
            case "Sauce Labs Bolt T-Shirt":
                dashboardPageActions.clickRemoveSauceLabsBoltTShirt();
                break;
            case "Sauce Labs Fleece Jacket":
                dashboardPageActions.clickRemoveSauceLabsFleeceJacket();
                break;
            case "Sauce Labs Onesie":
                dashboardPageActions.clickRemoveSauceLabsOnesie();
                break;
            case "Test.allTheThings() T-Shirt (Red)":
                dashboardPageActions.clickRemoveTestAllTheThingsTShirtRed();
                break;
            default:
                throw new IllegalArgumentException("Invalid item name: " + itemName);
        }
    }

    @And("I Open The Cart Page")
    public void i_open_the_cart_page() {
        dashboardPageActions.clickShoppingCartContainer();
    }

    @Then("I should not see the {string} in the cart")
    public void i_should_not_see_the_in_the_cart(String itemname) {
        boolean itemInCart = Hooks.driver.findElement(By.className("cart_list")).getText().contains(itemname);
        assertEquals(false, itemInCart);
    }

    @Then("I should see all items in the cart")
    public void i_should_see_all_items_in_the_cart() {
        boolean souceLabsBackpackinCart = Hooks.driver.findElement(By.className("cart_list")).getText().contains("Sauce Labs Backpack");
        boolean souceLabsBikeLightinCart = Hooks.driver.findElement(By.className("cart_list")).getText().contains("Sauce Labs Bike Light");
        boolean souceLabsBoltTShirtinCart = Hooks.driver.findElement(By.className("cart_list")).getText().contains("Sauce Labs Bolt T-Shirt");
        boolean souceLabsFleeceJacketinCart = Hooks.driver.findElement(By.className("cart_list")).getText().contains("Sauce Labs Fleece Jacket");
        boolean souceLabsOnesieinCart = Hooks.driver.findElement(By.className("cart_list")).getText().contains("Sauce Labs Onesie");
        boolean testAllTheThingsTShirtRedinCart = Hooks.driver.findElement(By.className("cart_list")).getText().contains("Test.allTheThings() T-Shirt (Red)");

        boolean allincart = souceLabsBackpackinCart && souceLabsBikeLightinCart && souceLabsBoltTShirtinCart && souceLabsFleeceJacketinCart && souceLabsOnesieinCart && testAllTheThingsTShirtRedinCart;
        assertEquals(true, allincart);
    }

}
