package com.javaguides.strings.examples;

/**
 * 
 * Java program to count number of occurrence of substring in given string.
 * @author javaguides.net
 * 
 */
public class CountOccuranceOfSubString {

	public static void main(String[] args) {
		int count = countOccurrencesOf("javadevelopersguides","java");
		System.out.println("Count number of occurrences of substring 'java' "
				+ " in string 'javadevelopersguides' : " + count );
		int count1 = countOccurrencesOf("javajavaguides","java");
		System.out.println("Count number of occurrences of substring 'java'"
				+ "  in string 'javajavaguides' : " + count1 );
	}
	
	public static boolean hasLength( String str) {
		return (str != null && !str.isEmpty());
	}
	
	/**
	 * Count the occurrences of the substring {@code sub} in string {@code str}.
	 * @param str string to search in
	 * @param sub string to search for
	 */
	public static int countOccurrencesOf(String str, String sub) {
		if (!hasLength(str) || !hasLength(sub)) {
			return 0;
		}

		int count = 0;
		int pos = 0;
		int idx;
		while ((idx = str.indexOf(sub, pos)) != -1) {
			++count;
			pos = idx + sub.length();
		}
		return count;
	}
}
