@product
Feature: Product Detail

  Background:
    Given User has logged in with valid credentials
  
  Scenario: User views product details
    Given User is on the dashboard page
    When User clicks on the product image of "<item_name>" on the dashboard page
    Then User sees the image, name, description, and price information of "<item_name>"
    
    Examples:
      | item_name                |
      | Sauce Labs Backpack      |
      | Sauce Labs Bike Light |

  Scenario: User adds product to cart
    Given User is on the product detail page
    When User clicks the add to cart button
    Then The product is added to the cart

  Scenario: User back to the dashboard page from the product detail page
    Given User is on the product detail page
    When User clicks the back to products button
    Then User is navigated to the dashboard page
