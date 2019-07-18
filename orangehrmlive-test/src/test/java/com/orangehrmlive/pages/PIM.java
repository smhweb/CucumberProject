package com.orangehrmlive.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive.utilities.Driver;

public class PIM {

	public PIM() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement pim;

}
