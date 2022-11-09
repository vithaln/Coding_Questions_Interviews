package com.code.withVithal.impppp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccuranceOfWordsGivenSentance {
public static void main(String[] args) {
	
	String str="I am Vithal Nagappa Nivargi From Sonyal Tal-Jath Dist-Sangli and Vithal is From sonyal tal-jath dist-sangli";
	String st = str.toLowerCase();
	
	List<String> lst = Arrays.asList(st.split(" "));
	Map<String, Long> collect = lst.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(collect);








}
}
