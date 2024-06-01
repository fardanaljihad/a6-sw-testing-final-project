package com.a6.finalproject.apiusercontroller.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.io.IOException;


import com.a6.finalproject.apiusercontroller.config.APIConfig;
import com.a6.finalproject.apiusercontroller.utils.HelperClass;


public class CreateUserSteps {
    String path;
    String jsonBody;
    Response response;

    @Given("I load the user creation data with name {string}")
    public void i_load_the_user_creation_data_with_name(String string){
        path = "src/test/resources/com/a6/finalproject/api-user-controller/data/" + string + ".json";
    }

    @Given("I set request Body with the data")
    public void i_set_request_body_with_the_data() throws IOException{
        jsonBody = HelperClass.loadJsonFromFile(path);

    }

    @When("I send a POST request to the user creation endpoint")
    public void i_send_a_post_request_to_the_user_creation_endpoint() {
        response = RestAssured.given()
            .spec(APIConfig.getDefaultRequestSpecification())
            .body(jsonBody)
            .post("/user/create");
    }

    @Then("The Operation {string} with the response status code should be {string} and the response body should be displayed")
    public void the_response_status_code_should_be(String status, String statusCode) {
        response.then()
            .assertThat()
            .statusCode(Integer.parseInt(statusCode));
            System.out.println(status +", Response Body => " + response.getBody().asPrettyString()+"\n");
    }

    // @And("the response body should be displayed")
    // public void the_response_body_should_be_displayed() {
    //     System.out.println("Response Body => " + response.getBody().asPrettyString()+");
    // }

    // // @Given("I have a new user payload")
    // public void i_have_a_new_user_payload() throws IOException {

    // // {
    // // "firstName": "PercobaanZZ",
    // // "lastName": "PercobaanZZ",
    // // "email": "PercobaanZZZZ@example.com"
    // // }
    // String filePath =
    // "src/test/resources/com/a6/finalproject/api-user-controller/data/createuser-1.json";
    // String jsonBody = HelperClass.loadJsonFromFile(filePath);

    // Response response = RestAssured.given()
    // .spec(APIConfig.getDefaultRequestSpecification())
    // .body(jsonBody)
    // .post("/user/create");

    // response.then()
    // .assertThat()
    // .statusCode(200);

    // // Print the status and message body of the response received from the server
    // System.out.println("Status received => " + response.getStatusLine());
    // System.out.println("Response=>" + response.prettyPrint());

    // }

    // @When("I send a POST request to the user endpoint")
    // public void i_send_a_post_request_to_the_user_endpoint() {
    // // Write code here that turns the phrase above into concrete actions
    // throw new io.cucumber.java.PendingException();
    // }

    // @Then("Oke")
    // public void oke() {
    // // Write code here that turns the phrase above into concrete actions
    // System.out.println("Oke");
    // }

}
