 @Login 
Feature: Login as Admin/Hr 
	As a User, I want to login to OrangeHrmLive Website 
	when I provide username and password

@smoke123 @regression123
Scenario: Login as a Admin/Hr version one 
	Given I am on the orangehrmlive webpage 
	When I login as a Admin/Hr 
	Then I should be able to verify that I am logged in 
	
@regression123
Scenario: Login as a Admin/Hr version two 
	Given I am on the orangehrmlive webpage 
	When I input username in the username textbox 
	And I input Password into Password textbox 
	And I click on Login Button 
	Then I should be able to verify that I am logged in 
	
	
# ctrl + / for comment / uncomment