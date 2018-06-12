package com.selenium;

public class Revese_String {
	
	public static void main(String[] args) {
		
		String name = "RAJA";
		String revese = "";
		
		for(int i = name.length()-1; i>=0 ; i--){
			
			revese = revese + name.charAt(i);
			
		}
		
		System.out.println(revese);
	}

}
