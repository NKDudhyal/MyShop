package com.myshop.utilities;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class RandomOrderNumberGenerate {

	public static String randomOrderNumberGenerate() {
		// Get the current date and time
		Date date = new Date(0);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateTimeString = dateFormat.format(date);

		// Generate a random number
		Random random = new Random();
		int randomNumber = random.nextInt(1000); // Generate a random number between 0 and 999

		// Construct the email address
		String email = dateTimeString + randomNumber;
		return email;
	}
	
	public static void main(String[] args) {
		randomOrderNumberGenerate();
	}
}
