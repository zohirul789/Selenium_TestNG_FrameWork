Feature: Oneway Flight Booking
  	As a user i want to book oneway flight

  Scenario: verify user should be able to book onway flight
    Given Open the Browser and navigate to App
    When Click on flight
    Then Provide the information
    And Click on continue button
    Then Close the Browser
