package com.orangehrmlive.step_definitions;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrmlive.pages.Dashboard;
import com.orangehrmlive.pages.HomePage;
import com.orangehrmlive.utilities.ConfigurationReader;
import com.orangehrmlive.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefs {

	Dashboard dashboard;
	HomePage homePage = new HomePage();

	@Given("^I am on the orangehrmlive webpage$")
	public void i_am_on_the_orangehrmlive_webpage() throws Throwable {
		Driver.getInstance().get(ConfigurationReader.getProperty("url"));
		// verify we landed on webpage
		Assert.assertTrue(Driver.getInstance().getTitle().equals(ConfigurationReader.getProperty("homePagetitle")));
		homePage = new HomePage();
		assertTrue(homePage.Logo.isDisplayed());
	}

	@When("^I login as a Admin/Hr$")
	public void i_login_as_a_Admin_Hr() throws Throwable {
		System.out.println("trying to login as an Admin");
		WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 10);
		homePage = new HomePage();
		wait.until(ExpectedConditions.visibilityOf(homePage.username));
		// setting username
		homePage.username.click();
		homePage.username.sendKeys(ConfigurationReader.getProperty("admin.username"));
		// wait.until(ExpectedConditions.visibilityOf(homePage.password));
		// setting password
		homePage.password.click();
		homePage.password.sendKeys(ConfigurationReader.getProperty("admin.password"));
		// wait.until(ExpectedConditions.visibilityOf(homePage.loginButton));
		// click on login button
		homePage.loginButton.click();
	}

	@Then("^I should be able to verify that I am logged in$")
	public void i_should_be_able_to_verify_that_I_am_logged_in() throws Throwable {
		dashboard = new Dashboard();
//		assertTrue(dashboard.WelcomeHomepage.isDisplayed());
		dashboard.WelcomeHomepage.click();
		Thread.sleep(3000);
		dashboard.Logout.click();
	}

	@When("^I input username in the username textbox$")
	public void i_input_username_in_the_username_textbox() throws Throwable {
		homePage = new HomePage();
		homePage.username.click();
		homePage.username.sendKeys(ConfigurationReader.getProperty("admin.username"));
	}

	@When("^I input Password into Password textbox$")
	public void i_input_Password_into_Password_textbox() throws Throwable {
		homePage = new HomePage();
		homePage.password.click();
		homePage.password.sendKeys(ConfigurationReader.getProperty("admin.password"));
	}

	@When("^I click on Login Button$")
	public void i_click_on_Login_Button() throws Throwable {
		homePage = new HomePage();
		homePage.loginButton.click();
	}

	@When("^I login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_login_with_and(String username, String password) throws Throwable {
		homePage.username.click();
		homePage.username.sendKeys(username);
		homePage.password.click();
		homePage.password.sendKeys(password);

		// click on login button
		homePage.loginButton.click();
	}

}
