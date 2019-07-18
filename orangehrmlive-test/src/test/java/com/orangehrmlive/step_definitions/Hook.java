package com.orangehrmlive.step_definitions;

import java.util.concurrent.TimeUnit;

import com.orangehrmlive.utilities.Driver;

import cucumber.api.java.Before;

public class Hook {

	@Before
	public void setUp() {
		Driver.getInstance().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

//	@After
//	public void tearDown(Scenario scenario) {
//		if (scenario.isFailed()) {
//			final byte[] screenshot = ((TakesScreenshot) Driver.getInstance()).getScreenshotAs(OutputType.BYTES);
//			scenario.embed(screenshot, "image/png");
//		}
//		Driver.closeDriver();
//	}
}
