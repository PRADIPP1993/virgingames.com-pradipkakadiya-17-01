package com.virgingames.cucumber.steps;


import com.virgingames.steps.DataSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.CoreMatchers.equalTo;

public class MyStepdefs {
    static int StremId = 194;
    static ValidatableResponse response;

    @Steps
    DataSteps dataSteps;

    @When("^User sends a GET request to users endpoint$")
    public void userSendsAGETRequestToUsersEndpoint() {
        response = dataSteps.getAllDatasInfo();
    }

    @Then("^User must get back a valid status code 200$")
    public void userMustGetBackAValidStatusCode() {
        response.statusCode(200);
    }

    @Given("^I verify streamId is numbers$")
    public void iVerifyStreamIdIsNumbers() {
        response.body("bingoLobbyInfoResource.streams[0].streamId", equalTo(StremId));
    }
}
