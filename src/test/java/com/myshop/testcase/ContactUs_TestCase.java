package com.myshop.testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.myshop.Base.BaseClass;

public class ContactUs_TestCase extends BaseClass {

	/**
	 * Verifies the text of the Contact button.
	 * 
	 * Steps: 1. Logs and retrieves the actual text. 
	 *        2. Compares the text with the expected value. 
	 *        3. Logs the success of the test case.
	 */
	@Test(priority = 1)
	public void TC001_verify_the_text_of_contact_btn() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC001_verify_the_text_of_contact_btn");
	        Reporter.log("Starting test case: TC001_verify_the_text_of_contact_btn");
	        // Log the action of retrieving the contact button text
	        logger.info("Retrieving the actual text of the contact button.");
	        Reporter.log("Retrieving the actual text of the contact button.");
	        
	        // Get the actual text of the contact button
	        String actual_text_of_contact_btn = indexPage.verifing_text_of_ContactBtn();

	        // Log the retrieved text for debugging purposes
	        logger.debug("Actual text retrieved: " + actual_text_of_contact_btn);
	        Reporter.log("Actual text retrieved: " + actual_text_of_contact_btn);
	        
	        // Log the expected text for comparison
	        String expected_text = ContactUsTestData.getProperty("Expected_text_of_contact_bt");
	        logger.debug("Expected text for comparison: " + expected_text);
	        Reporter.log("Expected text for comparison: " + expected_text);
	        
