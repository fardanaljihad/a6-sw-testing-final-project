@update
Feature: Update User

  Background:
    Given User adds appropriate app-id in the request header
    And User with id "665b17644c88d3cfac089a51" is registered

  Scenario: Update user with valid data excluding email for registered user id
    Given User sets request body with data from the file named "update-user-with-valid-data"
    When User sends a PUT request to the user update endpoint
    Then User sees the updated user data in the response body
    And User receives a response with status 200 OK

  Scenario: Update user first name field for registered user id
    Given User sets request body with data from the file named "<file_name>"
    When User sends a PUT request to the user update endpoint
    Then User sees the updated user data in the response body
    And User receives a response with status 200 OK

    Examples:
      | file_name                  |
      | update-user-first-name-2   |
      | update-user-first-name-50  |
  
  Scenario: Update user title field for registered user id
    Given User sets request body with data from the file named "update-user-title"
    When User sends a PUT request to the user update endpoint
    Then User sees the updated user data in the response body
    And User receives a response with status 200 OK
  
  Scenario: Update user gender field for registered user id
    Given User sets request body with data from the file named "update-user-gender"
    When User sends a PUT request to the user update endpoint
    Then User sees the updated user data in the response body
    And User receives a response with status 200 OK
