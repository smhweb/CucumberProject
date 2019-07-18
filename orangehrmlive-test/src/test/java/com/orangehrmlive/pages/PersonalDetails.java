package com.orangehrmlive.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive.utilities.Driver;

public class PersonalDetails {

	public PersonalDetails() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	// verify the employee
	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement EmployeeDetail;

	// employee first name
	@FindBy(xpath = "//input[@id='personal_txtEmpFirstName']")
	public WebElement firstName;

	// employee middle name
	@FindBy(xpath = "//input[@name='personal[txtEmpMiddleName]']")
	public WebElement middleName;

	// employee last name
	@FindBy(xpath = "//input[@name='personal[txtEmpLastName]']")
	public WebElement lastName;

	// other id
	@FindBy(id = "personal_txtOtherID")
	public WebElement OtherId;

	// Gender selection
	@FindBy(id = "personal_optGender_2")
	public WebElement gender;

	// marital status
	@FindBy(id = "personal_cmbMarital")
	public WebElement martialStatus;

	// nationality
	@FindBy(id = "personal_cmbNation")
	public WebElement nationality;

	// DOB
	@FindBy(id = "personal_DOB")
	public WebElement DOB;

	// Liscense Expiry Date
	@FindBy(id = "personal_txtLicExpDate")
	public WebElement licenseExpiryDate;

	// click on the edit button
	@FindBy(id = "btnSave")
	public WebElement save;

}
