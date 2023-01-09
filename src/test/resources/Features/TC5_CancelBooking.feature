@CancelBooking
Feature: Verifying Adactin Hotel Cancel booking details

  Scenario Outline: Verifying the Adactin Hotel by canceling booking order id
    Given User is on the adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Adactin1294!"
    And User should search hotels "<location>","<hotels>","<roomType>","<roomNos>","<checkIn>","<checkOut>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should verify after click search success message "Select Hotel"
    And User should select a hotel
    Then User should verify after click continue success message "Book A Hotel"
    And User should enter all fields in "<firstname>","<lastname>" and "<billingaddress>"
      | CreditCardNo     | CreditCardType   | Expirymonth | Expiryyear | CVVNumber |
      | 6131234534232143 | American Express | December    |       2022 |       123 |
      | 2987634534232143 | Visa             | November    |       2022 |       323 |
      | 9876534534232143 | Master Card      | December    |       2026 |       823 |
      | 8765234534232345 | Other            | October     |       2027 |       623 |
    Then User should verify after booking success message "Booking Confirmation" and save the generated order ID
    And User should cancel the generated order Id
    Then User should verify the success message after canceling order id "The booking has been cancelled."

    Examples: 
      | username    | password   | location | hotels      | roomType | roomNos | checkIn    | checkOut   | adultsPerRoom | childPerRoom | firstname | lastname | billingaddress |
      | Adactin1294 | Dilli@1234 | Sydney   | Hotel Creek | Standard | 1 - One | 20/11/2021 | 14/12/2021 | 2 - One       | 3 - Three    | venkat    | Dilli    | OMR,chennai    |

  Scenario Outline: Verifying the Adactin Hotel login and canceling the existing order ID
    Given User is on the adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Adactin1294!"
    And User should cancel existing order ID "<orderID>"
    Then User should verify the success message after canceling order id "The booking has been cancelled."

    Examples: 
      | username    | password   | orderID    |
      | Adactin1294 | Dilli@1234 | TLGZ92F46P |
