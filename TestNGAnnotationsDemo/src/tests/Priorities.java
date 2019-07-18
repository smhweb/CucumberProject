package tests;

import org.testng.annotations.Test;

public class Priorities {

	@Test(priority = 0)
	public void openBrowser() {
		System.out.println("Class Priorities: openBrowser");
	}

	@Test(priority = 1)
	public void login() {
		System.out.println("Class Priorities: login");
	}

	@Test(priority = 2)
	public void updateUserInfo() {
		System.out.println("Class Priorities: updateUserInfo");
	}

	@Test(priority = 3)
	public void logout() {
		System.out.println("Class Priorities: logout");
	}

}
