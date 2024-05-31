package com.a6.finalproject.swaglabs.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPageLocators {

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    public WebElement threeLineIcon;

    @FindBy(xpath = "//a[@class='bm-item menu-item']")
    public WebElement allItemsMenu;

    @FindBy(xpath = "//a[@id='about_sidebar_link']")
    public WebElement aboutMenu;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    public WebElement logoutMenu;

    @FindBy(xpath = "//a[@id='reset_sidebar_link']")
    public WebElement resetAppStateMenu;

}
