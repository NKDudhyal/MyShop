package com.myshop.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation_PageObject {

	public WebDriver driver;

	public AccountCreation_PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// =================== Headings ====================
	// Locators -----
	@FindBy(xpath = "//div[@id='noSlide']//h1")
	private WebElement page_heading_for_accountCreation;

	@FindBy(xpath = "")
	private WebElement sub_heading_for_accountCreation;

	// Verification --------
	public String verifing_page_heading_for_accountCreation_page() {
		try {
			return page_heading_for_accountCreation.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// ================ Radio buttons =====================
	// Locators -----------
	@FindBy(xpath = "//label[@for='id_gender1']")
	private WebElement mr_radiobtn;

	// Actions ----------
	public void click_on_mr_radioBtn() {
		mr_radiobtn.click();
	}

	// Verification --------
	public String verifing_the_text_for_mr_radioBtn() {
		try {
			return mr_radiobtn.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public boolean verifing_mr_radioBtn_is_display() {
		return mr_radiobtn.isDisplayed();
	}

	@FindBy(xpath = "//label[@for='id_gender2']")
	private WebElement mrs_radiobtn;

	// Actions ----------
	public void click_on_mrs_radioBtn() {
		mrs_radiobtn.click();
	}

	// Verification --------
	public String verifing_the_text_for_mrs_radioBtn() {
		try {
			return mrs_radiobtn.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public boolean verifing_mrs_radioBtn_is_display() {
		return mrs_radiobtn.isDisplayed();
	}

	// ==================== First Name Field ===================
	// Locators ---------
	@FindBy(xpath = "//label[@for='customer_firstname']")
	private WebElement label_for_firstName;

	@FindBy(xpath = "//input[@id='customer_firstname']")
	private WebElement firstName_field;

	// Actions ----------
	public void enter_credential_in_firstName_field(String firstName) {
		firstName_field.sendKeys(firstName);
	}

	// Verification --------
	public String verifing_the_label_for_firstName() {
		try {
			return label_for_firstName.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public boolean verifing_firstName_is_display() {
		return firstName_field.isDisplayed();
	}

	// ==================== Last Name Field ===================
	// Locators ---------
	@FindBy(xpath = "//label[@for='customer_lastname']")
	private WebElement label_for_lastName;

	@FindBy(xpath = "//input[@id='customer_lastname']")
	private WebElement lastName_field;

	// Actions ----------
	public void enter_credential_in_lastName_field(String lastName) {
		firstName_field.sendKeys(lastName);
	}

	// Verification --------
	public String verifing_the_label_for_lastName() {

		try {
			return label_for_lastName.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public boolean verifing_lastName_is_display() {
		return lastName_field.isDisplayed();
	}

	// ==================== Email Field ===================
	// Locators ---------
	@FindBy(xpath = "//label[@for='email']")
	private WebElement label_for_emailField;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email_field;

	// Actions ----------
	public void enter_credential_in_email_field(String email) {
		email_field.sendKeys(email);
	}

	// Verification -------
	public String verifing_the_label_for_email() {

		try {
			return label_for_emailField.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String verifing_entered_emailAddress_in_email_field() {

		try {
			return email_field.getAttribute("value");
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public boolean verifing_email_field_is_display() {
		return email_field.isDisplayed();
	}

	// ================ Password Field =================
	// Locators ----------
	@FindBy(xpath = "//label[@for='passwd']")
	private WebElement label_for_passwordField;

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password_field;

	@FindBy(xpath = "//span[@class='form_info']")
	private WebElement password_information;

	// Actions -----------
	public void enter_credential_in_password_field(String password) {
		password_field.sendKeys(password);
	}

	// Verification ----------
	public String verifing_the_label_for_password() {
		try {
			return label_for_passwordField.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public boolean verifing_password_field_is_display() {
		return password_field.isDisplayed();
	}

	public String verifing_the_text_of_passward_information() {
		try {
			return password_information.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// ===================== DOB ======================
	// Locators ------------
	@FindBy(xpath = "//div[@class='form-group']//label")
	private WebElement label_of_DOB;

	@FindBy(xpath = "//select[@id='days']")
	private WebElement select_days;

	@FindBy(xpath = "//select[@id='months']")
	private WebElement select_months;

	@FindBy(xpath = "//select[@id='years']")
	private WebElement select_years;

	// Action ------------
	public void selecting_days(String date) {
		Select date_select = new Select(select_days);
		date_select.selectByVisibleText(date);
	}

	public void selecting_months(String month) {
		Select month_select = new Select(select_months);
		month_select.selectByVisibleText(month);
	}

	public void selecting_years(String year) {
		Select year_select = new Select(select_days);
		year_select.selectByVisibleText(year);
	}

	// Verification ------------
	public String verifing_the_label_of_DOB() {
		try {
			return label_of_DOB.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// ===================== Newsletter Check box ======================
	// Locators ---------------
	@FindBy(xpath = "//input[@id='newsletter']")
	private WebElement checkbox_for_newsletter;

	@FindBy(xpath = "//label[@for='newsletter']")
	private WebElement label_for_newsletter;

	// Actions -------------
	public void click_on_newsletter_check_box() {
		checkbox_for_newsletter.click();
	}

	// Verification ------------
	public void verifing_check_box_is_displayed() {
		checkbox_for_newsletter.isDisplayed();
	}

	public String verifing_the_label_for_newsletter() {

		try {
			return label_for_newsletter.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// =================== Register ================
	// Locators -----------
	@FindBy(xpath = "//button[@id='submitAccount']")
	private WebElement register_btn;

	@FindBy(xpath = "//button[@id='submitAccount']//span")
	private WebElement text_for_RegisterBtn;

	// Actions ----------------
	public void click_on_registerBtn() {
		register_btn.click();
	}

	// Verification -------------
	public String verifing_text_of_regiter_Btn() {

		try {
			return text_for_RegisterBtn.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
