Feature: login1 functionality
  Scenario: Valid login
    Given user is on login page
    When user enters login username "testuser" and password "pass123"
    And user click on login button
    Then user should be navigate to homepage