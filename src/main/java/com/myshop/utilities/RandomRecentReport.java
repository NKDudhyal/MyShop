package com.myshop.utilities;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RandomRecentReport {

	public static String recentExtentReport() {
//		// Get the current date and time
//		LocalDateTime now = LocalDateTime.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
//
//		// Format the date and time
//		String formattedDateTime = now.format(formatter);
//		
//		// Replace spaces with underscores
//		formattedDateTime = formattedDateTime.replace(" ", "_").replace("-", "_").replace(":", "_");
//		
//		// Print the modified date and time
//		System.out.println("Current Date and Time with Underscores: " + formattedDateTime);
//		
//		// Construct the email address
//		String email = "Date & Time " + formattedDateTime;
		// Get the current time
		LocalTime currentTime = LocalTime.now();
		String updatecurrentTime = currentTime.toString().replace(":", "_");
		return updatecurrentTime;
		// Display the current time
		// return email;

	}

	public static void main(String[] args) {
		recentExtentReport();
	}

}
