package com.selenium;

import java.util.Arrays;
import java.util.Collections;

public class Array_Sorting {
	
	public static void main(String[] args) {
		
		String [] arr = {"aa","ee","cc","bb","gb","zz"};
		
		System.out.println("Before Sorting");
		
		for (String string : arr) {
			
			System.out.println(string);
		
		}
		
		System.out.println("After Sorting");
		
		Arrays.sort(arr);
		
		for (String string : arr) {
			
			System.out.println(string);
		}
		
       System.out.println("Decending order");
		
		Arrays.sort(arr , Collections.reverseOrder());
		
		for (String string : arr) {
			
			System.out.println(string);
		}
	}
	
	
	
	

}
