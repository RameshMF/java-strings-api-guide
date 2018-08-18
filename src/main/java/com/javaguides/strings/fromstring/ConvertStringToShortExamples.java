package com.javaguides.strings.convertions.fromstring;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * ConvertStringToShortExamples
 * @author javaguides.net
 *
 */
public class ConvertStringToShortExamples {
	public static void main(String[] args) {
		// Convert using Short.parseShort
		String numberAsString = "100";
		short number = Short.parseShort(numberAsString);
		System.out.println("Convert using Short.parseShort() : " + number);

		// Convert using Byte.valueOf()
		short number1 = Short.valueOf(numberAsString);
		System.out.println("Convert using Short.valueOf() : " + number1);

		// Convert using new Short(String).intValue()
		short number2 = new Short(numberAsString).shortValue();
		System.out.println("Convert using new Short(String).intValue() : " + number2);

		// Convert using DecimalFormat
		DecimalFormat decimalFormat = new DecimalFormat("#");
		try {
			short number3 = decimalFormat.parse(numberAsString).byteValue();
			System.out.println("Convert using DecimalFormat : " + number3);
		} catch (ParseException e) {
			System.out.println(numberAsString + " is not a valid number.");
		}
	}
}