	        // Perform the assertion to verify the text matches
	        assertEquals(actual_text_of_contact_btn, expected_text);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The text of the contact button is correct.");
	        Reporter.log("Test case passed: The text of the contact button is correct.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The text of the contact button does not match.");
	        Reporter.log("Test case failed: The text of the contact button does not match.");
	        logger.error("AssertionError: " + e.getMessage());
	        Reporter.log("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An unexpected error occurred during the test case.");
	        Reporter.log("An unexpected error occurred during the test case.");
	        logger.error("Exception: " + e.getMessage());
	        Reporter.log("Exception: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	}


	/**
	 * Verifies Contact Us page functionality.
	 * 
	 * Steps: 1. Clicks on the Contact button. 
	 *        2. Retrieves the current page URL. 
	 *        3. Asserts the URL matches the expected.
	 */
	@Test(priority = 2)
	public void TC002_verify_that_contactUs_functionality_works_propelry() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC002_verify_that_contactUs_functionality_works_propelry");
	        // Log the action of clicking on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Log the action of retrieving the current URL
	        logger.info("Retrieving the current URL after clicking the Contact button.");
	        String currentUrl = driver.getCurrentUrl();

	        // Log the retrieved URL for debugging purposes
	        logger.debug("Current URL retrieved: " + currentUrl);

	        // Log the expected URL for comparison
	        String expectedUrl = ContactUsTestData.getProperty("Expected_Contact_Page_URL");
	        logger.debug("Expected URL for comparison: " + expectedUrl);

	        // Perform the assertion to verify the URL matches
	        assertEquals(currentUrl, expectedUrl);

	        // Log the successful completion of the test
	        logger.info("Test case passed: Contact Us functionality works properly.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: Contact Us functionality does not work properly.");
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
	 * Verifies Contact page title and sub heading.
	 * 
	 * Steps: 1. Clicks on the Contact button. 
	 *        2. Retrieves and verifies the page title. 
	 *        3. Retrieves and verifies the page sub heading.
	 */
	@Test(priority = 3)
	public void TC003_verify_that_after_redirecting_to_contactPage_CustomerServiceContactUs_text_and_SendAMessage_text_should_dispaly() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC003_verify_that_after_redirecting_to_contactPage_CustomerServiceContactUs_text_and_SendAMessage_text_should_dispaly");

	        // Log the action of clicking on the Contact button
	        logger.info("Clicking on the Contact button to navigate to the Contact page.");
	        indexPage.click_On_ContactBtn();

	        // Log the action of retrieving the page heading
	        logger.info("Retrieving the page heading of the Contact page.");
	        String actual_title_of_contact_page = contactPage.verifing_page_heading_of_contactPage();

	        // Log the actual and expected heading for comparison
	        String expected_title = ContactUsTestData.getProperty("Expected_title_of_contact_page").toUpperCase();
	        logger.debug("Actual page title: " + actual_title_of_contact_page);
	        logger.debug("Expected page title: " + expected_title);

	        // Perform the assertion for page heading
	        assertEquals(actual_title_of_contact_page, expected_title);

	        // Log the action of retrieving the sub-heading
	        logger.info("Retrieving the sub-heading of the Contact page.");
	        String actual_sub_heading_of_contactPage = contactPage.verifing_sub_heading_of_contactPage();

	        // Log the actual and expected sub-heading for comparison
	        String expected_sub_heading = ContactUsTestData.getProperty("Expected_sub_heading_of_contactPage").toUpperCase();
	        logger.debug("Actual sub-heading: " + actual_sub_heading_of_contactPage);
	        logger.debug("Expected sub-heading: " + expected_sub_heading);

	        // Perform the assertion for sub-heading
	        assertEquals(actual_sub_heading_of_contactPage, expected_sub_heading);

	        // Log the successful completion of the test
	        logger.info("Test case passed: Customer Service text and 'Send A Message' text are displayed correctly.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: Customer Service text and 'Send A Message' text are not displayed correctly.");
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
	 * Verifies dropdown functionality and label display.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Retrieves and verifies the dropdown label.
	 * 3. Selects an option from the dropdown.
	 * 4. Verifies the selected option is visible.
	 */
	@Test(priority = 4)
	public void TC004_verify_that_dropfunctinality_and_label_display_and_works_properly() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC004_verify_that_dropfunctinality_and_label_display_and_works_properly");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Retrieve and verify the label of the dropdown
	        logger.info("Retrieving the actual label of the dropdown.");
	        String actual_label_of_dropdown = contactPage.verifing_label_of_dropdown();
	        logger.debug("Actual dropdown label retrieved: " + actual_label_of_dropdown);

	        // Compare the actual label with the expected label
	        String expected_label = ContactUsTestData.getProperty("Expected_label_of_dropdown");
	        logger.debug("Expected dropdown label for comparison: " + expected_label);
	        assertEquals(actual_label_of_dropdown, expected_label);

	        // Select an option from the dropdown
	        logger.info("Selecting option with value '2' from the dropdown.");
	        WebElement dd = driver.findElement(By.xpath("//select[@id='id_contact']"));
	        Select ddd = new Select(dd);
	        ddd.selectByValue("2");
	        logger.info("Option with value '2' selected from the dropdown.");

	        // Verify the selected option is visible
	        logger.info("Retrieving the selected option from the dropdown.");
	        String selectOption_visible = contactPage.verifing_selected_option_visible();
	        logger.debug("Selected option visible: " + selectOption_visible);

	        // Compare the selected option with the expected option
	        String expected_option = ContactUsTestData.getProperty("Expected_Option_1");
	        logger.debug("Expected selected option for comparison: " + expected_option);
	        assertEquals(selectOption_visible, expected_option);

	        // Log the successful completion of the test
	        logger.info("Test case passed: Dropdown functionality and label display work properly.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: Dropdown functionality or label display is incorrect.");
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
	 * Verifies sentence display after selecting option.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Selects 'Customer Service' from dropdown.
	 * 3. Verifies the sentence displayed for selection.
	 */
	@Test(priority = 5)
	public void TC005_verify_that_after_select_option_CustomerService_then_it_should_show_For_any_question_about_a_product_an_order() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC005_verify_that_after_select_option_CustomerService_then_it_should_show_For_any_question_about_a_product_an_order");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Select the 'Customer Service' option from the dropdown
	        logger.info("Selecting 'Customer Service' option from the dropdown.");
	        WebElement dd = driver.findElement(By.xpath("//select[@id='id_contact']"));
	        Select ddd = new Select(dd);
	        String customerServiceOption = ContactUsTestData.getProperty("Expected_Option_1");
	        ddd.selectByVisibleText(customerServiceOption);
	        logger.info("Option selected: " + customerServiceOption);

	        // Retrieve the sentence displayed after selecting the option
	        logger.info("Retrieving the sentence displayed for 'Customer Service' option.");
	        String actual_sentence = contactPage.verifing_sentance_on_option_customerServie();
	        logger.debug("Actual sentence retrieved: " + actual_sentence);

	        // Compare the actual sentence with the expected sentence
	        String expected_sentence = ContactUsTestData.getProperty("Expected_sentace_with_selected_Customer_service");
	        logger.debug("Expected sentence for comparison: " + expected_sentence);
	        assertEquals(actual_sentence, expected_sentence);

	        // Log the successful completion of the test
	        logger.info("Test case passed: 'Customer Service' option displays the correct sentence.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: 'Customer Service' option does not display the correct sentence.");
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
	 * Verifies sentence display after selecting option.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Selects 'Webmaster' from dropdown.
	 * 3. Verifies the sentence displayed for selection.
	 */
	@Test(priority = 6)
	public void TC006_verify_that_after_select_option_Webmaster_then_it_should_show_For_any_question_about_a_product_an_order() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: verify_that_after_select_option_Webmaster_then_it_should_show_For_any_question_about_a_product_an_order");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Select the 'Webmaster' option from the dropdown
	        logger.info("Selecting 'Webmaster' option from the dropdown.");
	        WebElement dd = driver.findElement(By.xpath("//select[@id='id_contact']"));
	        Select ddd = new Select(dd);
	        String webmasterOption = ContactUsTestData.getProperty("Expected_Option_2");
	        ddd.selectByVisibleText(webmasterOption);
	        logger.info("Option selected: " + webmasterOption);

	        // Retrieve the sentence displayed after selecting the option
	        logger.info("Retrieving the sentence displayed for 'Webmaster' option.");
	        String actual_sentence = contactPage.verifing_sentance_on_option_webMaster();
	        logger.debug("Actual sentence retrieved: " + actual_sentence);

	        // Compare the actual sentence with the expected sentence
	        String expected_sentence = ContactUsTestData.getProperty("Expected_sentace_with_selected_Webmaster");
	        logger.debug("Expected sentence for comparison: " + expected_sentence);
	        assertEquals(actual_sentence, expected_sentence);

	        // Log the successful completion of the test
	        logger.info("Test case passed: 'Webmaster' option displays the correct sentence.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: 'Webmaster' option does not display the correct sentence.");
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
	 * Verifies default dropdown option is 'Choose'.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Verifies dropdown default option value.
	 */
	@Test(priority = 7)
	public void TC007_verify_that_dropdown_by_defauls_should_be_on_choose_option() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: verify_that_dropdown_by_defauls_should_be_on_choose_option");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Retrieve the default value of the dropdown
	        logger.info("Retrieving the default value of the dropdown.");
	        String actual_default_option = contactPage.verifying_dropdown_by_default_value();
	        logger.debug("Actual default option retrieved: " + actual_default_option);

	        // Log the expected default option for comparison
	        String expected_default_option = ContactUsTestData.getProperty("Expected_default_option");
	        logger.debug("Expected default option for comparison: " + expected_default_option);

	        // Perform the assertion to verify the default option matches
	        assertEquals(actual_default_option, expected_default_option);

	        // Log the successful completion of the test
	        logger.info("Test case passed: Dropdown default option is correct.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: Dropdown default option is incorrect.");
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
	 * Verifies the label of email field.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Verifies the email field label.
	 */
	@Test(priority = 8)
	public void TC008_verify_the_label_of_email_fields() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: verify_the_label_of_email_fields");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Retrieve the actual label of the email field
	        logger.info("Retrieving the actual label of the email field.");
	        String actual_label_for_email_Address = contactPage.verifing_the_label_of_email_field();
	        logger.debug("Actual label for email address retrieved: " + actual_label_for_email_Address);

	        // Log the expected label for comparison
	        String expected_label = ContactUsTestData.getProperty("Expected_label_for_email_Address");
	        logger.debug("Expected label for email address: " + expected_label);

	        // Perform the assertion to verify the label matches
	        assertEquals(actual_label_for_email_Address, expected_label);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The label of the email field is correct.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The label of the email field is incorrect.");
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
	 * Verifies the email field is displayed.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Checks if the email field is visible.
	 */
	@Test(priority = 9)
	public void TC009_verify_that_email_field_is_display() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: verify_that_email_field_is_display");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Verify that the email field is displayed
	        logger.info("Verifying that the email field is displayed.");
	        contactPage.verifing_emailfield_display();
	        
	        // Log the successful completion of the test
	        logger.info("Test case passed: The email field is displayed.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The email field is not displayed.");
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
	 * Verifies email input is visible in field.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Generates a valid random email.
	 * 3. Enters email and verifies its visibility.
	 */
	@Test(priority = 10)
	public void TC010_verify_that_user_can_type_and_entered_email_should_be_visible_in_emailField() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: verify_that_user_can_type_and_entered_email_should_be_visible_in_emailField");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Generate a valid email
	        String valid_enterGeneratedEmail = com.myshop.utilities.RandomEmails.validEmail_generate();
	        logger.info("Generated email for testing: " + valid_enterGeneratedEmail);

	        // Enter the generated email into the email field
	        logger.info("Entering the generated email into the email field.");
	        contactPage.enterEmail(valid_enterGeneratedEmail);

	        // Verify that the entered email is visible in the email field
	        logger.info("Verifying that the entered email is visible in the email field.");
	        String enterEmail_In_email_field = contactPage.verifing_entered_email_should_be_display();
	        logger.debug("Entered email in email field: " + enterEmail_In_email_field);

	        // Log the expected email for comparison
	        logger.debug("Expected email for comparison: " + valid_enterGeneratedEmail);

	        // Perform the assertion to verify the email matches
	        assertEquals(valid_enterGeneratedEmail, enterEmail_In_email_field);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The entered email is visible in the email field.");
	    } catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The entered email is not visible in the email field.");
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
	 * Verifies the Order Reference field is displayed.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Checks if the Order Reference field is visible.
	 */
	@Test(priority = 11)
	public void TC011_verify_that_orderReference_field_is_display() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC011_verify_that_orderReference_field_is_display");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Verify that the order reference field is displayed
	        logger.info("Verifying that the order reference field is displayed.");
	        contactPage.verifing_order_field_display();
	        
