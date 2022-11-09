package com.code.withVithal.impppp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharInGivenString {
public static void main(String[] args) {
	
	String str="vithal Nagappa nIvargi vithal Nagappa nIvargi";
	String st = str.trim();
	String s = st.toLowerCase();
	char[] ch = s.toCharArray();
	
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	
	for(char cha:ch) {
		
		if(!map.containsKey(cha)) {
			map.put(cha, 1);
		}
		else {
			int a=map.get(cha);
			map.put(cha, ++a);
			
		}
	}
	
	System.out.println(map);
	
	//way of print woed occurance
	
	List<String> list = Arrays.asList(st.split(" "));
	Map<String, Long> occurance = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));	
System.out.println(occurance);
}
}
