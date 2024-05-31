package com.a6.finalproject.swaglabs.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

  public boolean isProductInformationTrue(String itemName) {
    WebElement productInformation = productDetailPageLocators.productInformation;
    
    WebElement itemImage = productInformation.findElement(By.cssSelector(".inventory_details_img_container img"));
    WebElement itemNameElement = productInformation.findElement(By.cssSelector(".inventory_details_name"));
    WebElement itemDesc = productInformation.findElement(By.cssSelector(".inventory_details_desc"));
    WebElement itemPrice = productInformation.findElement(By.cssSelector(".inventory_details_price"));
    
    String itemNameText = itemNameElement.getText();
    String itemDescText = itemDesc.getText();
    String itemPriceText = itemPrice.getText();
    String itemImageSrc = itemImage.getAttribute("src");

    boolean isNameMatch = itemNameText.equals(itemName);
    boolean isDescPresent = !itemDescText.isEmpty();
    boolean isPricePresent = !itemPriceText.isEmpty();
    boolean isImagePresent = !itemImageSrc.isEmpty();

    return isNameMatch && isDescPresent && isPricePresent && isImagePresent;
  }

}
