package com.javaguides.strings.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Java Program to merge 2 arrays of string values.
 * @author javaguides.net
 *
 */
public class MergeTwoStringarrays {
	
	private static String[] mergeStringArrays(String array1[], String array2[]) {

		if (array1 == null || array1.length == 0)
			return array2;
		if (array2 == null || array2.length == 0)
			return array1;
		List<String> firstList = Arrays.asList(array1);
		List<String> secondList = Arrays.asList(array2);
		
		List<String> result = new ArrayList<String>(firstList);
		List<String> tmp = new ArrayList<String>(firstList);
		
		tmp.retainAll(secondList);
		result.removeAll(tmp);
		result.addAll(secondList);
		return ((String[]) result.toArray(new String[result.size()]));
	}
	
	public static void main(String[] args) {
		String[] strArray = mergeStringArrays(new String[] {"abc","xyz","pqr"}, new String[] {"abc","ABC","PQR"});
		for(String string : strArray){
			System.out.println(string);
		}
	}
}
