@BookHotel
Feature: Verifying the Book Hotel Page of Adactin Hotel

  Scenario Outline: Verifying Book Hotel Page of Adactin Hotel by entering all fields
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

    Examples: 
      | username    | password   | location | hotels      | roomType | roomNos | checkIn    | checkOut   | adultsPerRoom | childPerRoom | firstname | lastname | billingaddress |
      | Adactin1294 | Dilli@1234 | Sydney   | Hotel Creek | Standard | 1 - One | 20/11/2021 | 14/12/2021 | 2 - One       | 3 - Three    | venkat    | Dilli    | OMR,chennai    |

 
  Scenario Outline: Verifying Book Hotel Page of Adactin Hotel by entering all fields
    Given User is on the adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Adactin1294!"
    And User should search hotels "<location>","<hotels>","<roomType>","<roomNos>","<checkIn>","<checkOut>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should verify after click search success message "Select Hotel"
    And User should select a hotel
    Then User should verify after click continue success message "Book A Hotel"
    And User should click book now without entering any fields
    Then User should verify error message "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username    | password   | location | hotels      | roomType | roomNos | checkIn    | checkOut   | adultsPerRoom | childPerRoom | firstname | lastname | billingaddress |
      | Adactin1294 | Dilli@1234 | Sydney   | Hotel Creek | Standard | 1 - One | 20/11/2021 | 14/12/2021 | 2 - One       | 3 - Three    | venkat    | Dilli    | OMR,chennai    |
