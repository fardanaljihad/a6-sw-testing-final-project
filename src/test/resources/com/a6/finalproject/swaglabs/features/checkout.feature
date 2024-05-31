Feature: Checkout Functionality

  Background:
    Given I am logged in with valid credentials
    And I am on the dashboard page
    And I have added items to the cart

  @positive
  Scenario: Validate initial checkout information page
    When I click on the cart icon
    And I click the "Checkout" button
    Then the checkout information page is displayed with the following details:
      | Field  | Value                                                         |
      | Form   | Fields for First Name, Last Name, and Zip/Postal Code         |
      | Button | "Cancel" and "Continue"                                       |

  @positive
  Scenario: Validate checkout overview for one item
    When I click on the cart icon
    And I click the "Checkout" button
    And I fill in "First Name" with "John"
    And I fill in "Last Name" with "Doe"
    And I fill in "Zip/Postal Code" with "12345"
    And I click the "Continue" button
    Then the checkout overview page is displayed with the following details:
      | Field          | Value                                    |
      | Item Name      | Sauce Labs Backpack                      |
      | Payment Info   | Payment information                      |
      | Shipping Info  | Shipping information                     |
      | Subtotal Price | Total price of items plus tax            |
      | Total Price    | Total price of items plus tax (8%)       |

  @positive
  Scenario: Complete the checkout process successfully
    When I click on the cart icon
    And I click the "Checkout" button
    And I fill in "First Name" with "Jane"
    And I fill in "Last Name" with "Smith"
    And I fill in "Zip/Postal Code" with "67890"
    And I click the "Continue" button
    And I click the "Finish" button
    Then the checkout complete page is displayed with the following details:
      | Field                    | Value                                                                                  |
      | Icon                     | Green check mark                                                                       |
      | Information Message Line1| "Thank you for your order!"                                                            |
      | Information Message Line2| "Your order has been dispatched, and will arrive just as fast as the pony can get there!" |
      | Button                   | "Back Home"                                                                            |
