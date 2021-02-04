
	Feature: All loging Test feature
  As a user i can login to the multicurt website

#Domain Specific scenario writing prectice
  Scenario: loging form is available
    Given I am MCT website
    When I used the loging link
    Then I expect a complete loging form
    