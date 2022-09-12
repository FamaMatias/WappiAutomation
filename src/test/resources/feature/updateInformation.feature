Feature: Update information
  As user
  I want to update the information
  To bring food

Background:Login page
  Given that user in in the portal
  When user complete the information to login
    | User                    | Password            |
    | famamatias              | Mati123456          |

  Scenario: Update information
    When user complete personal information
    | FirstName | LastName     | Birth        |
    | Pedro     | Gonzalez     | 19/09/1976   |
    Then user can bring food
