package com.myshop.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.myshop.Base.BaseClass;

public class SignIn_TestCase extends BaseClass {

	/**
	 * Verifies Sign In button text.
	 * 
	 * Steps:
	 * 1. Get actual Sign In button text.
	 * 2. Compare with expected text.
	 */
	@Test(priority = 1)
	public void TC001_verify_that_text_of_Signin_btn() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC001_verify_that_text_of_Signin_btn");

	        // Log the action of retrieving the Sign In button text
	        logger.info("Retrieving the actual text of the Sign In button.");

	        // Get the actual text of the Sign In button
	        String actual_signin_button_text = indexPage.verifing_text_of_SignInBtn();

	        // Log the retrieved text for debugging purposes
	        logger.debug("Actual text retrieved: " + actual_signin_button_text);

	        // Log the expected text for comparison
	        String expected_signin_button_text = MyAccountTestData.getProperty("Expected_signin_button_text");
	        logger.debug("Expected text for comparison: " + expected_signin_button_text);

	        // Perform the assertion to verify the text matches
	        assertEquals(actual_signin_button_text, expected_signin_button_text);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The text of the Sign In button is correct.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The text of the Sign In button does not match.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An unexpected error occurred during the test case.");
	        logger.error("Exception: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	}


	/**
	 * Verifies Sign In button visibility.
	 * 
	 * Steps:
	 * 1. Check if Sign In button is displayed.
	 */
	@Test(priority = 2)
	public void TC002_verify_that_signIn_btn_is_display() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC002_verify_that_signIn_btn_is_display");

	        // Log the action of verifying the Sign In button's display status
	        logger.info("Verifying that the Sign In button is displayed.");

	        // Perform the action to verify the Sign In button's display status
	        boolean isSignInBtnDisplayed = indexPage.verifing_SignInBtn_display();

	        // Log the result of the display status check
	        logger.debug("Is Sign In button displayed: " + isSignInBtnDisplayed);

	        // Assert that the Sign In button is displayed
	        assertTrue(isSignInBtnDisplayed, "Sign In button is not displayed.");

	        // Log the successful completion of the test
	        logger.info("Test case passed: The Sign In button is displayed.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The Sign In button is not displayed.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An unexpected error occurred during the test case.");
	        logger.error("Exception: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	}


	/**
	 * @brief Verify Sign In button functionality.
	 * 
	 * - Click the Sign In button.
	 * - Retrieve the current URL.
	 * - Assert the URL matches the expected value.
	 */
	@Test(priority = 3)
	public void TC003_verify_that_signIn_Btn_works_properly() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC003_verify_that_signIn_Btn_works_properly");

	        // Log the action of clicking the Sign In button
	        logger.info("Clicking on the Sign In button.");

	        // Perform the action to click the Sign In button
	        indexPage.click_On_SignInBtn();

	        // Log the action of retrieving the current URL
	        logger.info("Retrieving the current URL after clicking the Sign In button.");

	        // Get the actual URL after clicking the Sign In button
	        String actual_MyAccount_URL = driver.getCurrentUrl();

	        // Log the actual URL for debugging purposes
	        logger.debug("Actual URL retrieved: " + actual_MyAccount_URL);

	        // Log the expected URL for comparison
	        String expected_MyAccount_URL = MyAccountTestData.getProperty("Expected_MyAccount_URL");
	        logger.debug("Expected URL for comparison: " + expected_MyAccount_URL);

	        // Perform the assertion to verify the URL matches
	        assertEquals(actual_MyAccount_URL, expected_MyAccount_URL);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The Sign In button works properly and redirects to the correct URL.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The Sign In button did not redirect to the expected URL.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An unexpected error occurred during the test case.");
	        logger.error("Exception: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	}

	
	/**
	 * @brief Verify page heading on My Account page.
	 * 
	 * - Click the Sign In button.
	 * - Verify the page heading for account creation.
	 * - Assert the heading matches the expected value in upper case.
	 */
	@Test(priority = 4)
	public void TC004_verify_that_text_of_page_heading_when_we_redirect_to_myaccountPage() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC004_verify_that_text_of_page_heading_when_we_redirect_to_myaccountPage");

	        // Log the action of clicking the Sign In button
	        logger.info("Clicking on the Sign In button.");

	        // Perform the action to click the Sign In button
	        indexPage.click_On_SignInBtn();

	        // Log the action of retrieving the page heading on the My Account page
	        logger.info("Retrieving the page heading on the My Account page.");

	        // Get the actual page heading
	        String actual_pageHeading_for_creating_account = myAccount.verifing_the_left_side_pageHeading_create_an_account();

	        // Log the retrieved page heading for debugging purposes
	        logger.debug("Actual page heading retrieved: " + actual_pageHeading_for_creating_account);

	        // Log the expected page heading for comparison
	        String expected_pageHeading_for_creating_account = MyAccountTestData.getProperty("Expected_pageHeading_for_creating_account").toUpperCase();
	        logger.debug("Expected page heading for comparison: " + expected_pageHeading_for_creating_account);

	        // Perform the assertion to verify the page heading matches
	        assertEquals(actual_pageHeading_for_creating_account, expected_pageHeading_for_creating_account);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The page heading on the My Account page is correct.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The page heading on the My Account page does not match.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An unexpected error occurred during the test case.");
	        logger.error("Exception: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	}

	
	/**
	 * @brief Verify sub heading text on My Account page.
	 * 
	 * - Click the Sign In button.
	 * - Verify the sub heading for account creation.
	 * - Assert the sub heading matches the expected value in upper case.
	 */
	@Test(priority = 5)
	public void TC005_verify_that_text_of_subheading_when_we_redirect_to_myaccountPage() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC005_verify_that_text_of_subheading_when_we_redirect_to_myaccountPage");

	        // Log the action of clicking the Sign In button
	        logger.info("Clicking on the Sign In button.");

	        // Perform the action to click the Sign In button
	        indexPage.click_On_SignInBtn();

	        // Log the action of retrieving the sub heading on the My Account page
	        logger.info("Retrieving the subheading on the My Account page.");

	        // Get the actual sub heading text
	        String actual_subheading_for_creating_account = myAccount.verifing_the_left_side_subHeading_create_an_account();

	        // Log the retrieved sub heading for debugging purposes
	        logger.debug("Actual subheading retrieved: " + actual_subheading_for_creating_account);

	        // Log the expected sub heading for comparison
	        String expected_subheading_for_creating_account = MyAccountTestData.getProperty("Expected_subheading_for_creating_account").toUpperCase();
	        logger.debug("Expected subheading for comparison: " + expected_subheading_for_creating_account);

	        // Perform the assertion to verify the sub heading matches
	        assertEquals(actual_subheading_for_creating_account, expected_subheading_for_creating_account);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The subheading on the My Account page is correct.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The subheading on the My Account page does not match.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An unexpected error occurred during the test case.");
	        logger.error("Exception: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	}


	/**
	 * @brief Verify description text on My Account page.
	 * 
	 * - Click the Sign In button.
	 * - Verify the description text for creating an account.
	 * - Assert the description matches the expected value.
	 */
	@Test(priority = 6)
	public void TC006_verify_that_text_of_description_when_we_redirect_to_myaccountPage() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC006_verify_that_text_of_description_when_we_redirect_to_myaccountPage");

	        // Log the action of clicking the Sign In button
	        logger.info("Clicking on the Sign In button.");

	        // Perform the action to click the Sign In button
	        indexPage.click_On_SignInBtn();

	        // Log the action of retrieving the description on the My Account page
	        logger.info("Retrieving the description on the My Account page.");

	        // Get the actual description text
	        String actual_description_for_creating_account = myAccount.verifing_the_left_side_description();

	        // Log the retrieved description for debugging purposes
	        logger.debug("Actual description retrieved: " + actual_description_for_creating_account);

	        // Log the expected description for comparison
	        String expected_description_for_creating_account = MyAccountTestData.getProperty("Expected_description_for_creating_account");
	        logger.debug("Expected description for comparison: " + expected_description_for_creating_account);

	        // Perform the assertion to verify the description matches
	        assertEquals(actual_description_for_creating_account, expected_description_for_creating_account);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The description on the My Account page is correct.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The description on the My Account page does not match.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An unexpected error occurred during the test case.");
	        logger.error("Exception: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	}


	/**
	 * @brief Verify the label of the email field on My Account page.
	 * 
	 * - Click the Sign In button.
	 * - Verify the label of the email field.
	 * - Assert the label matches the expected value.
	 */
	@Test(priority = 7)
	public void TC007_verify_that_label_of_email_field() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC007_verify_that_label_of_email_field");

	        // Log the action of clicking the Sign In button
	        logger.info("Clicking on the Sign In button.");

	        // Perform the action to click the Sign In button
	        indexPage.click_On_SignInBtn();

	        // Log the action of retrieving the label of the email field
	        logger.info("Retrieving the label of the email field on the My Account page.");

	        // Get the actual label text of the email field
	        String actual_label_of_email_field = myAccount.verifing_the_left_side_label_email_field();

	        // Log the retrieved label for debugging purposes
	        logger.debug("Actual label retrieved: " + actual_label_of_email_field);

	        // Log the expected label for comparison
	        String expected_label_of_email_field = MyAccountTestData.getProperty("Expected_label_of_email_field");
	        logger.debug("Expected label for comparison: " + expected_label_of_email_field);

	        // Perform the assertion to verify the label matches
	        assertEquals(actual_label_of_email_field, expected_label_of_email_field);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The label of the email field is correct.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The label of the email field does not match.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An unexpected error occurred during the test case.");
	        logger.error("Exception: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	}


	/**
	 * @brief Verify that the email field is displayed on the My Account page.
	 * 
	 * - Click the Sign In button.
	 * - Check the display of the email field on the left side of the My Account page.
	 */
	@Test(priority = 8)
	public void TC008_verify_that_the_email_field_display() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC008_verify_that_the_email_field_display");

	        // Log the action of clicking the Sign In button
	        logger.info("Clicking on the Sign In button.");

	        // Perform the action to click the Sign In button
	        indexPage.click_On_SignInBtn();

	        // Log the action of verifying the display status of the email field
	        logger.info("Verifying that the email field is displayed on the left box of the My Account page.");

	        // Perform the action to check if the email field is displayed
	        boolean isEmailFieldDisplayed = myAccount.verifing_left_side_email_field_display_on_leftBox();

	        // Log the result of the display status check
	        logger.debug("Is the email field displayed: " + isEmailFieldDisplayed);

	        // Assert that the email field is displayed
	        assertTrue(isEmailFieldDisplayed, "Email field is not displayed.");

	        // Log the successful completion of the test
	        logger.info("Test case passed: The email field is displayed on the My Account page.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The email field is not displayed as expected.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An unexpected error occurred during the test case.");
	        logger.error("Exception: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	}


	/**
	 * @brief Verify that the email field handles invalid email input properly.
	 * 
	 * - Click the Sign In button.
	 * - Enter an invalid email address in the email field.
	 * - Click the Create Account button.
	 * - Verify that the correct error message for invalid email is displayed.
	 */
	@Test(priority = 9)
	public void TC009_verify_that_email_field_works_properly_with_invalid_email() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC009_verify_that_email_field_works_properly_with_invalid_email");

	        // Log the action of clicking the Sign In button
	        logger.info("Clicking on the Sign In button.");

	        // Perform the action to click the Sign In button
	        indexPage.click_On_SignInBtn();

	        // Log the action of entering an invalid email address
	        String invalidEmail = com.myshop.utilities.RandomEmails.invalidEmail_generate();
	        logger.info("Entering an invalid email address: " + invalidEmail);
	        myAccount.letf_side_entering_email(invalidEmail);

	        // Log the action of clicking the Create Account button
	        logger.info("Clicking on the Create Account button.");
	        myAccount.click_on_create_acc();

	        // Log the action of retrieving the error message for the invalid email
	        logger.info("Retrieving the error message for the invalid email.");

	        // Get the actual error message
	        String actual_error_message_for_invalid_email = myAccount.verifing_Left_box_that_error_message_for_invalid_email();

	        // Log the retrieved error message for debugging purposes
	        logger.debug("Actual error message retrieved: " + actual_error_message_for_invalid_email);

	        // Log the expected error message for comparison
	        String expected_error_message_for_invalid_email = MyAccountTestData.getProperty("Expected_error_message_for_invalid_email");
	        logger.debug("Expected error message for comparison: " + expected_error_message_for_invalid_email);

	        // Perform the assertion to verify the error message matches
	        assertEquals(actual_error_message_for_invalid_email, expected_error_message_for_invalid_email);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The error message for the invalid email is correct.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The error message for the invalid email does not match.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An unexpected error occurred during the test case.");
	        logger.error("Exception: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	}

	
	/**
	 * @brief Verify that the user cannot proceed with an empty email field.
	 * 
	 * - Click the Sign In button.
	 * - Enter an empty email address in the email field.
	 * - Click the Create Account button.
	 * - Verify that the correct error message for an empty email field is displayed.
	 */
	@Test(priority = 10)
	public void TC010_verify_that_user_should_not_proceed_with_empty_email_field() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC010_verify_that_user_should_not_proceed_with_empty_email_field");

	        // Log the action of clicking the Sign In button
	        logger.info("Clicking on the Sign In button.");

	        // Perform the action to click the Sign In button
	        indexPage.click_On_SignInBtn();

	        // Log the action of entering an empty email address
	        logger.info("Entering an empty email address.");
	        myAccount.letf_side_entering_email("");

	        // Log the action of clicking the Create Account button
	        logger.info("Clicking on the Create Account button.");
	        myAccount.click_on_create_acc();

	        // Log the action of retrieving the error message for the empty email field
	        logger.info("Retrieving the error message for the empty email field.");

	        // Get the actual error message
	        String actual_error_message_for_invalid_email = myAccount.verifing_Left_box_that_error_message_for_invalid_email();

	        // Log the retrieved error message for debugging purposes
	        logger.debug("Actual error message retrieved: " + actual_error_message_for_invalid_email);

	        // Log the expected error message for comparison
	        String expected_error_message_for_invalid_email = MyAccountTestData.getProperty("Expected_error_message_for_invalid_emai");
	        logger.debug("Expected error message for comparison: " + expected_error_message_for_invalid_email);

	        // Perform the assertion to verify the error message matches
	        assertEquals(actual_error_message_for_invalid_email, expected_error_message_for_invalid_email);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The error message for the empty email field is correct.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The error message for the empty email field does not match.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An unexpected error occurred during the test case.");
	        logger.error("Exception: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	}

	@Test(priority = 11)
	public void verify_that_email_field_works_properly_with_valid_email() throws InterruptedException {
		indexPage.click_On_SignInBtn();;
		myAccount.letf_side_entering_email(com.myshop.utilities.RandomEmails.validEmail_generate());
		myAccount.click_on_create_acc();
		
	}
}
