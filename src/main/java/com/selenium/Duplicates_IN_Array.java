package com.selenium;

import java.util.HashSet;
import java.util.Set;

public class Duplicates_IN_Array {
	
	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,3,4,2};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (Integer b : a) {
			
			if(set.add(b)==false) {
				
				System.out.println("Duplicates Are :" + b);
			}
		}
	}

}
