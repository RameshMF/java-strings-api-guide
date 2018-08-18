package com.javaguides.strings.convertions;

import java.text.DecimalFormat;

/**
 * ConvertLongToStringExample
 * @author javaguides.net
 *
 */
public class ConvertLongToStringExample {
	public static void main(String[] args) {
		
		// Convert using Long.toString(int)
		long number = 100L;
		String numberAsString = Long.toString(number);
		System.out.println("Convert using Long.toString(int) -> " + numberAsString);

		// Convert using String.valueOf(int)
		String numberAsString1 = String.valueOf(number);
		System.out.println("Convert using String.valueOf(int) -> " + numberAsString1);

		// Convert using new Integer(int).toString()
		Long longInstance = new Long(number);
		String numberAsString2 = longInstance.toString();
		System.out.println("Convert using new Long(int).toString() -> " + numberAsString2);

		// Convert using String.format()
		String numberAsString3 = String.format("%d", number);
		System.out.println("Convert using String.format() -> " + numberAsString3);

		// Convert using DecimalFormat
		long number1 = 12345L;
		DecimalFormat decimalFormat = new DecimalFormat("#");
		String numberAsString4 = decimalFormat.format(number1);
		System.out.println(numberAsString);
		System.out.println("Convert using DecimalFormat -> " + numberAsString4);

		// Convert using StringBuffer Example
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(number);
		String numberAsString5 = stringBuffer.toString();
		System.out.println("Convert using StringBuffer Example -> " + numberAsString5);

		// Convert using StringBuilder Example
		StringBuilder sbBuilder = new StringBuilder();
		sbBuilder.append(number);
		String numberAsString6 = sbBuilder.toString();
		System.out.println("Convert using StringBuilder Example  -> " + numberAsString6);

	}
}
