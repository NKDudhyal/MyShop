package com.myshop.utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomAlphabetic {

	public static String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(8);
		System.out.println("Test" + generatedString);
		return generatedString;	
	}
	
	public static String randomStringForMessage() {
		String generatedString = RandomStringUtils.randomAlphabetic(100);
		System.out.println("Test" + generatedString);
		return generatedString;	
	}
	
	public static void main(String[] args) {
		randomString();
	}
}
