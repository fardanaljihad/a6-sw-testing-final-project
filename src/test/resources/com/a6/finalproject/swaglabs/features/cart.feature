Feature: Cart

  Background:
    Given User has logged in with valid credentials
    Given User is on the dashboard page
  

  Scenario: User adds items to cart
    Given User clicks the add to cart button on the "<item_name>" product
    When User clicks the cart icon
    Then User is navigated to the cart page
    And User sees the "<item_name>" product
  
    Examples:
      | item_name             |
      | Sauce Labs Backpack   |
      | Sauce Labs Bike Light |


  Scenario: User checks out items in cart
    Given User has added "<number_of_items>" to the cart
    When User clicks the cart icon
    And User clicks the checkout button
    Then User is navigated to the checkout page
    And User sees the checkout information form

    Examples:
      | number_of_items |
      | 1               |
      # | 2               |
      # | 6               |


  Scenario: User continues shopping from cart page
    Given User is on the cart page
    When User clicks the continue shopping button
    Then User is redirected to the dashboard page
