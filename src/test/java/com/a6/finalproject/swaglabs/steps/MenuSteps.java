package com.a6.finalproject.swaglabs.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import com.a6.finalproject.swaglabs.actions.LoginPageActions;
import com.a6.finalproject.swaglabs.actions.MenuPageActions;
import com.a6.finalproject.swaglabs.utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuSteps {
    WebDriver driver = HelperClass.getDriver();
    LoginPageActions loginPageActions = new LoginPageActions(driver);
    MenuPageActions menuPageActions = new MenuPageActions(driver);

    @Given("I am logged with valid credentials")
    public void LoginWithValidCredentials() {
        driver.get("https://www.saucedemo.com/");
        loginPageActions.enterUsername("standard_user");
        loginPageActions.enterPassword("secret_sauce");
        loginPageActions.clickLoginButton();
    }

    @Given("I was on the dashboard page")
    public void iAmOnTheDashboardPage() {
        Hooks.driver.get("https://www.saucedemo.com/inventory.html");
    }

    @When("I click the three-line icon at the top left of the dashboard page")
    public void iClickTheThreeLineIconAtTheTopLeftOfTheDashboardPage() {
        menuPageActions.clickThreeLineIcon();
        try {
            TimeUnit.SECONDS.sleep(1); // Menunggu selama 1 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("the page displays four menu options:")
    public void thePageDisplaysFourMenuOptions(List<String> menuOptions) {
        assertEquals(menuOptions, menuPageActions.getMenuOptions());
    }

    @When("I click the About menu")
    public void iClickTheAboutMenu() {
        menuPageActions.clickAboutMenu();
    }

    @Then("I should redirects to the information about Swag")
    public void thePageRedirectsToTheInformationAboutSwagLabsWebsite() {
        String expectedUrl = "https://saucelabs.com/";
        String actualUrl = Hooks.driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }    

    @Then("I should be logged out successfully")
    public void thePageRedirectsToTheLoginPage() {
        String expectedUrl = "https://www.saucedemo.com/";
        String actualUrl = Hooks.driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }
    
    @When("I click the Logout menu")
    public void iClickTheLogoutMenu() {
        menuPageActions.clickLogoutMenu();
    }
}
