
Feature: All Login Test Feature
			As a user i want to login to multicart website 


  
  Scenario: Login form is Available
    Given I am Mct Website
    When I use the Login links
    Then I expect a complete Login form
    And Enter username and password
    And Click on login Button
    Then close the Browse
    
