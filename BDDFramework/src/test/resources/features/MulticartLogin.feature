Feature: This is login feature for multicart
  AS a registerd user i want to login to my account

  Scenario: Multicart Login Test
    Given user is already on login page
    When title of loging page is demo script
    Then user click on login button
    And user enter username and password
    And user click on login button
    And user on Home Page
    Then close the Broeser
