package com.a6.finalproject.swaglabs.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.a6.finalproject.swaglabs.actions.LoginPageActions;



public class LoginSteps {
  // LoginPage objLoginPage = new LoginPage(Hooks.driver);
  LoginPageActions objLoginPage = new LoginPageActions(Hooks.driver);

  @Given("I am on the login page")
  public void iAmOnTheLoginPage() {
    Hooks.driver.get("https://www.saucedemo.com/");
  }

  @When("I enter username {string} and password {string}")
  public void iEnterUsernameAndPassword(String username, String password) {
    objLoginPage.enterUsername(username);
    objLoginPage.enterPassword(password);
  }

  @And("I click the login button")
  public void iClickTheLoginButton() {
    objLoginPage.clickLoginButton();
  }

  @Then("I should be logged in successfully")
  public void iShouldBeLoggedInSuccessfully() {
    String expectedUrl = "https://www.saucedemo.com/inventory.html";
    String actualUrl = Hooks.driver.getCurrentUrl();
    assertEquals(expectedUrl, actualUrl);
  }

  @Then("I should see an error message {string}")
  public void iShouldSeeAnErrorMessage(String expectedErrorMessage) {
    String actualErrorMessage = objLoginPage.getMessage();
    assertEquals(expectedErrorMessage, actualErrorMessage);
  }
}