@Select
Feature: Verifying the Select Hotel Page of Adactin Hotel

  Scenario Outline: Verifying Select Hotel Page of Adactin Hotel by entering all fields
    Given User is on the adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Adactin1294!"
    And User should search hotels "<location>","<hotels>","<roomType>","<roomNos>","<checkIn>","<checkOut>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should verify after click search success message "Select Hotel"
    And User should select a hotel
    Then User should verify after click continue success message "Book A Hotel"

    Examples: 
      | username    | password   | location | hotels      | roomType | roomNos | checkIn    | checkOut   | adultsPerRoom | childPerRoom |
      | Adactin1294 | Dilli@1234 | Sydney   | Hotel Creek | Standard | 1 - One | 20/11/2021 | 14/12/2021 | 2 - One       | 3 - Three    |

  Scenario Outline: Verifying Select Hotel Page of Adactin Hotel by without Selecting Hotel
    Given User is on the adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Adactin1294!"
    And User should search hotels "<location>","<hotels>","<roomType>","<roomNos>","<checkIn>","<checkOut>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should verify after click search success message "Select Hotel"
    And User should click continue without select any hotel name
    Then User should verify without select any hotel name error message "Please Select a Hotel"

    Examples: 
      | username    | password   | location | hotels      | roomType | roomNos | checkIn    | checkOut   | adultsPerRoom | childPerRoom |
      | Adactin1294 | Dilli@1234 | Sydney   | Hotel Creek | Standard | 1 - One | 20/11/2021 | 14/12/2021 | 2 - One       | 3 - Three    |
