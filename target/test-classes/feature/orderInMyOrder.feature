Feature: Update information
  As user
  I want to order
  To consume it

  Background: Login page
    Given that user in in the portal
    When user complete the information to login
      | User                    | Password            |
      | famamatias              | Mati123456          |

    When user select product
    Then he can see all description

  Scenario:Validate product in the list product

    When user select my order
    Then he can see the order in the list product
