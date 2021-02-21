Feature: displaying records in users link
  Agile story 5. As a librarian, I should be able to see book records on user page

  @record
  Scenario: Verify default record as 10 and show other records dropdowns
    Given i am on the login page and i login as a librarian
    When  i click on "Users" link
    Then  default record should be 10
    And   record dropdown should have these options
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |