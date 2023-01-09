@Login
Feature: verifying Adactin Hotel Login details

  Scenario Outline: verifying Adactin Hotel Login valid
    Given User is on the adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Adactin1294!"

    Examples: 
      | username    | password   |
      | Adactin1294 | Dilli@1234 |

  Scenario Outline: verifying Adactin Hotel Login using Enter
    Given User is on the adactin page
    When User should perform login "<username>","<password>" with Enter Key
    Then User should verify after login success message "Hello Adactin1294!"

    Examples: 
      | username    | password   |
      | Adactin1294 | Dilli@1234 |

  Scenario Outline: verifying Adactin Hotel Login Invalid credentials
    Given User is on the adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login with invaild credential error message contain "Invalid Login details or Your Password might have expired"

    Examples: 
      | username      | password   |
      | Adactin129412 | Dilli@1234 |
