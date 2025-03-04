Feature: Mobile Login Functionality

  Scenario: Login with valid credentials
    Given User launches the app on "Android"
    When User enters "arifraza" and "1234567"
    Then User should see the homepage