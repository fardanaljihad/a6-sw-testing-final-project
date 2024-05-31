package com.a6.finalproject.swaglabs.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPageLocators {
  
  @FindBy(xpath = "//*[@id=\"back-to-products\"]")
  public WebElement backToProductBtn;

  @FindBy(xpath = "//*[@id=\"add-to-cart\"]")
  public WebElement addToCartBtn;

  @FindBy(xpath = "//*[@id=\"remove\"]")
  public WebElement removeBtn;

  @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div")
  public WebElement productInformation;

}
