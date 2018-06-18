package com.selenium;

public class Middle_Elementy_OF_Array {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<arr.length;i++) {
			
			int length = arr.length/2;
			
			if(length!=0) {
				
				System.out.println("middle element of the array is : "+arr[length]);
				
			}
			
			else{
				
				System.out.println("middle element of the array is : " +arr[length]+ ","+arr[length-1] );
			}
		}
		
	}

}
