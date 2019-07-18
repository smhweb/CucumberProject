@Test3_deleteUser
Feature: Delete new Employee as Admin/HR
 
Scenario: Delete an employee  
	Given I am on the orangehrmlive webpage 
	When I input username in the username textbox 
	And I input Password into Password textbox 
	And I click on Login Button 
	And I go to PIM tab from menu
	And I check the checkbox associated with employee  
	And I click on delete button
	Then employee should be deleted 