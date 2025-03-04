Feature: Mobile Login Functionality

  Scenario: Login with valid credentials
    When User enters "arifraza" and "1234567"
    Then User should see the homepage

  Scenario: Login with invalid credentials
    When User enters "sjhkasdgjh" and "1235154567"
    Then User should see the homepage