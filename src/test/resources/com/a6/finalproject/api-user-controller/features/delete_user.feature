Feature: Delete User

  Scenario: Delete user with no app-id
    Given I have loaded the delete user data from "delete_user_no_app_id"
    When I send a DELETE request to delete the user
    Then response status code should be 403
    And response body should contain "APP_ID_MISSING"

  Scenario: Delete user with invalid app-id
    Given I have loaded the delete user data from "delete_user_invalid_app_id"
    When I send a DELETE request to delete the user
    Then response status code should be 403
    And response body should contain "APP_ID_NOT_EXIST"

  Scenario: Delete user with valid app-id and valid user-id
    Given I have loaded the delete user data from "delete_user_valid"
    When I send a DELETE request to delete the user
    Then response status code should be 200

  Scenario: Delete user with valid app-id and non-existing user-id
    Given I have loaded the delete user data from "delete_user_non_existing"
    When I send a DELETE request to delete the user
    Then response status code should be 404
    And response body should contain "RESOURCE_NOT_FOUND"

  Scenario: Delete user with valid app-id and invalid user-id
    Given I have loaded the delete user data from "delete_user_invalid_user_id"
    When I send a DELETE request to delete the user
    Then response status code should be 400
    And response body should contain "PARAMS_NOT_VALID"
