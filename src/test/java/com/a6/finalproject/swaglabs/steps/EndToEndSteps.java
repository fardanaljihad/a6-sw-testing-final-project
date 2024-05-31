package com.a6.finalproject.swaglabs.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import java.util.Map;
import com.a6.finalproject.swaglabs.actions.LoginPageActions;
import com.a6.finalproject.swaglabs.actions.DashboardPageActions;
import com.a6.finalproject.swaglabs.actions.CartPageActions;
import com.a6.finalproject.swaglabs.actions.CheckoutPageActions;
import com.a6.finalproject.swaglabs.steps.*;

public class EndToEndSteps {
    LoginPageActions loginPageActions = new LoginPageActions(Hooks.driver);
    DashboardPageActions dashboardPageActions = new DashboardPageActions(Hooks.driver);
    CartPageActions cartPageActions = new CartPageActions(Hooks.driver);
    CheckoutPageActions checkoutPageActions = new CheckoutPageActions(Hooks.driver);

    @When("I Click Checkout Button")
    public void i_click_checkout_button() {
        cartPageActions.clickCheckoutBtn();
    }

    @When("I Fill The Checkout Information with:")
    public void i_fill_the_checkout_information(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);

        checkoutPageActions.fillfirstname(data.get("First name"));
        checkoutPageActions.filllastname(data.get("Last name"));
        checkoutPageActions.fillpostalcode(data.get("Postal code"));
    }

    @When("I Click Continue Button")
    public void i_click_continue_button() {
        checkoutPageActions.clickContinueButton();
    }

    @When("I Click Finish Button")
    public void i_click_finish_button() {
        checkoutPageActions.clickFinishButton();
    }
    
    @When("I see the information of the order details")
    public void i_see_the_confirmation_page() {
        boolean paymetInformation = checkoutPageActions.getPaymentInformation().getText().contains("SauceCard #31337");
        boolean shippingInformation = checkoutPageActions.getShippingInformation().getText().contains("Free Pony Express Delivery!");
        boolean itemTotal = checkoutPageActions.getItemTotal().getText().contains("$29.99");
        boolean tax = checkoutPageActions.getTax().getText().contains("$2.40");
        boolean total = checkoutPageActions.getTotal().getText().contains("$32.39");
        boolean confirmation = paymetInformation && shippingInformation && itemTotal && tax && total;
        assertEquals(true, confirmation);

    }

    @Then("I should see the confirmation message")
    public void i_should_see_the_confirmation_message() {
        boolean message = checkoutPageActions.getCompleteTitle().getText().contains("Thank you for your order!");
        // boolean message = Hooks.driver.findElement(By.className("complete-header")).getText().contains("Thank you for your order!");
        assertEquals(true, message);
    }
}
