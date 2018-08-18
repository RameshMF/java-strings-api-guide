package com.javaguides.strings.examples;

public class StringPalindromeProgram {

	private static boolean isEmpty(final String cs) {
		return cs == null || cs.length() == 0;
	}

	public static boolean checkPalindrome(String input) {

		// Check error conditions
		if (isEmpty(input)) {
			return false;
		}
		String reverse = "";
		int length = input.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}

		if (input.equals(reverse)) {
			System.out.println(input + " is palindrome = " + true);
		} else {
			System.out.println(input + " is palindrome = " + false);
		}
		return false;
	}

	private static void checkPalindromeString(String input) {
		boolean result = true;
		int length = input.length();
		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				result = false;
				break;
			}
		}
		System.out.println(input + " is palindrome = " + result);

	}

	private static boolean isPalindrome(String str) {
		if (str == null)
			return false;
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
	}

	public static void main(String[] args) {
		checkPalindrome("madam");
		checkPalindrome("abcba");
		checkPalindrome("abc");

		checkPalindromeString("madam");
		checkPalindromeString("abcba");
		checkPalindromeString("abc");
		
		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("abcba"));
		System.out.println(isPalindrome("abcba"));
		
	}
}
