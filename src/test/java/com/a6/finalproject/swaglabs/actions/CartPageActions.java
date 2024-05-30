package com.a6.finalproject.swaglabs.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.a6.finalproject.swaglabs.locators.CartPageLocators;
import com.a6.finalproject.swaglabs.utils.HelperClass;

public class CartPageActions {
  
  WebDriver driver = HelperClass.getDriver();
  CartPageLocators cartPageLocators;

  public CartPageActions(WebDriver driver) {
    this.driver = driver;
    this.cartPageLocators = new CartPageLocators();
    PageFactory.initElements(driver, cartPageLocators);
  }

  public void clickContinueShoppingBtn() {
    cartPageLocators.continueShoppingBtn.click();
  }

  public void clickCheckoutBtn() {
    cartPageLocators.checkoutBtn.click();
  }

  public String getItemNameFromCartList(String itemName) {
    try {
      WebElement element = cartPageLocators.cartList.findElement(By.xpath(".//div[@class='inventory_item_name' and text()='" + itemName + "']"));
      return element.getText();
    } catch (NoSuchElementException e) {
      return "Not Found";
    }
  }

}
