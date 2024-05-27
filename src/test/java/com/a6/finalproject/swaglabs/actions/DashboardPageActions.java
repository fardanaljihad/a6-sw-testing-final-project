package com.a6.finalproject.swaglabs.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.a6.finalproject.swaglabs.utils.HelperClass;
import com.a6.finalproject.swaglabs.locators.DashboardPageLocators;

public class DashboardPageActions {
  WebDriver driver = HelperClass.getDriver();
  DashboardPageLocators dashboardPageLocators;
  
  public DashboardPageActions(WebDriver driver) {
    this.driver = driver;
    this.dashboardPageLocators = new DashboardPageLocators();
    PageFactory.initElements(driver, dashboardPageLocators);
  }

  // Actions
  
  public void clickAddToCartSauceLabsBackpack() {
    dashboardPageLocators.addToCartSauceLabsBackpack.click();
  }

    public void clickAddToCartSauceLabsBikeLight() {
        dashboardPageLocators.addToCartSauceLabsBikeLight.click();
    }

    public void clickAddToCartSauceLabsBoltTShirt() {
        dashboardPageLocators.addToCartSauceLabsBoltTShirt.click();
    }

    public void clickAddToCartSauceLabsFleeceJacket() {
        dashboardPageLocators.addToCartSauceLabsFleeceJacket.click();
    }

    public void clickAddToCartSauceLabsOnesie() {
        dashboardPageLocators.addToCartSauceLabsOnesie.click();
    }

    public void clickAddToCartTestAllTheThingsTShirtRed() {
        dashboardPageLocators.addToCartTestAllTheThingsTShirtRed.click();
    }

    public void clickRemoveSauceLabsBackpack() {
        dashboardPageLocators.removeSauceLabsBackpack.click();
    }

    public void clickRemoveSauceLabsBikeLight() {
        dashboardPageLocators.removeSauceLabsBikeLight.click();
    }

    public void clickRemoveSauceLabsBoltTShirt() {
        dashboardPageLocators.removeSauceLabsBoltTShirt.click();
    }

    public void clickRemoveSauceLabsFleeceJacket() {
        dashboardPageLocators.removeSauceLabsFleeceJacket.click();
    }

    public void clickRemoveSauceLabsOnesie() {
        dashboardPageLocators.removeSauceLabsOnesie.click();
    }

    public void clickRemoveTestAllTheThingsTShirtRed() {
        dashboardPageLocators.removeTestAllTheThingsTShirtRed.click();
    }

    public void clickShoppingCartContainer() {
        dashboardPageLocators.shoppingCartContainer.click();
    }

    public String getInventoryItemName() {
        String inventoryItemName = this.dashboardPageLocators.inventoryItemName.getText();
        return inventoryItemName;
    }
}