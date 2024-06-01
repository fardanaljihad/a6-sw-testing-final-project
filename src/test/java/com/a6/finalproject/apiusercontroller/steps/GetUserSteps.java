package com.a6.finalproject.apiusercontroller.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class GetUserSteps {

    private String userId;
    private Response response;

    @Given("the user ID is {string}")
    public void the_user_ID_is(String id) {
        this.userId = id;
    }

    @When("I send a GET request to the user endpoint")
    public void i_send_a_GET_request_to_the_user_endpoint() {
        RestAssured.baseURI = "https://dummyapi.io/data/api";
        response = given()
            .header("app-id", "YOUR_APP_ID") // Replace with your actual app-id
            .when()
            .get("/user/" + userId)
            .then()
            .extract()
            .response();
    }

    @Then("the response status should be {int}")
    public void the_response_status_should_be(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    @Then("the response should contain the user details")
    public void the_response_should_contain_the_user_details() {
        // Here you can add assertions to verify the response body contains expected user details
        System.out.println(response.getBody().asString());
    }
}
