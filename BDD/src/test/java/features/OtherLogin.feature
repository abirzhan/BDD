 @OtherLogin  
Feature: Validate Techfios Login Functionality 

Background: 
	Given User is on the Techfios login page 
@Scenario1	
Scenario Outline: 1 User should be able to login with valid credentials 
	When User enters "<userName>" and "<password>"
	When User enters username as "demo@techfios.com" 
	When User enters password as "abc123" 
	And User clicks on signin button 
	Then User should land on Dashboard page 

Examples:	
|userName         |password|
|demo@techfios.com| abc123|


@Scenario2
Scenario: User should be able to login with valid credentials
 and open a new account 
  When User enters the "<username>" and "<password>"  
  And  User clicks on login button
  Then User should be able to see the dashboard
  Then User clicks on bank and cash 
  Then User clicks on new account 
  Then User fill up the form entering "<accountTitle>"and "<description>"and "<initialBalance>"and "<accountNumber>"and "<contactPerson>"and "<phone>"and "<internetBankingUrl>" and clicks on submit 
  Then User should be able to see validate

 
|userName         |password| |accountTitle    | description | initialBalance| accountNumber| contactPerson| phone      | internetBankingUrl     | 
|demo@techfios.com| abc123|  |Checking account|Supplies     |5000           |053333345     |James         |215-000-0000|https://www.bankandcash/|
 