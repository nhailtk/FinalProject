Feature: MY ACCOUNT - LOGIN
  As a customer, I want to buy some books so that i need to login website.

  Scenario: 1. Log-in with valid username and password
    Given Open home page
    When Click on My Account Menu
    And Enter registered nhailtk@gmail.com in username textbox
    And Enter nhailtk@123456 in password textbox
    And Click on login button
    Then User must successfully login to the web page

  Scenario: 2. Log-in with incorrect username and  incorrect password
    Given Open home page
    When Click on My Account Menu
    And Enter registered nhailtk1@gmail.com in username textbox
    And Enter nhailtk@1234 in password textbox
    And Click on login button
    Then User should see error message1:Error: A user could not be found with this email address.

  Scenario: 3. Log-in with correct username and empty password
    Given Open home page
    When Click on My Account Menu
    And Enter registered nhailtk@gmail.com in username textbox
    And Now enter empty password in the password textbox
    And Click on login button
    Then User should see error message2:Error: Password is required.

  Scenario: 4. Log-in with empty username and valid password.
    Given Open home page
    When Click on My Account Menu
    And Enter empty username in username textbox
    And Enter nhailtk@123456 in password textbox
    And Click on login button
    Then User should see error message3:Error: Username is required.

  Scenario: 5. Log-in with empty username and empty password.
    Given Open home page
    When Click on My Account Menu
    And Enter empty username in username textbox
    And Now enter empty password in the password textbox
    And Click on login button
    Then User should see error message4:Error: Username is required.

  Scenario: 6. Log-in -Password should be masked
    Given Open home page
    When Click on My Account Menu
    And Enter nhailtk@123456 in password textbox
    Then The password field should display the characters in asterisks or bullets such that the password is not visible on the screen

  Scenario: 7. Login-Handles case sensitive
    Given Open home page
    And Click on My Account Menu
    And Enter registered nhailtk@gmail.com in username textbox
    And Enter the case changed password: nhailtk@123 in the password tetxbox
    And Click on login button
    Then Login must fail saying incorrect password: ERROR: The password you entered for the username nhailtk@gmail.com is incorrect. Lost your password?

  Scenario: 8. Login-Authentication
    Given Open home page
    When Click on My Account Menu
    And Enter registered nhailtk@gmail.com in username textbox
    And Enter nhailtk@123456 in password textbox
    And Click on login button
    And Once your are logged in, sign out of the site
    And Now press back button
    Then User shouldn’t be signed in to his account rather a general webpage must be visible