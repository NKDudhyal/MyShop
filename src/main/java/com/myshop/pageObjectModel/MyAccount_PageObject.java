package com.myshop.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount_PageObject {

	public WebDriver driver;

	public MyAccount_PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ====================== Left Side Headings =================
	// Locators -------
	@FindBy(xpath = "//div[@id='center_column']//h1")
	private WebElement left_side_pageheading;

	@FindBy(xpath = "//form[@id='create-account_form']//h3")
	private WebElement left_side_subHeading;

	@FindBy(xpath = "//form[@id='create-account_form']//div[@class='form_content clearfix']//p")
	private WebElement left_side_description;

	// Verification ----------------
	public String verifing_the_left_side_pageHeading_create_an_account() {
		
		try {
			return left_side_pageheading.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String verifing_the_left_side_subHeading_create_an_account() {
		
		try {
			return left_side_subHeading.getText().trim().toUpperCase();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String verifing_the_left_side_description() {
		
		try {
			return left_side_description.getText().trim();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// ============================= Left Side Email Field ==================
	// Locators ------------
	@FindBy(xpath = "//label[@for='email_create']")
	private WebElement left_side_email_field_label;

	@FindBy(xpath = "//input[@id='email_create']")
	private WebElement left_side_email_field;

	// Action ----------------
	public void letf_side_entering_email(String username) {
		left_side_email_field.sendKeys(username);
	}

	// Verification -------------
	public String verifing_the_left_side_label_email_field() {
		
		try {
			return left_side_email_field_label.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public boolean verifing_left_side_email_field_display_on_leftBox() {
		return left_side_email_field.isDisplayed();
		
	}

	// ================== Create an account button ================
	// Locators ------------
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	private WebElement Create_an_account;

	// Action
	public void click_on_create_acc() {
		Create_an_account.click();
	}

	// Verification ---------------
	public String verifing_the_left_side_text_of_Create_button() {
		
		try {
			return Create_an_account.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public boolean verifing_left_side_create_an_accont_button_is_display() {
		return Create_an_account.isDisplayed();
	}

	// =================== Left Side Error Messages =============================
	// Locators --------------
	@FindBy(xpath = "//div[@class='alert alert-danger']//ol//li")
	private WebElement left_side_error_message;

	// Verification ---------------
	public String verifing_Left_box_that_error_message_for_empty_email_field() {
		
		try {
			return left_side_error_message.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String verifing_Left_box_that_error_message_for_invalid_email() {
		
		try {
			return left_side_error_message.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// ====================== Right Side Headings =================
	// Locators -------
	@FindBy(xpath = "//form[@id='login_form']//h3")
	private WebElement right_side_subHeading;

	// Verification
	public String verifing_the_right_Side_subHeading_create_an_account() {
		
		try {
			return right_side_subHeading.getText().trim().toUpperCase();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// ==================== Right Side Email Field ==================
	// Locators -------
	@FindBy(xpath = "//label[@for='email']")
	private WebElement right_side_email_field_label;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement right_side_email_field;

	// Action
	public void right_side_entering_email(String username) {
		right_side_email_field.sendKeys(username);
	}

	// Verification
	public String verifing_right_side_email_field_label() {
		
		try {
			return right_side_email_field_label.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// ==================== Right Side password Field ==================
	// Locators -------
	@FindBy(xpath = "//label[@for='passwd']")
	private WebElement right_side_password_field_label;

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement right_side_password_field;

	// Action
	public void right_side_entering_password(String password) {
		right_side_password_field.sendKeys(password);
	}

	// Verification
	public String verifing_right_side_password_field_label() {
		
		try {
			return right_side_password_field_label.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// =============== Forgot your password ====================
	// Locators -------
	@FindBy(xpath = "//form[@id='login_form']//div//p[1]")
	private WebElement right_side_forgotBtn;

	// Action
	public void click_on_forgot_functionality() {
		right_side_forgotBtn.click();
	}

	// Verification
	public String verifing_the_right_side_text_of_forgot_btn() {
		
		try {
			return right_side_forgotBtn.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// =============== Sign in button ====================
	// Locators -------
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement right_side_signIn_btn;

	// Action
	public void click_on_signin_functionality() {
		right_side_signIn_btn.click();
	}

	// Verification
	public String verifing_the_right_side_text_of_siginn_btn() {
		
		try {
			return right_side_signIn_btn.getText().trim();
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}