	        // Log the successful completion of the test
	        logger.info("Test case passed: The order reference field is displayed.");
	    }
	    catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The orderReference field is not display.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	    catch (Exception e) {
	        // Log any exceptions that occur
	        logger.error("An unexpected error occurred during the test case.");
	        logger.error("Exception: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	}

	
	/**
	 * Verifies the label of Order Reference field.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Retrieves and verifies the Order Reference label.
	 */
	@Test(priority = 12)
	public void TC012_verify_the_label_of_order_ref() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC012_verify_the_label_of_order_ref");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Retrieve the label for the order reference field
	        logger.info("Retrieving the label for the order reference field.");
	        String actual_label_for_order_reference = contactPage.verifing_the_labe_of_order_reference_field();

	        // Log the actual label for debugging purposes
	        logger.debug("Actual label retrieved: " + actual_label_for_order_reference);

	        // Retrieve the expected label from the test data
	        String expected_label = ContactUsTestData.getProperty("Expected_label_for_order_reference");
	        logger.debug("Expected label for comparison: " + expected_label);

	        // Perform the assertion to verify the label matches
	        logger.info("Comparing actual label with expected label.");
	        assertEquals(actual_label_for_order_reference, expected_label);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The label for the order reference field is correct.");
	    } 
	    catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The label of orderReference field is incorrect.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	    catch (Exception e) {
	        // Log any exceptions that occur
	        logger.error("An error occurred during the test case: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test has failed
	    }
	}

	
	/**
	 * Verifies Order Number input visibility.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Generates and enters a random Order Number.
	 * 3. Verifies the entered Order Number is visible.
	 */
	@Test(priority = 13)
	public void TC013_verify_that_user_can_type_and_entered_OrderNumber_should_be_visible_in_orderReferenceField() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC013_verify_that_user_can_type_and_entered_OrderNumber_should_be_visible_in_orderReferenceField");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Generate a random order number
	        String randomOrderNumber = com.myshop.utilities.RandomOrderNumberGenerate.randomOrderNumberGenerate();
	        logger.info("Generated random order number: " + randomOrderNumber);

	        // Enter the random order number in the order reference field
	        logger.info("Entering the random order number into the order reference field.");
	        contactPage.enter_order_reference_number(randomOrderNumber);

	        // Verify that the entered order number is displayed in the order reference field
	        logger.info("Verifying that the entered order number is visible in the order reference field.");
	        String enterNumber_In_order_field = contactPage.verifing_entered_orderNumber_should_be_display();
	        assertEquals(randomOrderNumber, enterNumber_In_order_field);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The entered order number is visible in the order reference field.");
	    } 
	    catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The entered text is not visible is orderReference field.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	    catch (Exception e) {
	        // Log any exceptions that occur
	        logger.error("An unexpected error occurred during the test case.");
	        logger.error("Exception: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	}

	
	/**
	 * Verifies the label of Attach File.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Retrieves and verifies the Attach File label.
	 */
	@Test(priority = 14)
	public void TC014_verify_the_label_of_Attch_file() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC014_verify_the_label_of_Attch_file");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Retrieve the label for the attach file field
	        logger.info("Retrieving the label for the attach file field.");
	        String actual_label_for_attach_file = contactPage.verifing_the_label_of_attach_file();
	        
	        // Log the actual label for debugging purposes
	        logger.debug("Actual label retrieved: " + actual_label_for_attach_file);

	        // Retrieve the expected label from the test data
	        String expected_label = ContactUsTestData.getProperty("Expected_label_for_attach_file");
	        logger.debug("Expected label for comparison: " + expected_label);

	        // Perform the assertion to verify the label matches
	        assertEquals(actual_label_for_attach_file, expected_label);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The label for the attach file field is correct.");
	    } 
	    catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The label of attached file is incorrect.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	    catch (Exception e) {
	        // Log any exceptions that occur
	        logger.error("An unexpected error occurred during the test case.");
	        logger.error("Exception: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test has failed
	    }
	}

	
	/**
	 * Verifies selected file visibility in field.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Uploads a specified file.
	 * 3. Verifies the selected file name.
	 */
	@Test(priority = 15)
	public void TC015_verify_that_selected_file_should_be_display_in_field() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC015_verify_that_selected_file_should_be_display_in_field");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Define the file path
	        String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\All_Documents\\Think_Straight.pdf";
	        logger.info("File path for upload: " + filePath);

	        // Upload the file
	        logger.info("Uploading the file.");
	        contactPage.fileUpload(filePath);

	        // Verify the selected file is visible in the field
	        logger.info("Retrieving the name of the selected file.");
	        String selectedFileName = contactPage.verifing_selected_file_visible();

	        // Log the name of the selected file for debugging purposes
	        logger.debug("Selected file name: " + selectedFileName);

	        // Perform the assertion to verify the file name matches
	        logger.info("Comparing the selected file name with expected file name.");
	        assertEquals("Think_Straight.pdf", selectedFileName);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The selected file is displayed correctly.");
	    } 
	    catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The selected file doesn't display.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	    catch (Exception e) {
	        // Log any exceptions that occur
	        logger.error("An error occurred during the test case: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test has failed
	    }
	}

	
	/**
	 * Verifies the Message Box is displayed.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Checks if the Message Box is visible.
	 */
	@Test(priority = 16)
	public void TC016_verify_that_Message_Box_display() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC016_verify_that_Message_Box_display");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Log the action of verifying the message box visibility
	        logger.info("Verifying if the message box is visible.");

	        // Verify that the message box is displayed
	        contactPage.verifing_message_box_visible();

	        // Log the successful completion of the test
	        logger.info("Test case passed: The message box is displayed correctly.");
	    } 
	    catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The message box is not visible.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }
	    catch (Exception e) {
	        // Log any exceptions that occur
	        logger.error("An error occurred during the test case: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test has failed
	    }
	}

	
	/**
	 * Verifies the label of Message Box.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Retrieves and verifies the Message Box label.
	 */
	@Test(priority = 17)
	public void TC017_verify_the_label_for_message_box() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC017_verify_the_label_for_message_box");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Log the action of retrieving the label of the message box
	        logger.info("Retrieving the label of the message box.");
	        String actual_label_for_message_box = contactPage.verifing_label_for_message_box();

	        // Log the retrieved label for debugging purposes
	        logger.debug("Actual label retrieved: " + actual_label_for_message_box);

	        // Log the expected label for comparison
	        String expected_label = ContactUsTestData.getProperty("Expected_label_for_message_box");
	        logger.debug("Expected label for comparison: " + expected_label);

	        // Perform the assertion to verify the label matches
	        assertEquals(actual_label_for_message_box, expected_label);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The label for the message box is correct.");
	    } 
	    catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The elabel  of message box is incorrect.");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }catch (Exception e) {
	        // Log any exceptions that occur
	        logger.error("An error occurred during the test case: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test has failed
	    }
	}

	
	/**
	 * Verifies Send button functionality and error display.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Clicks the Send button.
	 * 3. Verifies error message for empty email field.
	 */
	@Test(priority = 18)
	public void TC018_verify_that_sendBtn_functionality_display_and_works_properly() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC019_verify_that_sendBtn_functionality_display_and_works_properly");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Click on the Send button
	        logger.info("Clicking on the Send button.");
	        contactPage.click_on_sendBtn();

	        // Log the action of retrieving the error message for the empty email field
	        logger.info("Retrieving the error message for the empty email field.");
	        String actual_error_message_for_email = contactPage.verifing_that_error_message_for_empty_email_field();

	        // Log the retrieved error message for debugging purposes
	        logger.debug("Actual error message retrieved: " + actual_error_message_for_email);

	        // Log the expected error message for comparison
	        String expected_error_message = ContactUsTestData.getProperty("Expected_error_message_for_empty_email");
	        logger.debug("Expected error message for comparison: " + expected_error_message);

	        // Perform the assertion to verify the error message matches
	        assertEquals(actual_error_message_for_email, expected_error_message);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The error message for the empty email field is correct.");
	    } 
	    catch (AssertionError e) {
	        // Log the failure and the exception message
	        logger.error("Test case failed: The send button doesn't display and works propelry..");
	        logger.error("AssertionError: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test failed
	    }catch (Exception e) {
	        // Log any exceptions that occur
	        logger.error("An error occurred during the test case: " + e.getMessage());
	        throw e; // Re-throw the exception to indicate the test has failed
	    }
	}

	
	/**
	 * Verifies all error messages display properly.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Tests empty email field error.
	 * 3. Tests invalid email error.
	 * 4. Tests textarea error.
	 * 5. Tests dropdown error.
	 */
	@Test(priority = 19)
	public void TC020_verify_that_all_error_message_display_properly() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC020_verify_that_all_error_message_display_properly");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Click on the Send button with an empty email field
	        logger.info("Clicking on the Send button with an empty email field.");
	        contactPage.click_on_sendBtn();
	        String actual_error_message_for_empty_email = contactPage.verifing_that_error_message_for_empty_email_field();
	        String expected_error_message_for_empty_email = ContactUsTestData.getProperty("Expected_error_message_for_empty_email");
	        logger.debug("Actual error message for empty email: " + actual_error_message_for_empty_email);
	        logger.debug("Expected error message for empty email: " + expected_error_message_for_empty_email);
	        assertEquals(actual_error_message_for_empty_email, expected_error_message_for_empty_email);

	        // Enter an invalid email and click on the Send button
	        String invalidEmail = com.myshop.utilities.RandomEmails.invalidEmail_generate();
	        logger.info("Entering an invalid email: " + invalidEmail);
	        contactPage.enterEmail(invalidEmail);
	        contactPage.click_on_sendBtn();
	        String actual_error_message_for_invalid_email = contactPage.verifing_that_error_message_for_empty_email_field();
	        String expected_error_message_for_invalid_email = ContactUsTestData.getProperty("Expected_error_message_for_invalid_email");
	        logger.debug("Actual error message for invalid email: " + actual_error_message_for_invalid_email);
	        logger.debug("Expected error message for invalid email: " + expected_error_message_for_invalid_email);
	        assertEquals(actual_error_message_for_invalid_email, expected_error_message_for_invalid_email);

	        // Enter a valid email and click on the Send button
	        String validEmail = com.myshop.utilities.RandomEmails.validEmail_generate();
	        logger.info("Entering a valid email: " + validEmail);
	        contactPage.enterEmail(validEmail);
	        contactPage.click_on_sendBtn();
	        String actual_error_message_for_textarea = contactPage.verifing_that_error_message_for_textarea();
	        String expected_error_message_for_textarea = ContactUsTestData.getProperty("Expected_error_message_for_textarea");
	        logger.debug("Actual error message for textarea: " + actual_error_message_for_textarea);
	        logger.debug("Expected error message for textarea: " + expected_error_message_for_textarea);
	        assertEquals(actual_error_message_for_textarea, expected_error_message_for_textarea);

	        // Enter details in the message box and click on the Send button
	        String messageDetails = com.myshop.utilities.RandomAlphabetic.randomStringForMessage();
	        logger.info("Entering message details: " + messageDetails);
	        contactPage.entering_detail(messageDetails);
	        contactPage.click_on_sendBtn();
	        String actual_error_message_for_dropdown = contactPage.verifing_that_error_message_for_textarea();
	        String expected_error_message_for_dropdown = ContactUsTestData.getProperty("Expected_error_message_for_dropdown");
	        logger.debug("Actual error message for dropdown: " + actual_error_message_for_dropdown);
	        logger.debug("Expected error message for dropdown: " + expected_error_message_for_dropdown);
	        assertEquals(actual_error_message_for_dropdown, expected_error_message_for_dropdown);

	        // Log the successful completion of the test
	        logger.info("Test case passed: All error messages are displayed properly.");

	    } catch (AssertionError ae) {
	        // Log assertion errors
	        logger.error("AssertionError occurred: " + ae.getMessage());
	        throw ae; // Re-throw assertion errors to indicate test failure

	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An error occurred during the test case: " + e.getMessage(), e);
	        throw e; // Re-throw general exceptions to indicate test failure
	    }
	}

	
	/**
	 * Verifies successful contact form submission.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Tests empty email field error.
	 * 3. Tests invalid email error.
	 * 4. Tests textarea error.
	 * 5. Tests dropdown error.
	 * 6. Submits form and verifies success.
	 */
	@Test(priority = 20)
	public void TC020_verify_that_user_can_submit_contact_form_successfully() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC021_verify_that_user_can_submit_contact_form_successfully");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Click on the Send button with an empty email field
	        logger.info("Clicking on the Send button with an empty email field.");
	        contactPage.click_on_sendBtn();
	        String actual_error_message_for_empty_email = contactPage.verifing_that_error_message_for_empty_email_field();
	        String expected_error_message_for_empty_email = ContactUsTestData.getProperty("Expected_error_message_for_empty_email");
	        logger.debug("Actual error message for empty email: " + actual_error_message_for_empty_email);
	        logger.debug("Expected error message for empty email: " + expected_error_message_for_empty_email);
	        assertEquals(actual_error_message_for_empty_email, expected_error_message_for_empty_email);

	        // Enter an invalid email and click on the Send button
	        String invalidEmail = com.myshop.utilities.RandomEmails.invalidEmail_generate();
	        logger.info("Entering an invalid email: " + invalidEmail);
	        contactPage.enterEmail(invalidEmail);
	        contactPage.click_on_sendBtn();
	        String actual_error_message_for_invalid_email = contactPage.verifing_that_error_message_for_empty_email_field();
	        String expected_error_message_for_invalid_email = ContactUsTestData.getProperty("Expected_error_message_for_invalid_email");
	        logger.debug("Actual error message for invalid email: " + actual_error_message_for_invalid_email);
	        logger.debug("Expected error message for invalid email: " + expected_error_message_for_invalid_email);
	        assertEquals(actual_error_message_for_invalid_email, expected_error_message_for_invalid_email);

	        // Enter a valid email and click on the Send button
	        String validEmail = com.myshop.utilities.RandomEmails.validEmail_generate();
	        logger.info("Entering a valid email: " + validEmail);
	        contactPage.enterEmail(validEmail);
	        contactPage.click_on_sendBtn();
	        String actual_error_message_for_textarea = contactPage.verifing_that_error_message_for_textarea();
	        String expected_error_message_for_textarea = ContactUsTestData.getProperty("Expected_error_message_for_textarea");
	        logger.debug("Actual error message for textarea: " + actual_error_message_for_textarea);
	        logger.debug("Expected error message for textarea: " + expected_error_message_for_textarea);
	        assertEquals(actual_error_message_for_textarea, expected_error_message_for_textarea);

	        // Enter details in the message box and click on the Send button
	        String messageDetails = com.myshop.utilities.RandomAlphabetic.randomStringForMessage();
	        logger.info("Entering message details: " + messageDetails);
	        contactPage.entering_detail(messageDetails);
	        contactPage.click_on_sendBtn();
	        String actual_error_message_for_dropdown = contactPage.verifing_that_error_message_for_textarea();
	        String expected_error_message_for_dropdown = ContactUsTestData.getProperty("Expected_error_message_for_dropdown");
	        logger.debug("Actual error message for dropdown: " + actual_error_message_for_dropdown);
	        logger.debug("Expected error message for dropdown: " + expected_error_message_for_dropdown);
	        assertEquals(actual_error_message_for_dropdown, expected_error_message_for_dropdown);

	        // Select an option from the dropdown and click on the Send button
	        String optionToSelect = ContactUsTestData.getProperty("Expected_Option_2");
	        logger.info("Selecting option from dropdown: " + optionToSelect);
	        contactPage.selecting_option_from_dropdown(optionToSelect);
	        contactPage.click_on_sendBtn();

	        // Verify the successful submission message
	        String actual_successful_message = contactPage.verifing_that_successfull_message();
	        String expected_successful_message =ContactUsTestData.getProperty("Expected_successful_message");
	        logger.debug("Actual successful message: " + actual_successful_message);
	        logger.debug("Expected successful message: " + expected_successful_message);
	        assertEquals(actual_successful_message, expected_successful_message);

	        // Log the successful completion of the test
	        logger.info("Test case passed: User can submit the contact form successfully.");

	    } catch (AssertionError ae) {
	        // Log assertion errors
	        logger.error("AssertionError occurred: " + ae.getMessage());
	        throw ae; // Re-throw assertion errors to indicate test failure

	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An error occurred during the test case: " + e.getMessage(), e);
	        throw e; // Re-throw general exceptions to indicate test failure
	    }
	}

	/**
	 * Steps to verify home button display:
	 * 1. Click contact button.
	 * 2. Enter valid email.
	 * 3. Enter message details.
	 * 4. Select dropdown option.
	 * 5. Click send button.
	 * 6. Verify home button is visible.
	 */
	@Test(priority = 21)
	public void TC021_verify_that_after_submit_contact_form_home_button_should_display() {
		 try {
		        // Log the start of the test case
		        logger.info("Starting test case: TC022_verify_that_after_submit_contact_form_home_button_should_display");

		        // Step 1: Click on the contact button
		        logger.info("Clicking on the contact button.");
		        indexPage.click_On_ContactBtn();
		        
		        // Step 2: Enter a valid email
		        String validEmail = com.myshop.utilities.RandomEmails.validEmail_generate();
		        logger.info("Entering email: " + validEmail);
		        contactPage.enterEmail(validEmail);
		        
		        // Step 3: Enter message details
		        String messageDetails = com.myshop.utilities.RandomAlphabetic.randomStringForMessage();
		        logger.info("Entering message details: " + messageDetails);
		        contactPage.entering_detail(messageDetails);
		        
		        // Step 4: Select an option from the dropdown
		        String dropdownOption = ContactUsTestData.getProperty("Expected_Option_2");
		        logger.info("Selecting option from dropdown: " + dropdownOption);
		        contactPage.selecting_option_from_dropdown(dropdownOption);
		        
		        // Step 5: Click on the send button
		        logger.info("Clicking on the send button.");
		        contactPage.click_on_sendBtn();
		        
		        // Step 6: Verify that the home button is displayed
		        logger.info("Verifying that the home button is displayed after form submission.");
		        contactPage.verifing_after_submit_HomeBtn_display();
		        
		        // Log the successful completion of the test
		        logger.info("Test case passed: Home button is displayed after form submission.");

		    } catch (AssertionError e) {
		        // Log assertion errors
		        logger.error("Assertion error occurred: " + e.getMessage());
		        throw e; // Re-throw the exception to fail the test
		    } catch (Exception e) {
		        // Log any other exceptions
		        logger.error("Exception occurred: " + e.getMessage());
		        throw e; // Re-throw the exception to fail the test
		    }
	}
	
	/**
	 * Verifies Home button display after form submission.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Enters a valid email.
	 * 3. Fills in the message details.
	 * 4. Selects an option from dropdown.
	 * 5. Submits the form and checks Home button.
	 */
	@Test(priority = 22)
	public void TC022_verify_that_home_text_is_proper() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC023_verify_that_home_text_is_proper");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Log email entry
	        String validEmail = com.myshop.utilities.RandomEmails.validEmail_generate();
	        logger.info("Entering a valid email: " + validEmail);
	        contactPage.enterEmail(validEmail);

	        // Log details entry
	        String messageDetails = com.myshop.utilities.RandomAlphabetic.randomStringForMessage();
	        logger.info("Entering message details: " + messageDetails);
	        contactPage.entering_detail(messageDetails);

	        // Log dropdown selection
	        String optionToSelect = ContactUsTestData.getProperty("Expected_Option_2");
	        logger.info("Selecting option from dropdown: " + optionToSelect);
	        contactPage.selecting_option_from_dropdown(optionToSelect);

	        // Click on the Send button
	        logger.info("Clicking on the Send button.");
	        contactPage.click_on_sendBtn();

	        // Verify the text of the Home button
	        String actual_text_of_homeBtn = contactPage.verifing_the_text_of_homeBtn_on_contact_page();
	        String expected_text_of_homeBtn = ContactUsTestData.getProperty("Expected_text_of_homeBtn");
	        logger.debug("Actual text of Home button: " + actual_text_of_homeBtn);
	        logger.debug("Expected text of Home button: " + expected_text_of_homeBtn);
	        assertEquals(actual_text_of_homeBtn, expected_text_of_homeBtn);

	        // Log the successful completion of the test
	        logger.info("Test case passed: The Home button text is correct.");

	    } catch (AssertionError ae) {
	        // Log assertion errors
	        logger.error("AssertionError occurred: " + ae.getMessage());
	        throw ae; // Re-throw assertion errors to indicate test failure

	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An error occurred during the test case: " + e.getMessage(), e);
	        throw e; // Re-throw general exceptions to indicate test failure
	    }
	}

	
	/**
	 * Verifies Home button navigation functionality.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Enters a valid email.
	 * 3. Fills in the message details.
	 * 4. Selects an option from dropdown.
	 * 5. Submits the form.
	 * 6. Clicks Home button and verifies navigation.
	 */
	@Test(priority = 23)
	public void TC023_verify_that_homeBtn_functionality_works_properly_and_navigate_to_homePage() {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: TC024_verify_that_homeBtn_functionality_works_properly_and_navigate_to_homePage");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Enter a valid email
	        String validEmail = com.myshop.utilities.RandomEmails.validEmail_generate();
	        logger.info("Entering a valid email: " + validEmail);
	        contactPage.enterEmail(validEmail);

	        // Enter message details
	        String messageDetails = com.myshop.utilities.RandomAlphabetic.randomStringForMessage();
	        logger.info("Entering message details: " + messageDetails);
	        contactPage.entering_detail(messageDetails);

	        // Select option from dropdown
	        String optionToSelect = ContactUsTestData.getProperty("Expected_Option_2");
	        logger.info("Selecting option from dropdown: " + optionToSelect);
	        contactPage.selecting_option_from_dropdown(optionToSelect);

	        // Click on the Send button
	        logger.info("Clicking on the Send button.");
	        contactPage.click_on_sendBtn();

	        // Click on the Home button after contact form submission
	        logger.info("Clicking on the Home button after form submission.");
	        contactPage.after_contact_submit_click_on_homeBtn();

	        // Verify that the user is navigated to the home page
	        String actual_url = driver.getCurrentUrl();
	        String expected_url = Config.getProperty("StagingUrl");
	        logger.debug("Actual URL after clicking Home button: " + actual_url);
	        logger.debug("Expected URL: " + expected_url);
	        assertEquals(actual_url, expected_url);

	        // Log the successful completion of the test
	        logger.info("Test case passed: Home button functionality is working properly and navigates to the home page.");

	    } catch (AssertionError ae) {
	        // Log assertion errors
	        logger.error("AssertionError occurred: " + ae.getMessage());
	        throw ae; // Re-throw assertion errors to indicate test failure

	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An error occurred during the test case: " + e.getMessage(), e);
	        throw e; // Re-throw general exceptions to indicate test failure
	    }
	}

	
	/**
	 * Verifies email receipt after form submission.
	 * 
	 * Steps:
	 * 1. Clicks on the Contact button.
	 * 2. Enters a valid email address.
	 * 3. Fills in message details.
	 * 4. Selects an option from drop down.
	 * 5. Clicks Send button and verifies success.
	 * 6. Navigates to yopmail.com.
	 * 7. Checks for received email.
	 * 8. Verifies email title.
	 */
	@Test(priority = 24)
	public void TC024_verify_that_after_submiting_the_all_detail_should_be_sent_to_entered_email() throws InterruptedException {
	    try {
	        // Log the start of the test case
	        logger.info("Starting test case: verify_that_after_submiting_the_all_detail_should_be_sent_to_entered_email");

	        // Click on the Contact button
	        logger.info("Clicking on the Contact button.");
	        indexPage.click_On_ContactBtn();

	        // Generate and enter a valid email
	        String validEmail = com.myshop.utilities.RandomEmails.validEmail_generate();
	        logger.info("Generated and entering email: " + validEmail);
	        contactPage.enterEmail(validEmail);

	        // Enter message details
	        String messageDetails = com.myshop.utilities.RandomAlphabetic.randomStringForMessage();
	        logger.info("Entering message details: " + messageDetails);
	        contactPage.entering_detail(messageDetails);

	        // Select option from dropdown
	        String optionToSelect = ContactUsTestData.getProperty("Expected_Option_2");
	        logger.info("Selecting option from dropdown: " + optionToSelect);
	        WebElement dd = driver.findElement(By.xpath("//select[@id='id_contact']"));
	        Select ddd = new Select(dd);
	        ddd.selectByVisibleText(optionToSelect);

	        // Click on the Send button
	        logger.info("Clicking on the Send button.");
	        contactPage.click_on_sendBtn();

	        // Verify the success message
	        String actual_successful_message = contactPage.verifing_that_successfull_message();
	        logger.debug("Actual successful message: " + actual_successful_message);
	        String expected_successful_message = ContactUsTestData.getProperty("Expected_successful_message");
	        logger.debug("Expected successful message: " + expected_successful_message);
	        assertEquals(actual_successful_message, expected_successful_message);

	        // Navigate to yopmail.com
	        logger.info("Navigating to Yopmail.com.");
	        driver.navigate().to("https://yopmail.com/");

	        // Enter email in Yopmail
	        logger.info("Entering email in Yopmail: " + validEmail);
	        yopmailPage.enter_email_yopmail(validEmail);

	        // Click on the arrow button
	        logger.info("Clicking on the arrow button to check the email.");
	        yopmailPage.click_on_arrow();
	        Thread.sleep(10000); // Wait for the email to arrive

	        // Switch to iframe to access email content
	        logger.info("Switching to iframe to access email content.");
	        yopmailPage.switch_to_iframe();

	        // Verify the email title
	        String actual_title_in_yopmail = yopmailPage.verifing_the_title_in_yopmail();
	        logger.debug("Actual email title in Yopmail: " + actual_title_in_yopmail);
	        String expected_heading = YopmailTestData.getProperty("Expected_heading");
	        logger.debug("Expected email title: " + expected_heading);
	        
	        int index = actual_title_in_yopmail.indexOf("sent");
	        if (index != -1) {
	            // Adding 4 to include the length of the word "sent" in the substring
	            actual_title_in_yopmail = actual_title_in_yopmail.substring(0, index + 4);
	        }
	        assertEquals(actual_title_in_yopmail, expected_heading);

	        // Log the successful completion of the test
	        logger.info("Test case passed: Email was sent and received successfully.");

	    } catch (AssertionError ae) {
	        // Log assertion errors
	        logger.error("AssertionError occurred: " + ae.getMessage());
	        throw ae; // Re-throw assertion errors to indicate test failure

	    } catch (Exception e) {
	        // Log any other exceptions
	        logger.error("An error occurred during the test case: " + e.getMessage(), e);
	        throw e; // Re-throw general exceptions to indicate test failure
	    }
	}


}
