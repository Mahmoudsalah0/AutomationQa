@smoke

Feature: Sign-Up

  Scenario: The user could Sign-up with valid data and Sign Out successfully
    Given User Navigate to the registration page from the home page
    And   User Enter his email to create an new account
    And   User Select the Gender
    When  User Enter the mandatory info fields in the registration page
    Then  User click on register button
    And   User could completed registration process successfully
    And   User could sign out successfully

