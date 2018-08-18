package com.javaguides.strings.convertions;

/**
 * Program to convert char to string
 * @author javaguides.net
 *
 */
public class ConvertCharacterToStringExample {
	public static void main(String[] args) {
		/* Method 1: using valueOf() method
	     * of String class.
	     */
		char c = 'a';
		String charStr = String.valueOf(c);
		System.out.println("Convert char to string using valueOf method ::" + charStr);
		
		
		/* Method 2: using toString() method 
	     * of Character class
	     */
		String charStr1 = Character.toString(c);
		System.out.println("Convert char to string using Character.toString method ::" + charStr1);
	}
}
