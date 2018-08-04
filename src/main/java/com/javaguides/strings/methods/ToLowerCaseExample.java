package com.javaguides.strings.methods;

import java.util.Locale;

public class ToLowerCaseExample {
	public static void main(String[] args) {
		String str = "JAVAGUIDES";
		String subStr = str.toLowerCase();
		System.out.println(subStr);
		
		subStr = str.toLowerCase(Locale.ENGLISH);
		System.out.println(subStr);
	}
}
