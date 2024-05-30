package com.a6.finalproject.swaglabs.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageLocators {
    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    public WebElement addToCartSauceLabsBackpack;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
    public WebElement addToCartSauceLabsBikeLight;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
    public WebElement addToCartSauceLabsBoltTShirt;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
    public WebElement addToCartSauceLabsFleeceJacket;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
    public WebElement addToCartSauceLabsOnesie;

    @FindBy(xpath = "//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
    public WebElement addToCartTestAllTheThingsTShirtRed;

    @FindBy(xpath = "//*[@id=\"remove-sauce-labs-backpack\"]")
    public WebElement removeSauceLabsBackpack;

    @FindBy(xpath = "//*[@id=\"remove-sauce-labs-bike-light\"]")
    public WebElement removeSauceLabsBikeLight;

    @FindBy(xpath = "//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")
    public WebElement removeSauceLabsBoltTShirt;

    @FindBy(xpath = "//*[@id=\"remove-sauce-labs-fleece-jacket\"]")
    public WebElement removeSauceLabsFleeceJacket;

    @FindBy(xpath = "//*[@id=\"remove-sauce-labs-onesie\"]")
    public WebElement removeSauceLabsOnesie;

    @FindBy(xpath = "//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]")
    public WebElement removeTestAllTheThingsTShirtRed;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    public WebElement shoppingCartContainer;

    @FindBy(xpath = "//*[@class=\"inventory_item_name\"]")
    public WebElement inventoryItemName;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")
    public WebElement shoppingCartBadge;
}