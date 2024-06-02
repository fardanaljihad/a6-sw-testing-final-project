@dashboard
Feature: Dashboard Functionality

  Background:
    Given I am has logged in with valid credentials
    Given I am on the dashboard page


  Scenario: Add One Item to Cart
    When I Click Add to Cart button on "Sauce Labs Backpack"
    And I Open The Cart Page
    Then I should see the "Sauce Labs Backpack" in the cart

  Scenario: Remove One Item on Cart
    When I Click Add to Cart button on "Sauce Labs Backpack"
    And I Click Remove button on "Sauce Labs Backpack"
    And I Open The Cart Page
    Then I should not see the "Sauce Labs Backpack" in the cart

  Scenario: Add All Items to Cart
    When I Click Add to Cart button for all items
    And I Open The Cart Page
    Then I should see all items in the cart

