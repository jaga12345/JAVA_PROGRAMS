package com.selenium;

public class Reverse_eachwords_IN_A_Sentence {
	
	
	public static String reverse_the_string(String name) {
		
		String [] word = name.split(" ");
		
		String final_sentence = "";
		
		for(int i=0; i<word.length; i++) {
			String revword = word[i];
			String final_revword="";
			
			for(int j=word.length-1; j>=0; j--) {
				final_revword = final_revword+revword+name.charAt(j);
			}
			
			
			final_sentence = final_sentence + final_revword + "" ;
			
		}
		
		return final_sentence;
		
	}
	

	public static void main(String[] args) {
		
		String name = "MY NAME IS RAJA";
		reverse_the_string(name);
		
		
	}

}
