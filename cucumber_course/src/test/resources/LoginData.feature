Feature: Login functionality
  The user access the page
  To login and see the
  logged in area

  # passing Data direct
  Scenario: Login Logout
    Given The user access the Login Page One
    When The user put valid access data One
| tomsmith | SuperSecretPassword! |
    Then The user see a login confirmation message One
    Then The user logs out One