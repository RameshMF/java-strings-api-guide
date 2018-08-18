package com.javaguides.strings.convertions.fromstring;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * ConvertStringToLongExamples
 * @author javaguides.net
 *
 */
public class ConvertStringToLongExamples {
	public static void main(String[] args) {
		
		//Convert using Long.parseLong()
		String str = "123456";
		long number = Long.parseLong(str);
		System.out.println("Convert using Long.parseLong() :: " + number);
		
		//Convert using Long.valueOf()
		long number1 = Long.valueOf(str);
		System.out.println("Convert using Long.valueOf() :: " + number1);
		
		// Convert using new Long(String).longValue()
		Long longObject = new Long(str);
		long number2 = longObject.longValue();
		System.out.println("Convert using new Long(String).longValue() :: " + number2);
		
		// Convert using DecimalFormat
		DecimalFormat decimalFormat = new DecimalFormat("#");
		try {
		   long number3 = decimalFormat.parse(str).longValue();
		   System.out.println("Convert using DecimalFormat: " + number3);
		} catch (ParseException e) {
		   System.out.println(str + " is not a valid number.");
		}
		
	}
}
