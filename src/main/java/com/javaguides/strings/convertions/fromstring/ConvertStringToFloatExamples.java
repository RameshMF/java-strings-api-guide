package com.javaguides.strings.convertions.fromstring;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * ConvertStringToFloatExamples
 * @author javaguides.net
 *
 */
public class ConvertStringToFloatExamples {
	public static void main(String[] args) {
		// Convert using Float.parseFloat()
		String numberAsString = "153.25f";
		float number = Float.parseFloat(numberAsString);
		System.out.println("Convert using Float.parseFloat() : " + number);
		
		//Convert using Double.valueOf()
		float number1 = Float.valueOf(numberAsString);
		System.out.println("Convert using Double.valueOf() : " + number1);
		
		// Convert using new Double(String).doubleValue()
		Float floatObject = new Float(numberAsString);
		float number2 = floatObject.floatValue();
		System.out.println("Convert using new Double(String).doubleValue() : " + number2);
		
		//Convert using DecimalFormat
		DecimalFormat decimalFormat = new DecimalFormat("#");
		try {
			float number3 = decimalFormat.parse(numberAsString).floatValue();
		   System.out.println("Convert using DecimalFormat : " + number3);
		} catch (ParseException e) {
		   System.out.println(numberAsString + " is not a valid number.");
		}
	}
}
