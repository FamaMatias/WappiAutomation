Feature: Correct coupon
  As user
  I want to order
  To consume it

  Background: Login page
    Given that user in in the portal
    When user complete the information to login
      | User                    | Password            |
      | famamatias              | Mati123456          |

  Scenario: Buy whit correct coupon
    When
    Then