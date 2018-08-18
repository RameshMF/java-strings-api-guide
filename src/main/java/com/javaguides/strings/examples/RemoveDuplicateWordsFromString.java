package com.javaguides.strings.examples;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Java Program to Count Number of Duplicate Words in Given String using java 8
 * 
 * @author javaguides.net
 *
 */
public class RemoveDuplicateWordsFromString {
	public static void main(String[] args) {

		String string = "i like java java coding java and you do you interested in java coding coding.";

		string = Arrays.stream(string.split("\\s+")).distinct().collect(Collectors.joining(" "));

		System.out.println(string);

	}
}
