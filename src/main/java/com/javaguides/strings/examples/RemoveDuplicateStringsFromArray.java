package com.javaguides.strings.examples;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateStringsFromArray {
	
	public static void main(String[] args) {
		String str = 
	            "The first second was alright but the second second was tough.";
	        
	        System.out.println("Original String: ");
	        System.out.println(str);
	        
	        /*
	         * Since the words are separated by space,
	         * we will split the string by one or more space
	         */
	        
	        String[] strWords = str.split("\\s+");
	        
	        //convert String array to LinkedHashSet to remove duplicates
	        Set<String> lhSetWords 
	            = new LinkedHashSet<String>( Arrays.asList(strWords) );
	        
	        //join the words again by space
	        StringBuilder sbTemp = new StringBuilder();
	        int index = 0;
	        
	        for(String s : lhSetWords){
	            
	            if(index > 0)
	                sbTemp.append(" ");
	        
	            sbTemp.append(s);
	            index++;
	        }
	        
	        str = sbTemp.toString();
	        
	        System.out.println("String after removing duplicate words: ");
	        System.out.println(str);
	 
	    }
	}

