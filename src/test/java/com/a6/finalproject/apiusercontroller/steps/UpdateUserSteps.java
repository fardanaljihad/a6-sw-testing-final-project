package com.a6.finalproject.apiusercontroller.steps;

import java.io.IOException;

import com.a6.finalproject.apiusercontroller.config.APIConfig;
import com.a6.finalproject.apiusercontroller.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class UpdateUserSteps {

  RequestSpecification requestSpecification;
  String userId;
  String path;
  String jsonBody;
  Response response;

  @Given("User adds appropriate app-id in the request header")
  public void user_adds_appropriate_app_id_in_the_request_header() {
    requestSpecification = APIConfig.getDefaultRequestSpecification();
  }

  @Given("User with id {string} is registered")
  public void user_with_id_is_registered(String userId) {
    this.userId = userId;
  }

  @Given("User sets request body with data from the file named {string}")
  public void user_sets_request_body_with_data_from_the_file_named(String fileName) throws IOException {
    path = "src/test/resources/com/a6/finalproject/api-user-controller/data/" + fileName + ".json";
    jsonBody = HelperClass.loadJsonFromFile(path);
  }

  @When("User sends a PUT request to the user update endpoint")
  public void user_sends_a_put_request_to_the_user_update_endpoint() {
    response = RestAssured.given()
            .spec(requestSpecification)
            .body(jsonBody)
            .put("/user/" + userId);
  }

  @Then("User sees the updated user data in the response body")
  public void user_sees_the_updated_user_data_in_the_response_body() {
    response.then()
            .assertThat()
            .statusCode(200)
            .body(matchesJsonSchemaInClasspath("com/a6/finalproject/api-user-controller/data/userUpdateData-Schema.json"));
  }

  @Then("User receives a response with status {int} OK")
  public void user_receives_a_response_with_status_ok(Integer statusCode) {
    response.then()
            .assertThat()
            .statusCode(statusCode);
  }

}
