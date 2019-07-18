package com.orangehrmlive.step_definitions;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import com.orangehrmlive.pages.HomePage;
import com.orangehrmlive.utilities.ConfigurationReader;
import com.orangehrmlive.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefs {

	HomePage homePage = new HomePage();

	@Given("^the user is on orangehrmlive home page$")
	public void the_user_is_on_orangehrmlive_home_page() throws Throwable {
		Driver.getInstance().get(ConfigurationReader.getProperty("url"));
		Assert.assertTrue(Driver.getInstance().getTitle().equals(ConfigurationReader.getProperty("homePagetitle")));

		assertTrue(homePage.Logo.isDisplayed());
	}

	@When("^the user clicks on the username input box$")
	public void the_user_clicks_on_the_username_input_box() throws Throwable {
		homePage.username.click();
	}

	@Then("^the username field should be enabled$")
	public void the_username_field_should_be_enabled() throws Throwable {
		homePage.username.sendKeys(ConfigurationReader.getProperty("admin.username"));
		Assert.assertTrue(homePage.username.isEnabled());
	}

}
