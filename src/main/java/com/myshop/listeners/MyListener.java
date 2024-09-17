package com.myshop.listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.myshop.Base.BaseClass;
import com.myshop.utilities.ExtentReporter;

public class MyListener implements ITestListener {

	public static WebDriver driver;
	//private ExtentReports report;

	public static void setDriverr(WebDriver driver) {
		MyListener.driver = driver;
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution of project test cases has started");
		String suiteName = context.getSuite().getName();
		BaseClass.extentListeners =ExtentReporter.generaterExtentReport(suiteName);
		//report = ExtentReporter.generaterExtentReport(suiteName);
	}

	@Override
	public void onTestStart(ITestResult result) {
		String testName = result.getName();
		// test = ExtentReporter.createTest(testName);
		BaseClass.extentTest = BaseClass.extentListeners.createTest(testName);
		String browserName = result.getTestContext().getCurrentXmlTest().getParameter("brName");
		BaseClass.extentTest.log(Status.INFO, "Executed on ==== " + browserName + " Browser");
		BaseClass.extentTest.log(Status.INFO, "Started ==== " + testName + " ==== Started");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getName();
		if (BaseClass.driver != null) {
			// Take a screenshot on test failure
			File srcScreenShot = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.FILE);
			String destinationScreenShotPath = System.getProperty("user.dir") + "\\ScreenShots\\" + testName + ".png";
			try {
				// Save the screenshot to the specified location
				FileHandler.copy(srcScreenShot, new File(destinationScreenShotPath));
				BaseClass.extentTest.fail(result.getThrowable(),
						MediaEntityBuilder.createScreenCaptureFromPath(destinationScreenShotPath).build());
			} catch (IOException e) {
				e.printStackTrace();
			}
			BaseClass.extentTest.fail("ScreenShot Taken ==== " + testName + " ==== ScreenShot Taken ===== Failed");
			System.out.println("ScreenShot Taken ==== " + testName + " ==== ScreenShot Taken ==== Failed");
		} else {
			System.out.println("Driver is null, screenshot cannot be taken");
		}
		System.out.println();
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + " = TestCase Succeed");
		BaseClass.extentTest.pass("Pass ==== " + testName + " ==== Pass");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + " = Skipped");
		BaseClass.extentTest.skip(result.getThrowable());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All the test executing has finished");
		BaseClass.extentListeners.flush();
	}

}
