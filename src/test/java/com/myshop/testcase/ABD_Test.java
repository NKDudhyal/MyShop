package com.myshop.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ABD_Test {

	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://sofiyadminportal-dot-sofiya-dev.ue.r.appspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mahendar@Stemi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Stemi@1234$");
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='All']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Completed']")).click();
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]"))
				.click();
		driver.findElement(By.xpath("//div[@class='MuiAccordionSummary-content css-1n11r91']//p[@id='header-summary']"))
				.click();
		driver.findElement(By.xpath("//li[normalize-space()='Completed']")).click();

		driver.findElement(By.xpath("(//button[@type='button'])[23]")).click();
		
		//Edit section
		String current_Text_In_Patient_Response = driver.findElement(By.xpath("//textarea[@name='editedText']")).getText();
		String current_Text_In_Comments = driver.findElement(By.xpath("//textarea[@name='comment']")).getText();
		
		//click on history
		//History Section
		String current_Text_In_Patient_Response_history = driver.findElement(By.xpath("//div[@role='tooltip']//div//div//div[2]//div//ul//li[1]//div[3]//span")).getText();
		String current_Text_In_Comments_history = driver.findElement(By.xpath("//div[@role='tooltip']//div//div//div[2]//div//ul//li[1]//div[3]/p")).getText();
		
//		if(current_Text_In_Patient_Response.equals(current_Text_In_Patient_Response_history) && current_Text_In_Comments.equals(current_Text_In_Comments_history)) {
//			driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
//			String actualmessageforduplicate = driver.findElement(By.xpath("//div[text()='No changes in Response or Comment to save']")).getText();
//			String expectedmessageforduplicate = "No changes in Response or Comment to save";
//			if(actualmessageforduplicate.equals(expectedmessageforduplicate)) {
//				Assert.assertTrue(true);
//				drier.cancel;
//			} else {
//				System.out.println("Messgae not visible");
//			}
//			
//		} else {
//			update messge
//		}
		
		
		
		
		
		

	}
}
