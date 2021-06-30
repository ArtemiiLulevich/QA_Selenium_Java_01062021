Feature: Login feature


  @regression @login
  Scenario Outline: Login test  <email> - <result>
    Given I am navigating to login page
    When I enter "<email>" to email filed
    And I enter "<password>" to password filed
    And I click login button
    Then login result must be "<result>" and error message "<errorMessage>" is displayed
#    Then account page is displayed
    Examples:
      |email                    |password       |result  |errorMessage|
      |yurii.voronenko@gmail.com|12345678       |success |----        |
      |$_INVALID_EMAIL_$        |12345678       |fail    |Предупреждение: Не совпадает адрес электронной почты и/или пароль.|
      |yurii.voronenko@gmail.com|invalidPassword|fail    |Предупреждение: Не совпадает адрес электронной почты и/или пароль.|

#  Scenario: Invalid email test
#    Given I am navigating to login page
#    When I enter invalid email "blaBla@gmail.com"
#    And I enter invalid password "@!#$%^&*"
#    And I click login button
#    Then error message is displayed
#
#  Scenario: Invalid password test
#    Given I am navigating to login page
#    When I enter "yurii.voronenko@gmail.com" to email filed
#    And I enter invalid password "@#$%^&****&^"
#    And I click login button
#    Then error message is displayed