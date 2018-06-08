package com.selenium;

import java.util.HashSet;
import java.util.Set;

public class Removing_Duplicates {
	
	public static void main(String[] args) {
		
		String name = "RAJA";
		
		System.out.println(remove_duplicates(name));
	}

	
	public static String remove_duplicates(String name) {
		
		Set<Character> set = new HashSet<Character>();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<name.length(); i++) {
			
			Character c = name.charAt(i);
			
			if(!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		
		return sb.toString();
	}
}
