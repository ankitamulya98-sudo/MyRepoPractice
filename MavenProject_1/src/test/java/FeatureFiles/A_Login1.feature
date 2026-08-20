@sanity
Feature: Validate Login Fuctionality for Guru99 application

  Scenario Outline: Validate Login for Demo Guru 99 with correct credentials
    Given User opens Guru 99 Demo Application
    And user enters the username in uname field "<username>"
    And user enters the password in passwd field "<password>"
    When user clicks on login button
    Then user will navigate to the home page of the application
    And user closes the browser

    Examples: 
      | username   | password |
      | mngr665066 | UbusanE   |
