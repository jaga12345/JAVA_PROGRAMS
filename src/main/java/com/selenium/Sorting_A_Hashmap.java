package com.selenium;

import java.io.StringBufferInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import net.bytebuddy.build.EntryPoint;

public class Sorting_A_Hashmap {
	
	public static void main(String[] args) {
		
		Map<String, String> hashmap = new HashMap<String, String>();
		
		hashmap.put("APPLE", "apple");
		hashmap.put("BALL", "ball");
		hashmap.put("DOG", "dog");
		hashmap.put("CAT", "cat");
		
		for (Entry<String, String> entry : hashmap.entrySet()) {
			
			System.out.println(entry.getKey());
		
		}
		
		Map<String, String> treemap = new TreeMap<String, String>(hashmap);
	
		System.out.println("After Sorting");
		
		
	for (Entry<String, String> entry : treemap.entrySet()) {
			
			System.out.println(entry.getKey());
		
		}
	}

}
