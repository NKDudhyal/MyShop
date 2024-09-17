package com.myshop.utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomPassword {

	public static String valid_randomPwd() {
		String for_String = RandomStringUtils.randomAlphabetic(4);
		String for_number = RandomStringUtils.randomNumeric(6);
		return (for_String + for_number+"@");
	}
	
	public static String invalid_randomPwd() {
		String for_String = RandomStringUtils.randomAlphabetic(2);
		String for_number = RandomStringUtils.randomNumeric(2);
		return (for_String + for_number+"@");
	}
	
	public static void main(String[] args) {
		valid_randomPwd();
		invalid_randomPwd();
	}
}
