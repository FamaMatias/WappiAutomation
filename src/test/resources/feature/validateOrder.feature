Feature: Update information
  As user
  I want to order
  To consume it

  Background: Login page
    Given that user in in the portal
    When user complete the information to login
      | User                    | Password            |
      | famamatias              | Mati123456          |

  Scenario:Validate info for the product

    When user select product
    Then he can see all description
