Feature: Testing data features on virgingames Application

  Scenario: Check if the virgingames application can be accessed by users
     Given User sends a GET request to users endpoint
     When User must get back a valid status code 200

    Scenario: as a userwant to verify the data
   Given I verify streamId is numbers

