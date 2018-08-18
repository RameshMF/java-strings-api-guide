package com.javaguides.strings.convertions;

/**
 * Class to Convert Short To String Example
 * @author javaguides.net
 *
 */

public class ConvertShortToStringExample {
	public static void main(String[] args) {

		/*
		 * Method 1: using valueOf() method of String class.
		 */
		short s = 10;
		String shortStr = String.valueOf(s);
		System.out.println("Convert short to string using valueOf method ::" + shortStr);

		/*
		 * Method 2: using toString() method of Short class
		 */
		String shortStr1 = Short.toString(s);
		System.out.println("Convert short to string using Short.toString method ::" + shortStr1);
	}
}
