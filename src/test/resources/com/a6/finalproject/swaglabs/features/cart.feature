Feature: Cart

  Background:
    Given User has logged in with valid credentials
    Given User is on the dashboard page
  
  Scenario: User adds items to cart
    Given User clicks the Add to cart button on the "<item_name>" product
    When User clicks the cart icon
    Then User is navigated to the cart page
    And User sees the "<item_name>" product

  Scenario: User checks out items in cart
    And User has added "<number_of_product>" to the cart
    When User clicks the cart icon
    And User clicks the Checkout button
    Then User is navigated to the checkout page
    And User sees the checkout information form
