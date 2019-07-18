package tests;

import org.testng.annotations.Test;

public class Dependencies {

	@Test
	public void launchBrowser() {
		System.out.println("Class Dependencies: launchBrowser");
//		Assert.fail();
	}

	@Test
	public void login() {
		System.out.println("Class Dependencies: login");
	}

	@Test
	public void doStuffWhileLoggedIn() {
		System.out.println("Class Dependencies: doStuffWHileLoggedIn");
	}

	@Test
	public void logout() {
		System.out.println("Class Dependencies: logout");
	}

}
