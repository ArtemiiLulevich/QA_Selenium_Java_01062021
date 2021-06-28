Feature: Login feature

  Scenario: Valid login test
    Given I am navigating to login page
    When I enter "yurii.voronenko@gmail.com" to email filed
    And I enter "12345678" to password filed
    And I click login button
    Then account page is displayed

  Scenario: Invalid email test
    Given I am navigating to login page
    When I enter invalid email "blaBla@gmail.com"
    And I enter invalid password "@!#$%^&*"
    And I click login button
    Then error message is displayed

  Scenario: Invalid password test
    Given I am navigating to login page
    When I enter "yurii.voronenko@gmail.com" to email filed
    And I enter invalid password "@#$%^&****&^"
    And I click login button
    Then error message is displayed