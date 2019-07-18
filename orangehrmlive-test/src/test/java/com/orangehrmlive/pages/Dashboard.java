package com.orangehrmlive.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive.utilities.Driver;

public class Dashboard {

	private WebDriver driver;

	public Dashboard() {
		this.driver = Driver.getInstance();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "welcome")
	public WebElement WelcomeHomepage;

	@FindBy(linkText = "Logout")
	public WebElement Logout;

}
