package com.selenium;

public class Duplicates_IN_Array2 {
	
	public static void main(String[] args) {
		
		
		int [] a = {1,2,3,4,5,6,3,4,2};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println("duplicates are :" + a[i]);
				}
				
			}
		}
		
	}

}
