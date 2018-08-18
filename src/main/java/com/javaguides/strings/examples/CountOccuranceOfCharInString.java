package com.javaguides.strings.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java Program to Count the Occurrences of Each Character in String
 * @author javaguides.net
 */

public class CountOccuranceOfCharInString {

	public static void main(String[] args) {
		int count = countMatches("javaguides", 'a');
		System.out.println("using for loop : " + count);

		System.out.println("using java 8 streams and lambdas : " 
		                   + countOccurrencesOf("javaguides", 'a'));

		System.out.println("using regular expressions : " 
		                   + countCharsUsingReg("javaguides", 'a'));
	}

	/**
	 * <p>
	 * Counts how many times the char appears in the given string.
	 * </p>
	 *
	 * <p>
	 * A {@code null} or empty ("") String input returns {@code 0}.
	 * </p>
	 * 
	 * @param str
	 *            the CharSequence to check, may be null
	 * @param ch
	 *            the char to count
	 * @return the number of occurrences, 0 if the CharSequence is {@code null}
	 * @since 3.4
	 */
	private static int countMatches(final String str, final char ch) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		int count = 0;
		// We could also call str.toCharArray() for faster look ups but that
		// would generate more garbage.
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
		}
		return count;
	}

	// Using Java 8 Features
	/**
	 * Method to finding the number of occurrences of a character in a string
	 * using java 8 streams and lambdas.
	 * 
	 * @param str
	 * @param character
	 * @return
	 */
	private static long countOccurrencesOf(final String str, final char character) {
		return str.codePoints().filter(ch -> ch == character).count();
	}

	/**
	 * Method to finding the number of occurrences of a character in a string
	 * using regular expressions;
	 * 
	 * @param str
	 * @param character
	 * @return
	 */
	private static long countCharsUsingReg(final String str, final char character) {
		final Pattern pattern = Pattern.compile("[^" + character + "]*" + character + "");
		final Matcher matcher = pattern.matcher(str);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		return count;
	}
}
