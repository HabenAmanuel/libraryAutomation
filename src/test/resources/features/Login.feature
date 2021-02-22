Feature:Login to the Library page funtionality

  Background: User already on login page

@Student
  Scenario Outline: Verify students login
    Given the student login with "<username>" and "<password>"
  ## Then the "<expectedUser>" on "<expectedPage>"
  And books is student in the student page





    Examples:
      | username      | password      |
      | stuUserName11 | stuPassword11 |
      | stuUserName12 | stuPassword12 |
      | stuUserName13 | stuPassword13 |


  @librarian
Scenario Outline: Verify librarian login
  Given the librarin login with "<username>" and "<password>"
  And  user should see the Dashboard  in the  page



  Examples:
    | username      | password      |
    | libUserName | libPassword |
