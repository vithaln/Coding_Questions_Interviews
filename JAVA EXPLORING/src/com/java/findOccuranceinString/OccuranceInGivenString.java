package com.java.findOccuranceinString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceInGivenString {
	
	public static void main(String[] args) {
		
		
		//count the no of occurrence of words in given string. 
		String str="welcome to vithal and welcome vithal to this vithal code";
		System.out.println(str);//simple string
		
		List<String> st=Arrays.asList(str.split(" "));
		System.out.println(st);//added in list all strings(words)
		
		Map<String, Long> occurrence = st.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(occurrence);
		
		System.out.println("*******************************************************");
		String str1 ="Hello I'm vithal nivargi trying to cout occurance in given string"
				+ "hello it is the good way to learn new things never be hopeles you should be keep selfBeilef thanks vithal nivargi"
				+ "Hello it is the nice to see the learn new tricks bb bb bb bb";
		
	System.out.println(str1);
	List<String> list=Arrays.asList(str1.split(" "));
	System.out.println(list);
	Map<String, Long> collects = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(collects);
	
	System.out.println(":revision-------------->");
	String s="vithal nivargi vithal son nivargi nivargi son";
	
	List<String> asList = Arrays.asList(s.split(" "));
	Map<String, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(collect);
	
	}

}
