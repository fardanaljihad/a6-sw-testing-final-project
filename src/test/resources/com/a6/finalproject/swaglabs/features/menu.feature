@menu
Feature: Menu Functionality

  Background:
    Given I am logged with valid credentials
    And I was on the dashboard page

  @positive
  Scenario: Verify menu bar navigation
    When I click the three-line icon at the top left of the dashboard page
    Then the page displays four menu options:
      | All Items      |
      | About          |
      | Logout         |
      | Reset App State |

  @positive
  Scenario: Select About menu
    When I click the three-line icon at the top left of the dashboard page
    And I click the About menu
    Then I should redirects to the information about Swag

  @positive
  Scenario: Select Logout menu
    When I click the three-line icon at the top left of the dashboard page
    And I click the Logout menu
    Then I should be logged out successfully

