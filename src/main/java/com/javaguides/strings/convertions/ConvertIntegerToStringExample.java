package com.javaguides.strings.convertions;

import java.text.DecimalFormat;

/**
 * ConvertIntegerToStringExample
 * @author javaguides.net
 *
 */
public class ConvertIntegerToStringExample {
	public static void main(String[] args) {
		
		// Convert using Integer.toString(int)
		int number = 100;
		String numberAsString = Integer.toString(number);
		System.out.println("Convert using Integer.toString(int) -> " + numberAsString);
		
		// Convert using String.valueOf(int)
		String numberAsString1 = String.valueOf(number);
		System.out.println("Convert using String.valueOf(int) -> " + numberAsString1);
		
		// Convert using new Integer(int).toString()
		String numberAsString2 = new Integer(number).toString();
		System.out.println("Convert using new Integer(int).toString() -> " + numberAsString2);
		
		//Convert using String.format()
		String numberAsString3 = String.format ("%d", number);
		System.out.println("Convert using String.format() -> " + numberAsString3);
		
		// Convert using DecimalFormat
		int number1 = 12345;
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
