@Outline
Feature: Demo

  Scenario Outline: Demo1
    Given user on web "https://muslim6708.talentlms.com/user/create"
    When user input field "<First Name>" with following credentials
    And user input field "<Last Name>" with following credentials
    And user input field "<Email Address>" with following credentials
    And user input field "<Username>" with following credentials
    And user input field "<Password>" with following credentials
    And user input field "<BIO>" with following credentials
    Examples:
      | First Name | Last Name  | Email Address  | Username  | Password | BIO              |
      | Nurs       | Kadyrbekov | Nurs.gmail.com | Nursultan | nbh12345    | This is bio nurs |
      | Meka       | Kadyrova   | meka.gmail.com | Medina    | yuu1236     | This is bio meka |

