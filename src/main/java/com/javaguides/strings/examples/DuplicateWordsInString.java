package com.javaguides.strings.examples;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

/**
 * Java program to count number of duplicate words in given string
 * @author javaguides.net
 *
 */
public class DuplicateWordsInString {
	private static void duplicateWords(String inputString) {
		// Splitting inputString into words
		final String[] words = inputString.split(" ");

		// Creating one HashMap with words as key and their count as value
		final Map<String, Integer> wordCount = new HashMap<String, Integer>();

		// Checking each word
		for (String word : words) {
			// whether it is present in wordCount

			if (wordCount.containsKey(word)) {
				// If it is present, incrementing it's count by 1

				wordCount.put(word.toLowerCase(), wordCount.get(word) + 1);
			} else {
				// If it is not present, put that word into wordCount with 1 as
				// it's value

				wordCount.put(word, 1);
			}
		}

		// Extracting all keys of wordCount

		final Set<String> wordsInString = wordCount.keySet();

		// Iterating through all words in wordCount

		for (String word : wordsInString) {
			// if word count is greater than 1

			if (wordCount.get(word) > 1) {
				// Printing that word and it's count
				System.out.println(word + " : " + wordCount.get(word));
			}
		}
	}

	public static void main(String[] args) {
		
		duplicateWords("java guides java");

		duplicateWords("Java is java again java");

		duplicateWords("Super Man Bat Man Spider Man");
	}
}