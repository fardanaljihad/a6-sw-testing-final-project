package com.a6.finalproject.apiusercontroller.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.a6.finalproject.apiusercontroller.utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.Method;
import org.json.JSONObject;

import java.io.IOException;

public class DeleteUserSteps {

    private RequestSpecification httpRequest;
    private Response response;
    private String userId;
    private String appId;

    @Given("I have loaded the delete user data from {string}")
    public void i_have_loaded_the_delete_user_data_from(String fileName) throws IOException {
        String filePath = "src/test/resources/com/a6/finalproject/api-user-controller/data/" + fileName + ".json";
        String jsonData = HelperClass.loadJsonFromFile(filePath);
        JSONObject jsonObject = new JSONObject(jsonData);
        this.userId = jsonObject.getString("user-id");
        this.appId = jsonObject.getString("app-id");

        httpRequest = RestAssured.given().baseUri("https://dummyapi.io/data/v1/");
        httpRequest.header("app-id", this.appId);
        httpRequest.contentType("application/json");
    }

    @When("I send a DELETE request to delete the user")
    public void i_send_a_delete_request_to_delete_the_user() {
        response = httpRequest.request(Method.DELETE, "/user/" + userId);
    }

    @Then("response status code should be {int}")
    public void the_response_status_code_should_be(int statusCode) {
        assertEquals("Unexpected status code", statusCode, response.getStatusCode());
    }

    @Then("response body should contain {string}")
    public void the_response_body_should_contain(String expectedMessage) {
        String responseBody = response.getBody().asString();
        assertTrue("Response body does not contain expected message", responseBody.contains(expectedMessage));
    }
}
