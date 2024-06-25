
Feature: Login Functionality for OPencart E-commerce Website
  As a user of the opencart website
  I want to be able to log in with my account
  So that iI can access my account and manage my orders
 
 Background:
 Given I am on the Opencart login
  

  Scenario: Successful login with valid credentials
    Given I have entered a valid username and password
    When I click on the login button
    Then I should be logged in successfully
  

  Scenario Outline: Unsuccessful login with invalid or empty credentials
    Given I have entered invalid "<username>" and "<password>"
     When I click on the login button
    Then I should see an error message indicating "<error_message>"

    Examples: 
      | username          | password             | error_message                                             |
      | invalid@email.com | invalidpassword 	   | Warning: No match for E-mail Address and/or Password.		 |
    #  | name2@ema.com 		|     validpass        | Warning: No match for E-mail Address and/or Password. 		 |          |
