@Test1_addEmployee
Feature: Add new Employee as Admin/HR
	As a admin/HR 
	I want to add a New Employee 
	so that the HR & the employee can complete the boarding process.

@Smoke
Scenario: Add an employee  
	Given I am on the orangehrmlive webpage 
	When I input username in the username textbox 
	And I input Password into Password textbox 
	And I click on Login Button 
	And I go to PIM tab from menu
	And I click add employee
	And I complete the required information
	And I save new employee data
	And I go to PIM tab from menu
	Then click on employee list for verification 
	
	
	
	
	
	
	