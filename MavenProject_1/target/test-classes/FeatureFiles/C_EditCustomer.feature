@sanity
Feature: Edit existing customer

  Background: 
    Given User opens Guru 99 Demo Application
    And user enters the username in uname field "mngr665066"
    And user enters the password in passwd field "UbusanE"
    When user clicks on login button
    Then user will navigate to the home page of the application

  #Then validate that user navigates to the home page of the application
  Scenario Outline: Edit the existing customer using customer ID
    And user clicks on edit customer link
    And user enters the customer ID
    And user clicks on submit button
    And user edit address
    And user click on submit
    And user closes the browser
   