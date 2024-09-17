package com.myshop.Base;

//Import statements for necessary libraries and classes

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.myshop.pageObjectModel.Contact_PageObject;
import com.myshop.pageObjectModel.Index_PageObject;
import com.myshop.pageObjectModel.MyAccount_PageObject;
import com.myshop.pageObjectModel.Yopmail_PageObject;
import com.myshop.listeners.MyListener;

public class BaseClass {
	// Declare instance variables for WebDriver
	public static WebDriver driver;
	public Logger logger;
	
	
	public static ExtentReports extentListeners;
	public static ExtentTest extentTest;

	// Declare instance variables for different page objects
	public Index_PageObject indexPage;
	public Contact_PageObject contactPage;
	public Yopmail_PageObject yopmailPage;
	public MyAccount_PageObject myAccount;

	// Declare Properties objects to load configuration and test data files
	public Properties Config;
	public Properties ContactUsTestData;
	public Properties YopmailTestData;
	public Properties MyAccountTestData;
	public Properties AccountCreationTestData;

	// Method to load properties from different files
	public void loadProperties() {

		// Load configuration properties (e.g., URLs, browser settings)
		Config = new Properties();
		File ConfigPath = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Config.properties");
		try {
			FileInputStream ConfigFile = new FileInputStream(ConfigPath);
			Config.load(ConfigFile);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Load test data for "Contact Us" feature
		ContactUsTestData = new Properties();
		File ContactUsTestData_Path = new File(
				System.getProperty("user.dir") + "\\src\\test\\resources\\ContactUsTestData.properties");
		try {
			FileInputStream ContactUsTestData_File = new FileInputStream(ContactUsTestData_Path);
			ContactUsTestData.load(ContactUsTestData_File);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Load test data for yop mail feature
		YopmailTestData = new Properties();
		File YopmailTestData_Path = new File(
				System.getProperty("user.dir") + "\\src\\test\\resources\\YopmailTestData.properties");
		try {
			FileInputStream YopmailTestData_File = new FileInputStream(YopmailTestData_Path);
			YopmailTestData.load(YopmailTestData_File);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Load test data for My Account feature
		MyAccountTestData = new Properties();
		File MyAccountTestData_Path = new File(
				System.getProperty("user.dir") + "\\src\\test\\resources\\MyAccountTestData.properties");
		try {
			FileInputStream MyAccountTestData_File = new FileInputStream(MyAccountTestData_Path);
			MyAccountTestData.load(MyAccountTestData_File);
		} catch (Exception e) {
			e.printStackTrace();
		}

		AccountCreationTestData = new Properties();
		File AccountCreationTestData_Path = new File(
				System.getProperty("user.dir") + "\\src\\test\\resources\\AccountCreationTestData.properties");
		try {
			FileInputStream AccountCreationTestData_File = new FileInputStream(AccountCreationTestData_Path);
			MyAccountTestData.load(AccountCreationTestData_File);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setUp_for_single_TC() {
		loadProperties(); // Load configuration and test data properties
		logger = LogManager.getLogger(this.getClass());
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Set implicit wait for element finding
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // Set page load timeout
		driver.manage().window().maximize(); // Maximize the browser window
		driver.get(Config.getProperty("StagingUrl")); // Navigate to the staging URL from config properties
		// Initialize page objects for the test case
		indexPage = new Index_PageObject(driver);
		contactPage = new Contact_PageObject(driver);
		yopmailPage = new Yopmail_PageObject(driver);
		myAccount = new MyAccount_PageObject(driver);
	}

	public void xml(String brName) {
		loadProperties(); // Load configuration and test data properties
		logger = LogManager.getLogger(this.getClass());
		
		if (brName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (brName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (brName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println(" ======== Please mention the browser name in baseclass =========");
		}

		MyListener.setDriverr(driver);
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set implicit wait for element finding
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // Set page load timeout
		driver.manage().window().maximize();// Maximize the browser window
		driver.get(Config.getProperty("StagingUrl")); // Navigate to the staging URL from config properties

		// Initialize page objects for the test case
		indexPage = new Index_PageObject(driver);
		contactPage = new Contact_PageObject(driver);
		yopmailPage = new Yopmail_PageObject(driver);
		myAccount = new MyAccount_PageObject(driver);
	}

	/* ================================================= */
/*
	@BeforeMethod
	public void normal_setup() {
		setUp_for_single_TC();
	}

	@AfterMethod
	public void normal_tearDown() {
		driver.quit();
	}
*/
	
	
	@Parameters("brName")
	@BeforeMethod
	public void xml_setup(String brName) {
		xml(brName);
	}

	@AfterMethod
	public void xml_tearDown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit(); // Quit the WebDriver and close the browser }
	}
	
	
}