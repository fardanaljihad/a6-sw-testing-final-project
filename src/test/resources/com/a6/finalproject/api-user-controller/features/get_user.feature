@get
Feature: Get User

Scenario: Get user with empty app-id header
  Given I have loaded the user data from "get_user_with_empty_app_id"
  When I send a GET request to retrieve the user
  Then the response status code should be 403
  And the response body should contain "APP_ID_MISSING"

Scenario: Get user with invalid app-id header
  Given I have loaded the user data from "get_user_with_invalid_app_id"
  When I send a GET request to retrieve the user
  Then the response status code should be 403
  And the response body should contain "APP_ID_NOT_EXIST"

Scenario: Get user with valid app-id and existing user
  Given I have loaded the user data from "get_valid_user"
  When I send a GET request to retrieve the user
  Then the response status code should be 200

Scenario: Get user with valid app-id and non-existing user
  Given I have loaded the user data from "get_non_existing_user"
  When I send a GET request to retrieve the user
  Then the response status code should be 404
  And the response body should contain "RESOURCE_NOT_FOUND"

Scenario: Get user with valid app-id and invalid user id format
  Given I have loaded the user data from "get_invalid_user_id_format"
  When I send a GET request to retrieve the user
  Then the response status code should be 400
  And the response body should contain "PARAMS_NOT_VALID"
