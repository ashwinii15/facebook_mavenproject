@Facebook
Feature: FacebookFeature
  I want to test facebook application

  @LoginTag
  Scenario: Login Scenario
    Given I am a user of facebook application
    When User enter valid Username
    And User enter valid password
    And User click on login button
    Then User should be able to login successfully

 
