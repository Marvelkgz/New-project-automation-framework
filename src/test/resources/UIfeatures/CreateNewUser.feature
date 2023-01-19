Feature: Create new user functionality


  Background: Land to Home page
    Given Go to login  page
  @Smoke1
  Scenario: Positive create new user
    When user should click Add user button in Admin home page
    And verify following field names are displayed
      | First name | Last name | Email | Username | Password |
    And enter following data create new user
      | firstName | lastname | emailAddress   | userName | password |
      | Elon      | Mask     | mask.gmail.com | mask     | mask123  |
      | El        | Maks     | maks.gmail.com | maks     | maks123  |