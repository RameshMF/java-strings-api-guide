package com.javaguides.strings.convertions;

import java.text.DecimalFormat;

/**
 * Class to convert float to string examples.
 * @author javaguides.net
 *
 */
public class ConvertFloatToStringExample {
	public static void main(String[] args) {
		// Convert using Float.toString(int)
		float f = 100.25f;
		String floatAsString = Float.toString(f);
		System.out.println("Convert using Float.toString(int) -> " + floatAsString);

		// Convert using String.valueOf(int)
		String floatAsString1 = String.valueOf(f);
		System.out.println("Convert using String.valueOf(int) -> " + floatAsString1);

		// Convert using new Integer(int).toString()
		Float floatInstance = new Float(f);
		String floatAsString2 = floatInstance.toString();
		System.out.println("Convert using new Long(int).toString() -> " + floatAsString2);

		// Convert using String.format()
		String floatAsString3 = String.format("%f", f);
		System.out.println("Convert using String.format() -> " + floatAsString3);

		// Convert using DecimalFormat
		double numDouble1 = 12345.10;
		DecimalFormat decimalFormat = new DecimalFormat("#");
		String floatAsString4 = decimalFormat.format(numDouble1);
		System.out.println("Convert using DecimalFormat -> " + floatAsString4);

		// Convert using StringBuffer Example
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(f);
		String floatAsString5 = stringBuffer.toString();
		System.out.println("Convert using StringBuffer Example -> " + floatAsString5);

		// Convert using StringBuilder Example
		StringBuilder sbBuilder = new StringBuilder();
		sbBuilder.append(f);
		String floatAsString6 = sbBuilder.toString();
		System.out.println("Convert using StringBuilder Example  -> " + floatAsString6);
	}
}
