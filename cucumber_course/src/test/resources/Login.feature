Feature: Login functionality
  The user access the page
  To login and see the
  logged in area
  # that's it for this website, simple as that.

  Scenario: Login Logout
    # just to test the re-use of a statement
    Given The user access the Login Page
    When The user put valid access data
    Then The user see a login confirmation message
    Then The user logs out.

  Scenario Outline: Login Successful
    Given The user is in the Form Login Page of The Internet
    When The user enters a '<username>' and '<password>'
    Then The user should see a successful login message if the login information is valid

    Examples:
      | username  | password             |
      | test-auto | pwd                  |
      # right one next
      | tomsmith  | SuperSecretPassword! |