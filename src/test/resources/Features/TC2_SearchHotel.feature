@Search
Feature: verifying Adactin Hotel search details

  Scenario Outline: Verifying search hotel page by selecting all fields
    Given User is on the adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Adactin1294!"
    And User should search hotels "<location>","<hotels>","<roomType>","<roomNos>","<checkIn>","<checkOut>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should verify after click search success message "Select Hotel"

    Examples: 
      | username    | password   | location | hotels      | roomType | roomNos | checkIn    | checkOut   | adultsPerRoom | childPerRoom |
      | Adactin1294 | Dilli@1234 | Sydney   | Hotel Creek | Standard | 1 - One | 20/11/2021 | 14/12/2021 | 2 - One       | 3 - Three    |

  Scenario Outline: verifying search hotel page by selecting mandatory fields
    Given User is on the adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Adactin1294!"
    And User should enter mandatory fields "<location>","<roomNos>","<checkIn>","<checkOut>" and "<adultsPerRoom>"
    Then User should verify after click search success message "Select Hotel"

    Examples: 
      | username    | password   | location | roomNos | checkIn    | checkOut   | adultsPerRoom |
      | Adactin1294 | Dilli@1234 | Sydney   | 2 - Two | 20/11/2021 | 14/12/2021 | 2 - Two       |

  Scenario Outline: verifying search hotel page by Checking CheckInDate and CheckOutDate
    Given User is on the adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Adactin1294!"
    And User should wrong data "<location>","<hotels>","<roomType>","<roomNos>","<checkIn>","<checkOut>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should verify invalid checkIn Date and checkOut Date "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username    | password   | location | hotels      | roomType | roomNos | checkIn    | checkOut   | adultsPerRoom | childPerRoom |
      | Adactin1294 | Dilli@1234 | Sydney   | Hotel Creek | Standard | 2 - Two | 19/12/2023 | 20/12/2022 | 2 - Two       | 2 - Two      |

  Scenario Outline: verifying search hotel page by without entering any fields
    Given User is on the adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Adactin1294!"
    And User should not enter any fields
    Then User should click search verify error message "Please Select a Location"

    Examples: 
      | username    | password   |
      | Adactin1294 | Dilli@1234 |
