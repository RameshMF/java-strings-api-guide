package com.javaguides.strings.convertions.fromstring;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * ConvertStringToByteExamples
 * @author javaguides.net
 *
 */
public class ConvertStringToByteExamples {
	public static void main(String[] args) {
		// Convert using IByte.parseByte
		String numberAsString = "100";
		byte number = Byte.parseByte(numberAsString);
		System.out.println("Convert using Byte.parseByte() : " + number);

		// Convert using Byte.valueOf()
		byte number1 = Byte.valueOf(numberAsString);
		System.out.println("Convert using Byte.valueOf() : " + number1);

		// Convert using new Integer(String).intValue()
		byte number2 = new Byte(numberAsString).byteValue();
		System.out.println("Convert using new Byte(String).intValue() : " + number2);

		// Convert using DecimalFormat
		DecimalFormat decimalFormat = new DecimalFormat("#");
		try {
			byte number3 = decimalFormat.parse(numberAsString).byteValue();
			System.out.println("Convert using DecimalFormat : " + number3);
		} catch (ParseException e) {
			System.out.println(numberAsString + " is not a valid number.");
		}
	}
}
