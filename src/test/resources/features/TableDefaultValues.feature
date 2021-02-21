Feature: Default values of the table
@wip
  Scenario: Table columns names

    Given the user on the homepage
    Then the user should see the following column names:
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |
