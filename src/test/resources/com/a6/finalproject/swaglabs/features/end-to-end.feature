Feature: End-To-End Testing

  Scenario: End-To-End Testing
    Given I am has logged in with valid credentials
    Given I am on the dashboard page
    When I Click Add to Cart button on "Sauce Labs Backpack"
    And I Open The Cart Page
    And I Click Checkout Button
    And I Fill The Checkout Information
    And I Click Continue Button
    And I see the confirmation page
    And I Click Finish Button
    Then I should see the confirmation message

