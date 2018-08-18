package com.javaguides.strings.convertions.fromstring;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * ConvertStringToIntegerExamples
 * @author javaguides.net
 *
 */
public class ConvertStringToIntegerExamples {
	public static void main(String[] args) {
		// Convert using Integer.parseInt()
		String str = "1234";
		int number = Integer.parseInt(str);
		System.out.println("Convert using Integer.parseInt() : " + number);

		// Convert using Integer.valueOf()
		int number1 = Integer.valueOf(str);
		System.out.println("Convert using Integer.valueOf() : " + number1);

		// Convert using new Integer(String).intValue()
		int number2 = new Integer(str).intValue();
		System.out.println("Convert using new Integer(String).intValue() : " + number2);

		// Convert using DecimalFormat
		DecimalFormat decimalFormat = new DecimalFormat("#");
		try {
			int number3 = decimalFormat.parse(str).intValue();
			System.out.println("Convert using DecimalFormat : " + number3);
		} catch (ParseException e) {
			System.out.println(str + " is not a valid number.");
		}
	}
}
