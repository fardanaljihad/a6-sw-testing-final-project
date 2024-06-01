Feature: Create User


Scenario: Create user with valid field
  Given I load the user creation data with name "create-valid-user"
  And I set request Body with the data
  When I send a POST request to the user creation endpoint
  Then The Operation "01 create user should be successfull" with the response status code should be "200" and the response body should be displayed

Scenario: Create user with empty field
  Given I load the user creation data with name "create-user-with-empty-field"
  And I set request Body with the data
  When I send a POST request to the user creation endpoint
  Then The Operation "02 create user should be failed" with the response status code should be "400" and the response body should be displayed

Scenario: Create user with empty first name
  Given I load the user creation data with name "create-user-with-empty-firstname"
  And I set request Body with the data
  When I send a POST request to the user creation endpoint
  Then The Operation "03 create user should be failed" with the response status code should be "400" and the response body should be displayed

Scenario: Create user with empty last name 
  Given I load the user creation data with name "create-user-with-empty-lastname"
  And I set request Body with the data
  When I send a POST request to the user creation endpoint
  Then The Operation "04 create user should be failed" with the response status code should be "400" and the response body should be displayed

Scenario: Create user with existing email
  Given I load the user creation data with name "create-user-with-existing-email"
  And I set request Body with the data
  When I send a POST request to the user creation endpoint
  Then The Operation "05 create user should be failed" with the response status code should be "400" and the response body should be displayed