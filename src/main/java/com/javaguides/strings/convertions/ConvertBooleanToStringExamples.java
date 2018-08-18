package com.javaguides.strings.convertions;

/**
 * Class to Convert Double To String Example
 * @author javaguides.net
 *
 */

public class ConvertBooleanToStringExamples {

	public static void main(String[] args) {

		/*
		 * Method 1: using valueOf() method of String class.
		 */
		boolean flag = true;
		String strBoolean = String.valueOf(flag);
		System.out.println("Convert boolean to string using valueOf method ::" + strBoolean);

		/*
		 * Method 2: using toString() method of Boolean class
		 */
		String strBoolean1 = Boolean.toString(flag);
		System.out.println("Convert boolean to string using Boolean.toString method ::" + strBoolean1);
	}

}
