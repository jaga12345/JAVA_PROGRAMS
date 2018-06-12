package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Programs {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Ball");
		list.add("Cat");
		list.add("Dog");
		list.add("Elephant");
		
		System.out.println(list);
		
		Collections.swap(list, 1, 2);
		
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);
		
	}

}
