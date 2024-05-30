package com.a6.finalproject.swaglabs.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageLocators {

  @FindBy(xpath = "//*[@id=\"continue-shopping\"]")
  public WebElement continueShoppingBtn;

  @FindBy(xpath = "//*[@id=\"checkout\"]")
  public WebElement checkoutBtn;

}
