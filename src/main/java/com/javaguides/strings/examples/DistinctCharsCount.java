package com.javaguides.strings.examples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Program to print each with 
 * @author javaguides.net
 *
 */
public class DistinctCharsCount {

	public static void main(String[] args) {

		printDistinctCharsWithCount("abc");
		printDistinctCharsWithCount("abcab3");
		printDistinctCharsWithCount("javaguides");
		printDistinctCharsWithCount1("javaguides");
	}

	private static void printDistinctCharsWithCount(String input) {
		Map<Character, Integer> charsWithCountMap = new HashMap<>();

		// using Map merge method from Java 8
		for (char c : input.toCharArray())
			charsWithCountMap.merge(c, 1, Integer::sum);
		System.out.println(charsWithCountMap);
	}
	
	private static void printDistinctCharsWithCount1(String input) {
		Map<Character, Integer> charsWithCountMap = new HashMap<>();

		List<Character> list = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

		list.stream().forEach(c -> charsWithCountMap.merge(c, 1, Integer::sum));

		System.out.println(charsWithCountMap);

	}
}
