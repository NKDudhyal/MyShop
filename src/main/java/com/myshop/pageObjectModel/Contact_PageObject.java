package com.myshop.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Contact_PageObject {

	public WebDriver driver;

	public Contact_PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// =============== Headings & sub heading =========================
	// Locators
	@FindBy(xpath = "//h1[@class='page-heading bottom-indent']")
	private WebElement heading_of_contactPage;
	@FindBy(xpath = "//h3[@class='page-subheading']")
	private WebElement subheading_of_contactPage;

	// Verification --------------
	public String verifing_page_heading_of_contactPage() {

		try {
			return heading_of_contactPage.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String verifing_sub_heading_of_contactPage() {

		try {
			return subheading_of_contactPage.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// ===================== DropDown ==============================
	// Locators
	@FindBy(xpath = "//select[@id='id_contact']")
	private WebElement dropdown;

	@FindBy(xpath = "//label[@for='id_contact']")
	private WebElement dropdown_Lable;

	@FindBy(xpath = "//div[@id='uniform-id_contact']//span")
	private WebElement after_select_Option_dropdown;

	@FindBy(xpath = "//p[@id='desc_contact2']")
	private WebElement sentence_appear_when_customerService_option_selected;

	@FindBy(xpath = "//p[@id='desc_contact1']")
	private WebElement sentence_appear_when_webmaster_option_selected;

	@FindBy(xpath = "//div[@id='uniform-id_contact']//span")
	private WebElement by_default_choose;

	// Actions -------------
	public void selecting_option_from_dropdown(String optionName) {
		Select sl = new Select(dropdown);
		sl.selectByVisibleText(optionName);
	}

	// Verifications ------------
	public String verifing_label_of_dropdown() {
		try {
			return (dropdown_Lable.getText());
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String verifing_selected_option_visible() {
		try {
			return after_select_Option_dropdown.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String verifing_sentance_on_option_customerServie() {

		try {
			return sentence_appear_when_customerService_option_selected.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String verifing_sentance_on_option_webMaster() {

		try {
			return sentence_appear_when_webmaster_option_selected.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String verifying_dropdown_by_default_value() {

		try {
			return by_default_choose.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// =================== Email Address =============================
	// Locators --------------
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email_field;

	@FindBy(xpath = "//label[@for='email']")
	private WebElement email_label;

	// Action --------------
	public void enterEmail(String email) {
		email_field.sendKeys(email);
	}

	// Verification ------------
	public String verifing_the_label_of_email_field() {

		try {
			return email_label.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public boolean verifing_emailfield_display() {
		return email_field.isDisplayed();
	}

	public String verifing_entered_email_should_be_display() {

		try {
			return email_field.getAttribute("value");
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// =================== Order reference =============================
	// Locators --------------
	@FindBy(xpath = "//label[normalize-space()='Order reference']")
	private WebElement order_reference_field_label;

	@FindBy(xpath = "//input[@id='id_order']")
	private WebElement order_reference_field;

	// Action --------------
	public void enter_order_reference_number(String orderNumber) {
		order_reference_field.sendKeys(orderNumber);
	}

	// Verification --------------
	public String verifing_the_labe_of_order_reference_field() {
		
		try {
			return order_reference_field_label.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public boolean verifing_order_field_display() {
		return order_reference_field.isDisplayed();
	}

	public String verifing_entered_orderNumber_should_be_display() {
		
		try {
			return order_reference_field.getAttribute("value");
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// =================== Attach File =============================
	// Locator --------------
	@FindBy(xpath = "//label[@for='fileUpload']")
	private WebElement attach_file_label;

	@FindBy(xpath = "//input[@id='fileUpload']")
	private WebElement attach_file;

	@FindBy(xpath = "//div//span[@class='filename']")
	private WebElement after_attached_file;

	// Action --------------
	public void fileUpload(String filePath) {
		attach_file.sendKeys(filePath);
	}

	// Verification --------------
	public String verifing_the_label_of_attach_file() {
		
		try {
			return attach_file_label.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String verifing_selected_file_visible() {
		
		try {
			return after_attached_file.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// =================== Message Box =============================
	// Locator --------------
	@FindBy(xpath = "//textarea[@id='message']")
	private WebElement message_box;

	@FindBy(xpath = "//label[@for='message']")
	private WebElement label_message_box;

	@FindBy(xpath = "//textarea[@id='message']")
	private WebElement get_entered_massage;
	
	// Action -------------
	public void entering_detail(String details) {
		message_box.sendKeys(details);
	}

	// Verification --------------
	public boolean verifing_message_box_visible() {
		return message_box.isDisplayed();
	}

	public String verifing_label_for_message_box() {
		
		try {
			return label_message_box.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public String verifing_the_enter_message_visible() {
		
		try {
			return get_entered_massage.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// =================== Send Functionality =============================
	// Locator --------------
	@FindBy(xpath = "//button[@id='submitMessage']//span")
	private WebElement sendBtn;

	// Action -------------
	public void click_on_sendBtn() {
		sendBtn.click();
	}

	// Verification --------------
	public String verifing_the_text_of_sendBtn() {
		
		try {
			return sendBtn.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// =================== Error Messages =============================
	// Locators --------------
	@FindBy(xpath = "//div[@class='alert alert-danger']//ol//li")
	private WebElement error_message;

	// Verification ---------------
	public String verifing_that_error_message_for_empty_email_field() {
		
		try {
			return error_message.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String verifing_that_error_message_for_invalid_email() {
		
		try {
			return error_message.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String verifing_that_error_message_for_textarea() {
		
		try {
			return error_message.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String verifing_that_error_message_for_Subject_dropdown() {
		
		try {
			return error_message.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// =========================== SuccessFull Message =========================
	// Locators --------------
	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement successfull_message;

	// Verification ---------------
	public String verifing_that_successfull_message() {
		
		try {
			return successfull_message.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	// ============================== Home btn ==================================
	// Locators --------------
	@FindBy(xpath = "//a[@href='http://www.automationpractice.pl/']//span")
	private WebElement homeBtn;

	// Action -----------------
	public void after_contact_submit_click_on_homeBtn() {
		homeBtn.click();
	}

	// Verification ---------------
	public String verifing_the_text_of_homeBtn_on_contact_page() {
		
		try {
			return homeBtn.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public boolean verifing_after_submit_HomeBtn_display() {
		return homeBtn.isDisplayed();
	}

}
