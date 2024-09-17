package com.myshop.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yopmail_PageObject {

	public WebDriver driver;
	
	public Yopmail_PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	//======================= Email field =======================
	//Locators ----------------
	@FindBy(xpath = "//input[@id='login']")
	private WebElement email_field;
	@FindBy(xpath = "//div[@id='refreshbut']")
	private WebElement click_On_Arrow;
	@FindBy(xpath = "//button[@id='refresh']")
	private WebElement refresh;
	
	//Action ----------------
	public void enter_email_yopmail(String yopmail) {
		email_field.clear();
		email_field.sendKeys(yopmail);
	}
	public void click_on_arrow() {
		click_On_Arrow.click();
	}
	public void click_on_refresh() {
		refresh.click();
	}

	
	
	
	//========================== iFrame ================================
	//Locators -------------------
	@FindBy(xpath = "//iframe[@id='ifmail']")
	private WebElement iFrame;
	@FindBy(xpath = "/html/body/header/div[3]/div[1]")
	private WebElement mail_title;
	
	//Action ---------------
	public void switch_to_iframe() {
		driver.switchTo().frame(iFrame);
	}
	
	//Verification --------------
	public String verifing_the_title_in_yopmail() {
		return mail_title.getText();
	}
	
	
}
