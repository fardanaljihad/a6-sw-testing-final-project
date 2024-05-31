package com.a6.finalproject.swaglabs.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.a6.finalproject.swaglabs.locators.MenuPageLocators;
import com.a6.finalproject.swaglabs.utils.HelperClass;
import java.util.ArrayList;
import java.util.List;

public class MenuPageActions {
    WebDriver driver = HelperClass.getDriver();;
    MenuPageLocators menuPageLocator;

    public MenuPageActions(WebDriver driver) {
        this.driver = driver;
        menuPageLocator = new MenuPageLocators();
        PageFactory.initElements(driver, menuPageLocator);
    }

    public void clickThreeLineIcon() {
        menuPageLocator.threeLineIcon.click();
    }

    public void clickAllItemsMenu() {
        menuPageLocator.allItemsMenu.click();
    }

    public void clickAboutMenu() {
        menuPageLocator.aboutMenu.click();
    }

    public void clickLogoutMenu() {
        menuPageLocator.logoutMenu.click();
    }

    public void clickResetAppStateMenu() {
        menuPageLocator.resetAppStateMenu.click();
    }

    // Method to retrieve menu options
    public List<String> getMenuOptions() {
        List<String> options = new ArrayList<>();
        options.add(menuPageLocator.allItemsMenu.getText());
        options.add(menuPageLocator.aboutMenu.getText());
        options.add(menuPageLocator.logoutMenu.getText());
        options.add(menuPageLocator.resetAppStateMenu.getText());
        return options;
    }
}
