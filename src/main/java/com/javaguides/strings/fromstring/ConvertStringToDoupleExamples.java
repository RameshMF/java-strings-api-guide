package com.javaguides.strings.convertions.fromstring;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * ConvertStringToDoupleExamples
 * @author javaguides.net
 *
 */
public class ConvertStringToDoupleExamples {
	public static void main(String[] args) {
		// Convert using Double.parseDouble()
		String str = "153.25";
		double number = Double.parseDouble(str);
		System.out.println("The number is: " + number);
		
		//Convert using Double.valueOf()
		double number1 = Double.valueOf(str);
		System.out.println("The number is: " + number1);
		
		// Convert using new Double(String).doubleValue()
		Double doubleObject = new Double(str);
		double number2 = doubleObject.doubleValue();
		System.out.println("The number is: " + number2);
		
		//Convert using DecimalFormat
		DecimalFormat decimalFormat = new DecimalFormat("#");
		try {
		   double number3 = decimalFormat.parse(str).doubleValue();
		   System.out.println("The number is: " + number3);
		} catch (ParseException e) {
		   System.out.println(str + " is not a valid number.");
		}
	}
}
