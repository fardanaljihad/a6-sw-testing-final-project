Feature: Get User

  Scenario: Retrieve a user by ID
    Given the user ID is "60d0fe4f5311236168a109ca"
    When I send a GET request to the user endpoint
    Then the response status should be 200
    And the response should contain the user details
