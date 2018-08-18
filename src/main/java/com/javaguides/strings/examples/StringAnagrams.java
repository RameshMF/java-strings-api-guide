package com.javaguides.strings.examples;

import java.util.HashMap;
import java.util.Map;

/**
 * 2) How to check if two Strings are anagrams of each other? (solution) A
 * simple coding problem based upon String, but could also be asked with
 * numbers. You need to write a Java program to check if two given strings are
 * anagrams of Each other. Two strings are anagrams if they are written using
 * the same exact letters, ignoring space, punctuation and capitalization. Each
 * letter should have the same count in both strings. For example, Army and Mary
 * are anagram of each other.
 */
public class StringAnagrams {
	public boolean areAnagrams(String s1, String s2) {
		if (s1 == null)
			return s2 == null;
		if (s2 == null)
			return s1 == null;

		Map<Character, Integer> s1chars2count = new HashMap<>();
		Map<Character, Integer> s2chars2count = new HashMap<>();

		s1.chars().filter(ch -> ch != ' ').map(ch -> Character.toLowerCase((char) ch)).forEach(ch -> {
			if (s1chars2count.containsKey(ch))
				s1chars2count.put((char) ch, s1chars2count.get(ch) + 1);
			else
				s1chars2count.put((char) ch, 1);
		});

		s2.chars().filter(ch -> ch != ' ').map(ch -> Character.toLowerCase((char) ch)).forEach(ch -> {
			if (s2chars2count.containsKey(ch))
				s2chars2count.put((char) ch, s2chars2count.get(ch) + 1);
			else
				s2chars2count.put((char) ch, 1);
		});

		return s1chars2count.size() == s2chars2count.size() && s1chars2count.entrySet().stream()
				.filter(e -> !s2chars2count.containsKey(e.getKey()) || s2chars2count.get(e.getKey()) != e.getValue())
				.noneMatch(s -> true);
	}

	public static void main(String[] args) {
		StringAnagrams a = new StringAnagrams();
		boolean b = a.areAnagrams("Mary", "Army");
		boolean b1 = a.areAnagrams("abc", "abcd");
		System.out.println(b);
		System.out.println(b1);
	}
}