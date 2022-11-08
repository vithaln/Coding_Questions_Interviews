package com.java8.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOrder {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();

		fruits.add("apple");
		fruits.add("banana");
		fruits.add("chackku");
		fruits.add("pomogrante");
		fruits.add("watermilk");
		fruits.add("grapes");
		fruits.add("tomatos");
		fruits.add("driagan");
		System.out.println(fruits);
	
		//Sort the fruits by name
		//1 way sort the fruiuts
		List<String> fruiteList = fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(fruiteList);
	
	//2 way sort the fruiuts
				List<String> fruiteLists = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
				System.out.println(fruiteLists);
			
	//3rd way
				List<String> fruiteListss = fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
	
				System.out.println(fruiteListss);
	
	//desending oreder 
				
				//1-way
				List<String> fruitscollectedbydesendorder = fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
				System.out.println(fruitscollectedbydesendorder);
	
				//2-way
				List<String> fruitscollectedbydesendorders = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
				System.out.println(fruitscollectedbydesendorders);
				
	}
}
