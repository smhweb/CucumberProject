package com.orangehrmlive.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive.utilities.Driver;

public class MyInfo {

	public MyInfo() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(id = "menu_pim_viewMyDetails")
	public WebElement myInfo;
}
