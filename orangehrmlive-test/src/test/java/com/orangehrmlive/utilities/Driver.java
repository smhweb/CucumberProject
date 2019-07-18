package com.orangehrmlive.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	private static WebDriver driver;

	public static WebDriver getInstance() {

		if (driver == null) {
			switch (ConfigurationReader.getProperty("browser")) {
			case "chrome":
				System.setProperty(ConfigurationReader.getProperty("chrome.driver.type"),
						ConfigurationReader.getProperty("chrome.driver.path"));
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty(ConfigurationReader.getProperty("gecko.driver.type"),
						ConfigurationReader.getProperty("gecko.driver.path"));
				driver = new FirefoxDriver();
				break;
			default:
				System.setProperty(ConfigurationReader.getProperty("chrome.driver.type"),
						ConfigurationReader.getProperty("chrome.driver.path"));
				driver = new ChromeDriver();
			}
		}
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
