Feature: Login functionality

  Background: Land to Home page
Given Go to login page
    @Smoke
    Scenario: Positive: login with valid credentials
      Given Enter "msc.mars92" in userName or Email input field
      And Enter "msc.mars92" in password input field
      When User click on login button
      Then user should successfully logged in
