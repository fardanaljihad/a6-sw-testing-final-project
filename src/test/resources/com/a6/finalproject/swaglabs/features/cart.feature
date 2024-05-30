Feature: Cart

  Background:
    Given User has logged in with valid credentials
  
  Scenario: User adds items to cart
    Given User is on the dashboard page
    When User clicks the Add to cart button on the "<item_name>" product
    And User clicks the cart icon
    Then User is navigated to the cart page
    And User sees the "<item_name>" product
