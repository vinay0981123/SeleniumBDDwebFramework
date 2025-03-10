
Feature: Login
  @task
  Scenario: Successful login with valid credential
    Given User launch chrome browser
    When User opens Url
    And User enters Email and password
    And click on login
    And close browser
