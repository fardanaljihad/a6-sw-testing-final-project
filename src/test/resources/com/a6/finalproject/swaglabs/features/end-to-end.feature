Feature: End-To-End Testing

  Scenario: End-To-End Testing
    Given I am has logged in with valid credentials
    Given I am on the dashboard page
    When I Click Add to Cart button on "Sauce Labs Backpack"
    And I Open The Cart Page
    And I Click Checkout Button
    And I Fill The Checkout Information with:
      | First name | Setia |
      | Last name  | Budi  |
      | Postal code| 44001 |
    And I Click Continue Button
    And I see the information of the order details
    And I Click Finish Button
    Then I should see the confirmation message
