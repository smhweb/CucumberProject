package com.orangehrmlive.step_definitions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.orangehrmlive.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Delete_User {

	int rowSize;

	@When("^I check the checkbox associated with employee$")
	public void i_check_the_checkbox_associated_with_employee() throws Throwable {

		// identify the table and store it inside a variable
		WebElement webtable = Driver.getInstance().findElement(By.id("resultTable"));

		// print number of rows in table
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		rowSize = rows.size();
		System.out.println("WebTable rows Count: " + rowSize);

		// print number of columns in a table
		List<WebElement> cols = webtable.findElements(By.tagName("th"));
		int colSize = cols.size();
		System.out.println("WebTable cols count: " + colSize);

		// Loop through webTable rows
		for (int rowNum = 1; rowNum < rowSize; rowNum++) {
			String cellValue = null;
			// loop through each cell
			for (int cellNum = 1; cellNum < colSize; cellNum++) {
				cellValue = Driver.getInstance()
						.findElement(
								By.xpath("//table[@id='resultTable']/tbody/tr[" + rowNum + "]/td[" + cellNum + "]"))
						.getText();
				System.out.println(cellValue);
				if (cellValue.equals("Mary")) {
					Driver.getInstance()
							.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + rowNum + "]/td[1]")).click();
					break;
				}
				if (cellValue.equals("Mary")) {
					break;
				}
			}
		}
	}

	@When("^I click on delete button$")
	public void i_click_on_delete_button() throws Throwable {
		Thread.sleep(3000);
		// click on delete button
		Driver.getInstance().findElement(By.id("btnDelete")).click();
		Thread.sleep(3000);
		// click ok on popup message box
		Driver.getInstance().findElement(By.id("dialogDeleteBtn")).click();
	}

	@Then("^employee should be deleted$")
	public void employee_should_be_deleted() throws Throwable {
		// identify the table and store it inside a variable
		WebElement webtable1 = Driver.getInstance().findElement(By.id("resultTable"));

		// print number of rows in table
		List<WebElement> rows1 = webtable1.findElements(By.tagName("tr"));
		int rowSize1 = rows1.size();
		System.out.println("WebTable rows Count: " + rowSize1);
		if (rowSize1 < rowSize) {
			assertTrue(true);
		}

		JavascriptExecutor js = (JavascriptExecutor) Driver.getInstance();
		String sText = js.executeScript(" return document.documentElement.innerText;").toString();
		System.out.println(sText);

		if (sText.contains("Successfully Deleted")) {
			assertTrue(true);
		} else {
			assertFalse(false);
		}

	}
}
