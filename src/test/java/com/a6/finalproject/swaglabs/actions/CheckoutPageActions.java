package com.a6.finalproject.swaglabs.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.a6.finalproject.swaglabs.locators.CheckoutPageLocators;
import com.a6.finalproject.swaglabs.utils.HelperClass;

public class CheckoutPageActions {

    WebDriver driver = HelperClass.getDriver();
    CheckoutPageLocators checkoutPageLocators;

    public CheckoutPageActions(WebDriver driver) {
        this.driver = driver;
        this.checkoutPageLocators = new CheckoutPageLocators();
        PageFactory.initElements(driver, checkoutPageLocators);
    }

    public void clickCheckoutButton() {
        checkoutPageLocators.checkoutButton.click();
    }

    public WebElement getFirstNameField() {
        return checkoutPageLocators.firstNameField;
    }

    public void fillCheckoutInformation(String field, String value) {
        WebElement element;
        switch (field) {
            case "First Name":
                element = checkoutPageLocators.firstNameField;
                break;
            case "Last Name":
                element = checkoutPageLocators.lastNameField;
                break;
            case "Zip/Postal Code":
                element = checkoutPageLocators.postalCodeField;
                break;
            default:
                throw new IllegalArgumentException("Unknown field: " + field);
        }
        element.sendKeys(value);
    }

    public void clickContinueButton() {
        checkoutPageLocators.continueButton.click();
    }

    public WebElement getOverviewTitle() {
        return checkoutPageLocators.overviewTitle;
    }

    public void clickFinishButton() {
        checkoutPageLocators.finishButton.click();
    }

    public WebElement getCompleteTitle() {
        return checkoutPageLocators.completeTitle;
    }

    public WebElement getCompleteMessage() {
        return checkoutPageLocators.completeMessage;
    }

    public WebElement getBackHomeButton() {
        return checkoutPageLocators.backHomeButton;
    }

    public void fillfirstname(String firstname) {
        checkoutPageLocators.firstNameField.sendKeys(firstname);
    }

    public void filllastname(String lastname) {
        checkoutPageLocators.lastNameField.sendKeys(lastname);
    }

    public void fillpostalcode(String postalcode) {
        checkoutPageLocators.postalCodeField.sendKeys(postalcode);
    }

    public WebElement getPaymentInformation() {
        return checkoutPageLocators.paymentInformation;
    }

    public WebElement getShippingInformation() {
        return checkoutPageLocators.shippingInformation;
    }

    public WebElement getItemTotal() {
        return checkoutPageLocators.itemTotal;
    }

    public WebElement getTax() {
        return checkoutPageLocators.tax;
    }

    public WebElement getTotal() {
        return checkoutPageLocators.total;
    }

}
