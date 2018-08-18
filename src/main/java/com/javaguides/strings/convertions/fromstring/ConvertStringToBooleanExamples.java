package com.javaguides.strings.convertions.fromstring;

/**
 * ConvertStringToBooleanExamples
 * @author javaguides.net
 *
 */
public class ConvertStringToBooleanExamples {
	public static void main(String[] args) {
		// Convert using Long.parseLong()
		String numberAsString = "true";
		boolean b = Boolean.parseBoolean(numberAsString);
		System.out.println("Convert using Boolean.parseBoolean() :: " + b);

		// Convert using Boolean.valueOf()
		boolean b1 = Boolean.valueOf(numberAsString);
		System.out.println("Convert using Boolean.valueOf() :: " + b1);

		// Convert using new Long(String).longValue()
		Boolean longObject = new Boolean(numberAsString);
		boolean b3 = longObject.booleanValue();
		System.out.println("Convert using new Long(String).longValue() :: " + b3);
	}
}
