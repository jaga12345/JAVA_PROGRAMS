package com.selenium;

public class Sum_Avg_OF_Array {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8};
		
	    int sum=0;
	    
	    int avg=0;
		
		for(int i=0;i<arr.length;i++) {
		   
			sum = sum + arr[i];
			
		}
		
		System.out.println("sum of array is : " + sum);
		
		avg = sum/arr.length;
		
		System.out.println("avearage of array is : " + avg);
		
	}

}
