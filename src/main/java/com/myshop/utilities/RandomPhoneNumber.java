package com.myshop.utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomPhoneNumber {

	public static String phoneNumber() {
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}
	public static void main(String[] args) {
		phoneNumber();
	}
}
