package com.orangehrmlive.step_definitions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import com.orangehrmlive.pages.HomePage;
import com.orangehrmlive.pages.MyInfo;
import com.orangehrmlive.pages.PersonalDetails;
import com.orangehrmlive.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Employee_information {

	HomePage homePage = new HomePage();
	MyInfo myInfo = new MyInfo();
	PersonalDetails personalDetails = new PersonalDetails();

	@When("^I enter employee username \"([^\"]*)\"$")
	public void i_enter_employee_username(String username) throws Throwable {
		// setting username
		homePage.username.click();
		homePage.username.sendKeys(username);
	}

	@When("^I enter employee password \"([^\"]*)\"$")
	public void i_enter_employee_password(String password) throws Throwable {
		// setting password
		homePage.password.click();
		homePage.password.sendKeys(password);
	}

	@When("^I click on MyInfo Tab$")
	public void i_click_on_MyInfo_Tab() throws Throwable {
		myInfo.myInfo.click();
	}

	@When("^I click on edit Button$")
	public void i_click_on_edit_Button() throws Throwable {
		personalDetails.save.click();
	}

	@When("^I complete the required fields$")
	public void i_complete_the_required_fields() throws Throwable {
		// Enter Test in other ID Field
		personalDetails.OtherId.sendKeys("Test");

		// use date time to get todays date
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
		java.util.Date today = Calendar.getInstance().getTime();
		String date = dateFormat.format(today);
		System.out.println(date);

		// get the first 2 words
		String todaysDate = date.substring(0, 2);
		System.out.println(todaysDate);

		// click on license expiration date
		personalDetails.licenseExpiryDate.click();
		Driver.getInstance().findElement(By.xpath("//a[contains(text()," + todaysDate + ")]")).click();

		// click on gender
		personalDetails.gender.click();

		// select marital status
		Select msStatus = new Select(personalDetails.martialStatus);
		msStatus.selectByVisibleText("Married");

		// select nationality
		Select nStatus = new Select(personalDetails.nationality);
		nStatus.selectByValue("4");

	}

	@When("^I click on Save Button$")
	public void i_click_on_Save_Button() throws Throwable {
		// click on save button
		personalDetails.save.click();
	}

	@Then("^the boarding process is complete$")
	public void the_boarding_process_is_complete() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) Driver.getInstance();
		String sText = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(sText);

		if (sText.contains("Successfully Saved")) {
			assertTrue(true);
		} else
			assertFalse(false);
	}

}
