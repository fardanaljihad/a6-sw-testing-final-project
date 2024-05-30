package com.a6.finalproject.swaglabs.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.a6.finalproject.swaglabs.locators.ProductDetailPageLocators;
import com.a6.finalproject.swaglabs.utils.HelperClass;

public class ProductDetailPageActions {
  
  WebDriver driver = HelperClass.getDriver();
  ProductDetailPageLocators productDetailPageLocators;

  public ProductDetailPageActions(WebDriver driver) {
    this.driver = driver;
    this.productDetailPageLocators = new ProductDetailPageLocators();
    PageFactory.initElements(driver, productDetailPageLocators);
  }

  public void clickBackToProductsBtn() {
    productDetailPageLocators.backToProductBtn.click();
  }

  public void clickAddToCartBtn() {
    productDetailPageLocators.addToCartBtn.click();
  }

  public void clickRemoveBtn() {
    productDetailPageLocators.removeBtn.click();
  }

}
