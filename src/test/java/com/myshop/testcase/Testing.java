package com.myshop.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.myshop.Base.BaseClass;

public class Testing extends BaseClass {

	@Test(priority = 1)
	public void TC001_verify_the_text_of_contact_btn() {
		try {
			// Log the start of the test case
			BaseClass.extentTest.log(Status.INFO, "Starting test case: Logger_TC001_verify_the_text_of_contact_btn");

			// Log the action of retrieving the contact button text
			BaseClass.extentTest.log(Status.INFO, "Retrieving the actual text of the contact button.");

			// Get the actual text of the contact button
			String actual_text_of_contact_btn = indexPage.verifing_text_of_ContactBtn();
			BaseClass.extentTest.log(Status.INFO, "Actual text retrieved: " + actual_text_of_contact_btn);

			// Log the expected text for comparison
			String expected_text = ContactUsTestData.getProperty("Expected_text_of_contact_bt");
			BaseClass.extentTest.log(Status.INFO, "Expected text for comparison: " + expected_text);

			// Perform the assertion to verify the text matches
			assertEquals(actual_text_of_contact_btn, expected_text);
			BaseClass.extentTest.log(Status.PASS, "Test case passed: The text of the contact button is correct.");
		} catch (AssertionError e) {
			BaseClass.extentTest.log(Status.FAIL, "Test case failed: The text of the contact button does not match.");
			BaseClass.extentTest.log(Status.FAIL, "AssertionError: " + e.getMessage());
			throw e; // Re-throw the exception to indicate the test failed
		} catch (Exception e) {
			BaseClass.extentTest.log(Status.FAIL, "An unexpected error occurred during the test case.");
			BaseClass.extentTest.log(Status.FAIL, "Exception: " + e.getMessage());
			throw e; // Re-throw the exception to indicate the test failed
		}
	}

	@Test(priority = 2)
	public void TC002_verify_that_contactUs_functionality_works_propelry() {
		try {
			Reporter.log("Starting test case: TC002_verify_that_contactUs_functionality_works_propelry");
			logger.info("Starting test case: TC002_verify_that_contactUs_functionality_works_propelry");
			
			Reporter.log("Clicking on the Contact button.");
			logger.info("Clicking on the Contact button.");
			indexPage.click_On_ContactBtn();

			Reporter.log("Retrieving the current URL after clicking the Contact button.");
			logger.info("Retrieving the current URL after clicking the Contact button.");
			String currentUrl = driver.getCurrentUrl();

			Reporter.log("Current URL retrieved: " + currentUrl);
			logger.info("Current URL retrieved: " + currentUrl);

			String expectedUrl = ContactUsTestData.getProperty("Expected_Contact_Page_URL");
			Reporter.log("Expected URL for comparison: " + expectedUrl);
			logger.info("Expected URL for comparison: " + expectedUrl);

			assertEquals(currentUrl, expectedUrl);

			Reporter.log("Test case passed: Contact Us functionality works properly.");
			logger.info("Test case passed: Contact Us functionality works properly.");
		} catch (AssertionError e) {
			Reporter.log("Test case failed: Contact Us functionality does not work properly.");
			logger.info("Test case failed: Contact Us functionality does not work properly.");
			Reporter.log("AssertionError: " + e.getMessage());
			throw e; 
		} catch (Exception e) {
			Reporter.log("An unexpected error occurred during the test case.");
			logger.info("An unexpected error occurred during the test case.");
			throw e; 
		}
	}
}
