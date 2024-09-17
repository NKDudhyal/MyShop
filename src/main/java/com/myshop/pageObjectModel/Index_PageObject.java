package com.myshop.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Index_PageObject {

	public WebDriver driver;
	public Actions action;
	
	public Index_PageObject(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//============= Contact Button ==========================
	//locators ------------------
	@FindBy(xpath = "//div[@id='contact-link']")
	private WebElement ContactBtn;
	
	//Actions -----------------
	public void click_On_ContactBtn() {
		ContactBtn.click();
	}
	
	//Verification ----------------
	public String verifing_text_of_ContactBtn() {
		try {
			return ContactBtn.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	
	//============= Signin Button ==========================
	//locators ------------------
	@FindBy(xpath = "//div[@class='header_user_info']/a")
	private WebElement SignInBtn;
	
	//Actions -----------------
	public void click_On_SignInBtn() {
		SignInBtn.click();
	}
	
	//Verification ----------------
	public String verifing_text_of_SignInBtn() {
		
		try {
			return SignInBtn.getText().trim();
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	public boolean verifing_SignInBtn_display() {
		return SignInBtn.isDisplayed();
	}
}
