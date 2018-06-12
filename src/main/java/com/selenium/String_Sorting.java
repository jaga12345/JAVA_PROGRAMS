package com.selenium;

import java.util.Arrays;

public class String_Sorting {
	
	public static void main(String[] args) {
		
		String str = "RAJA";
		
		char arr[]=str.toCharArray();
		
		for (char c : arr) {
			
			System.out.println(c);
		}
		
		Arrays.sort(arr);
		
        for (char c : arr) {
			
			System.out.println(c);
		} 
	}

}
