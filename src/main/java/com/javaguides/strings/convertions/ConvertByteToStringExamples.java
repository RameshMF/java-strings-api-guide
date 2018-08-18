package com.javaguides.strings.convertions;

/**
 * Class to Convert Byte To String Example
 * @author javaguides.net
 *
 */

public class ConvertByteToStringExamples {
	public static void main(String[] args) {
		/*
		 * Method 1: using valueOf() method of String class.
		 */
		byte b = 10;
		String strByte = String.valueOf(b);
		System.out.println("Convert byte to string using valueOf method ::" + strByte);

		/*
		 * Method 2: using toString() method of Byte class
		 */
		String strByte1 = Byte.toString(b);
		System.out.println("Convert Byte to String using Byte.toString method ::" + strByte1);
	}
}
