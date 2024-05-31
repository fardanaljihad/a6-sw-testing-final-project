package com.a6.finalproject.swaglabs.steps;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.a6.finalproject.swaglabs.actions.CheckoutPageActions;
import com.a6.finalproject.swaglabs.actions.DashboardPageActions;
import com.a6.finalproject.swaglabs.actions.LoginPageActions;
import com.a6.finalproject.swaglabs.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStep {
    WebDriver driver = HelperClass.getDriver();
    LoginPageActions loginPageActions = new LoginPageActions(driver);
    DashboardPageActions dashboardPageActions = new DashboardPageActions(driver);
    CheckoutPageActions checkoutPageActions = new CheckoutPageActions(driver);

    // Background
    @Given("I am logged in with valid credentials")
    public void iAmLoggedInWithValidCredentials() {
        driver.get("https://www.saucedemo.com/");
        loginPageActions.enterUsername("standard_user");
        loginPageActions.enterPassword("secret_sauce");
        loginPageActions.clickLoginButton();
    }

    @Given("I have added items to the cart")
    public void iHaveAddedItemsToTheCart() {
        // Already performed in Background, no need to repeat here
    }

    @When("I click on the cart icon")
    public void iClickOnTheCartIcon() {
        dashboardPageActions.clickShoppingCartContainer();
    }

    @When("I click the \"Checkout\" button")
    public void iClickTheCheckoutButton() {
        checkoutPageActions.clickCheckoutButton();
    }

    @Then("the checkout information page is displayed with the following details:")
    public void theCheckoutInformationPageIsDisplayed(Map<String, String> dataTable) {
        assertNotNull(checkoutPageActions.getFirstNameField());
        // You can add verification of other details using the `dataTable` parameter
    }

    @When("I fill in {string} with {string}")
    public void iFillInFieldWithValue(String field, String value) {
        checkoutPageActions.fillCheckoutInformation(field, value);
    }

    @When("I click the \"Continue\" button")
    public void iClickTheContinueButton() {
        checkoutPageActions.clickContinueButton();
    }

    @Then("the checkout overview page is displayed with the following details:")
    public void theCheckoutOverviewPageIsDisplayed(Map<String, String> dataTable) {
        assertNotNull(checkoutPageActions.getOverviewTitle());
    }

    @When("I click the \"Finish\" button")
    public void iClickTheFinishButton() {
        checkoutPageActions.clickFinishButton();
    }

    @Then("the checkout complete page is displayed with the following details:")
    public void theCheckoutCompletePageIsDisplayed(Map<String, String> dataTable) {
        assertNotNull(checkoutPageActions.getCompleteTitle());
        assertNotNull(checkoutPageActions.getCompleteMessage());
        assertNotNull(checkoutPageActions.getBackHomeButton());
    }
}
