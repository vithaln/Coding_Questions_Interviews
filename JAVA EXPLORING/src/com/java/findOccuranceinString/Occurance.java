package com.java.findOccuranceinString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurance {
public static void main(String[] args) {
	String str="hello";
	
	List<String> asList = Arrays.asList(str.split(" "));
	System.out.println(asList);
	
	Map<String, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			;
	System.out.println(collect);
}
}