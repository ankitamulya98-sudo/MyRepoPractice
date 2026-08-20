@sanity
Feature: Creation of a new Customer

  Background: 
    Given User opens Guru 99 Demo Application
    And user enters the username in uname field "mngr665066"
    And user enters the password in passwd field "UbusanE"
    When user clicks on login button
    Then user will navigate to the home page of the application

  #Then validate that user navigates to the home page of the application
  Scenario Outline: Create new customer with all details
    And user clicks on new customer link
    And user enteres the customer name "<custname>"
    And user selects the gender
    And user enters dob "<DOB>"
    And user enters address "<address>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters pincode "<pin>"
    And user enters mobile "<mobile>"
    And user enters email as emailAddress
    And user enters password "<password>"
    When user clicks on new customer creation submit button
    Then a new customer will be created
    And user captures customer id
    And user closes the browser

    Examples: 
      | custname | DOB        | address | city     | state     | pin    | mobile     | password  |
      | Ankita   | 21-11-1998 | Kuthar  | Manglore | Karnataka | 909099 | 9090999999 | Test@1234 |
