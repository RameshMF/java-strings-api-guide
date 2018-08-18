package com.javaguides.strings.convertions;

import java.text.DecimalFormat;

/**
 * ConvertDoubleToStringExample
 * @author javaguides.net
 *
 */
public class ConvertDoubleToStringExample {
	public static void main(String[] args) {
		
		// Convert using Double.toString(int)
		double numDouble = 100.25;
		String doubleAsString = Double.toString(numDouble);
		System.out.println("Convert using Double.toString(int) -> " + doubleAsString);

		// Convert using String.valueOf(int)
		String doubleAsString1 = String.valueOf(numDouble);
		System.out.println("Convert using String.valueOf(int) -> " + doubleAsString1);

		// Convert using new Double(int).toString()
		Double doubleInstance = new Double(numDouble);
		String doubleAsString2 = doubleInstance.toString();
		System.out.println("Convert using new Double(int).toString() -> " + doubleAsString2);

		// Convert using String.format()
		String numberAsString3 = String.format ("%f", numDouble);
		System.out.println("Convert using String.format() -> " + numberAsString3);

		// Convert using DecimalFormat
		double numDouble1 = 12345.10;
		DecimalFormat decimalFormat = new DecimalFormat("#");
		String numberAsString4 = decimalFormat.format(numDouble1);
		System.out.println(doubleAsString);
		System.out.println("Convert using DecimalFormat -> " + numberAsString4);

		// Convert using StringBuffer Example
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(numDouble);
		String numberAsString5 = stringBuffer.toString();
		System.out.println("Convert using StringBuffer Example -> " + numberAsString5);

		// Convert using StringBuilder Example
		StringBuilder sbBuilder = new StringBuilder();
		sbBuilder.append(numDouble);
		String numberAsString6 = sbBuilder.toString();
		System.out.println("Convert using StringBuilder Example  -> " + numberAsString6);
	}
}
