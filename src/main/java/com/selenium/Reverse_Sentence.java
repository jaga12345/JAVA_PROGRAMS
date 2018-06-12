package com.selenium;

public class Reverse_Sentence {
	
	public static void main(String[] args) {
		
		String name = "MY NAME IS RAJA";
		String reverse = "";
		
		String [] word = name.split(" ");
		
		for(int i = name.length()-1; i>=0; i--) {
			
			reverse = reverse + word [i] + " ";
		
		}
		
		System.out.println(reverse);
	}

}
