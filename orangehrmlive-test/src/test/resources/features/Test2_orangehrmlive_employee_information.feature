@Test2_EmployeeInfo
Feature: Add Employee Information
	As an employee
	add the employee information fields (Personal Details)
	to complete the boarding process
	
Scenario: Add Employee Information
	Given I am on the orangehrmlive webpage
	When I enter employee username "CodeinHub"
	And I enter employee password "Code12345"
	And I click on Login Button
	And I click on MyInfo Tab
	And I click on edit Button
	And I complete the required fields
	And I click on Save Button
	Then the boarding process is complete
	
	
	
	