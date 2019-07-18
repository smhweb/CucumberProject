@Login_datatable
Feature: Valid registration of Employees Account by Admin/HR

Background: 
	Given  I am on the orangehrmlive webpage 
	
Scenario: Employee Registration
	When I login as a Admin/Hr
	And I register Employee Accounts
#		directly putting data here
		| Mary | Williams | Mary123 | password12345 | password12345 |
		| Code |   Hub    | CodeinHub | password12345 | password12345 |
	Then Employee accounts are created and ready for further use
	
#	Create scenario with a header
@Login_datatable_withHeader
Scenario: Employee Registration with header
	When I login as a Admin/Hr
	And I register Employee Accounts with header 
		|fname | lname     | username  |  password     | confirmpassword |
		| Mary  | Williams | Mary123   | Password12345 | Password12345 |
		| Code  |   Hub    | CodeinHub | Password12345 | Password12345 |
	Then Employee accounts are created and ready for further use
	
	
	