package com.javaguides.strings.examples;

/**
 * Java Program to Count Number of Words in Given String
 * @author javaguides.net
 *
 */
public class CountNumberOfWordsInString {
	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}

	private static void method1() {
		final String str = "java developers guide";
		String[] strArray = str.split(" ");
		System.out.println("Number of words in a string = " + strArray.length);
	}

	private static void method2() {
		final String str = "java developers guide";
		int count = 0;
		for (String word : str.split(" ")) {
			count++;
		}
		System.out.println("Number of words in a string = " + count);
	}

	private static void method3() {
		final String str = "java developers guide";

		int count = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;

			}
		}
		System.out.println("Number of words in a string = " + count);
	}
}
