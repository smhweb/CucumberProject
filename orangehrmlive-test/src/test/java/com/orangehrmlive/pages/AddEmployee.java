package com.orangehrmlive.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive.utilities.Driver;

public class AddEmployee {

	public AddEmployee() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	// click on addemployee
	@FindBy(linkText = "Add Employee")
	public WebElement addEmp;

	// Firstname
	@FindBy(id = "firstName")
	public WebElement firstName;

	// middlename
	@FindBy(id = "middleName")
	public WebElement middleName;

	// lastname
	@FindBy(id = "lastName")
	public WebElement lastName;

	// Verify EmployeeId
	@FindBy(id = "employeeId")
	public WebElement empId;

	// Check BOx/verify/click if un-clicked
	@FindBy(xpath = "//input[@id='chkLogin']")
	public WebElement checkBox;

	// UserCredential
	@FindBy(xpath = "//input[@name='user_name']")
	public WebElement userName;

	@FindBy(xpath = "//input[@name='user_password']")
	public WebElement passWord;

	@FindBy(xpath = "//*[@id='re_password' or @name='re_password']")
	public WebElement RepassWord;

	// status
	@FindBy(id = "status")
	public WebElement status;

	// enabled Option
	@FindBy(xpath = "//option[contains(text(),'Enabled')]")
	public WebElement enabledOption;

	// saveButton
	@FindBy(id = "btnSave")
	public WebElement save;

}
