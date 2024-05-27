package com.a6.finalproject.swaglabs.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
  @FindBy(xpath = "//*[@id=\"user-name\"]")
  public WebElement usernameField;

  @FindBy(xpath = "//*[@id=\"password\"]")
  public WebElement passwordField;

  @FindBy(xpath = "//*[@id=\"login-button\"]")
  public  WebElement loginButton;

  @FindBy(css = "[data-test='error']")
  public  WebElement message;

}