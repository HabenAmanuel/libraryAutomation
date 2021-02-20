Feature:


Scenario:
As a user I should be able to login .
Accounts are: librarian, student

  @librarian
  Scenario: Login as Librarian

    Given user is on the login page
    When I login as a librarian
    Then dashboard should be displayed

  @student
  Scenario: Login as a students
    Given I am on the login page
    When I login as a students
    Then books should be displayed