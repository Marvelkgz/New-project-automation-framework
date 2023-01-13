@Demo
Feature: Scenario Outline

  Scenario Outline: Demo1
    Given user on  web "https://muslim6708.talentlms.com/user/create"
    When user input  field "<First Name>" with following credentials
    And user input  field "<Last Name>" with following credentials
    And user input  field "<Email Address>" with following credentials
    And user input  field "<Username>" with following credentials
    And user input  field "<Password>" with following credentials
    And user input  field "<BIO>" with following credentials
    Examples:
      | First Name | Last Name  | Email Address  | Username  | Password   | BIO              |
      | Nurs       | Kadyrbekov | Nurs.gmail.com | Nursultan | nbh12345   | This is bio nurs |
      | Meka       | Kadyrova   | meka.gmail.com | Medina    | yuu1236    | This is bio meka |
      | Maks       | Shopokov   | Maks.gmail.com | Maksat    | nbh1234e5  | This is bio maks |
      | Bek        | Kadyrov    | Bek.gmail.com  | Bektursun | 3yuu1236   | This is bio bek  |
      | Sumi       | Bekova     | Sumi.gmail.com | Sumaya    | nbh1902345 | This is bio sumi |
      | Beka       | Rov        | Beka.gmail.com | Bektur    | 90yuu1236  | This is bio beka |