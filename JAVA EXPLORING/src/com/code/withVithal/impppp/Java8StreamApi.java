package com.code.withVithal.impppp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8StreamApi {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(12,56,2,3,5,1,5,542,12,26,512,6,62);
	System.out.println("ORIGINAL LIST");
	System.out.println(list);
	//each numbers multiple by 2
	System.out.println("each number Multiple by 2");
	list.stream().map(x->x*2).forEach(System.out::println);
	
	//print numbers greater than 500
	System.out.println("Greater than 500");
	list.stream().filter(x->x>500).forEach(System.out::println);
	
	
	//print sorted order
	System.out.println("Sorted List..");
	List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedList);
	
	//find maximumum number in list
	System.out.println("Maximum number in list..");
	 Integer max = list.stream().max((x,y)->x-y).get();
	 System.out.println(max);
	 
	 //find minimum number in list
	 System.out.println("Minimum number");
	 Integer min = list.stream().min((x,y)->x-y).get();
	 System.out.println(min);
	
	
	
}
}
