package com.myshop.utilities;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class RandomEmails {

	public static String validEmail_generate() {
		// Get the current date and time
		Date date = new Date(0);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateTimeString = dateFormat.format(date);

		// Generate a random number
		Random random = new Random();
		int randomNumber = random.nextInt(1000); // Generate a random number between 0 and 999

		// Construct the email address
		String email = "user" + dateTimeString + randomNumber + "@yopmail.com";
		return email;
	}

	public static String invalidEmail_generate() {
		// Get the current date and time
		Date date = new Date(0);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateTimeString = dateFormat.format(date);

		// Generate a random number
		Random random = new Random();
		int randomNumber = random.nextInt(1000); // Generate a random number between 0 and 999

		// Construct the email address
		String email = "user" + dateTimeString + randomNumber + "yopmail.com";
		return email;
	}

	public static void main(String[] args) {
		validEmail_generate();
		invalidEmail_generate();
	}
}
