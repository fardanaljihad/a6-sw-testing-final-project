package com.a6.finalproject.swaglabs.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.a6.finalproject.swaglabs.utils.HelperClass;
import com.a6.finalproject.swaglabs.locators.LoginPageLocators;


public class LoginPageActions {
  WebDriver driver = HelperClass.getDriver();
  LoginPageLocators loginLocators;
  
  public LoginPageActions(WebDriver driver) {
    this.driver = driver;
    this.loginLocators = new LoginPageLocators();
    PageFactory.initElements(driver, loginLocators);
  }

  // Actions
  public void enterUsername(String username) {
    loginLocators.usernameField.sendKeys(username);
  }

  public void enterPassword(String password) {
    loginLocators.passwordField.sendKeys(password);
  }

  public void clickLoginButton() {
    loginLocators.loginButton.click();
  }

  public String getMessage() {
    String message = this.loginLocators.message.getText();
    return message;
  }
}