package com.a6.finalproject.swaglabs.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.a6.finalproject.swaglabs.actions.LoginPageActions;
import com.a6.finalproject.swaglabs.actions.DashboardPageActions;
import com.a6.finalproject.swaglabs.actions.CartPageActions;
import com.a6.finalproject.swaglabs.steps.*;

public class EndToEndSteps {
    LoginPageActions loginPageActions = new LoginPageActions(Hooks.driver);
    DashboardPageActions dashboardPageActions = new DashboardPageActions(Hooks.driver);
    CartPageActions cartPageActions = new CartPageActions(Hooks.driver);

    @When("I Click Checkout Button")
    public void i_click_checkout_button() {
        cartPageActions.clickCheckoutBtn();
    }

    @When("I Fill The Checkout Information")
    public void i_fill_the_checkout_information() {
        Hooks.driver.findElement(By.id("first-name")).sendKeys("John");
        Hooks.driver.findElement(By.id("last-name")).sendKeys("Doe");
        Hooks.driver.findElement(By.id("postal-code")).sendKeys("12345");
    }

    @When("I Click Continue Button")
    public void i_click_continue_button() {
        Hooks.driver.findElement(By.id("continue")).click();
    }

    @When("I Click Finish Button")
    public void i_click_finish_button() {
        Hooks.driver.findElement(By.id("finish")).click();
    }
    
    @When("I see the confirmation page")
    public void i_see_the_confirmation_page() {
        boolean paymetInformation = Hooks.driver.findElement(By.xpath("//*[@data-test='payment-info-value']")).getText().contains("SauceCard #31337");
        boolean shippingInformation = Hooks.driver.findElement(By.xpath("//*[@data-test='shipping-info-value']")).getText().contains("Free Pony Express Delivery!");
        boolean itemTotal = Hooks.driver.findElement(By.xpath("//*[@data-test='subtotal-label']")).getText().contains("$29.99");
        boolean tax = Hooks.driver.findElement(By.xpath("//*[@data-test='tax-label']")).getText().contains("$2.40");
        boolean total = Hooks.driver.findElement(By.xpath("//*[@data-test='total-label']")).getText().contains("$32.39");

        boolean confirmation = paymetInformation && shippingInformation && itemTotal && tax && total;
        assertEquals(true, confirmation);

    }

    @Then("I should see the confirmation message")
    public void i_should_see_the_confirmation_message() {
        boolean message = Hooks.driver.findElement(By.className("complete-header")).getText().contains("Thank you for your order!");
        assertEquals(true, message);
    }
}
