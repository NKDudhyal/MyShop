package com.myshop.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
	
	public static ExtentReports report;
	public static ExtentReports generaterExtentReport(String suiteName) {
		if (report == null) {
			report = new ExtentReports();
			File extentReportFile = new File(System.getProperty("user.dir")+"\\reports\\"+suiteName+"_"+com.myshop.utilities.RandomRecentReport.recentExtentReport()+".html");
			ExtentSparkReporter sparkReport = new ExtentSparkReporter(extentReportFile);
			
			sparkReport.config().setTheme(Theme.DARK);
			sparkReport.config().setReportName(suiteName + "- Report");
			sparkReport.config().setDocumentTitle(suiteName);
			sparkReport.config().setTimeStampFormat("dd/MM/YYYY hh:mm:ss");

			report.attachReporter(sparkReport);
			Properties Config = new Properties();
			File ConfigPath = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Config.properties");
			try {
				FileInputStream ConfigFile = new FileInputStream(ConfigPath);
				Config.load(ConfigFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
			report.setSystemInfo("Application URL", Config.getProperty("StagingUrl"));
		}
		return report;
	}
	
	public static ExtentTest createTest(String testName) {
		return report.createTest(testName);
	}
	
}
