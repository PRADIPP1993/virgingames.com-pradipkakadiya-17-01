package com.virgingames.steps;


import com.virgingames.constants.Endpoints;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DataSteps {

    @Step("Getting Data information {0}")
    public ValidatableResponse getAllDatasInfo() {
        RestAssured.registerParser("text/plain", Parser.JSON);
        return SerenityRest.given().log().all()
                .when()
                .get(Endpoints.GET_ALL_DATA)
                .then();

    }
}