package com.print.startswith.particularcharacter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Emp {

	public static void main(String[] args) {
		
		List<String> str=Arrays.asList("vitj","kjhgd","frjhdskljh","vjcflkjvdoi","vij","msjdd");
//		){
//		for(String st:str) {
//			System.out.println(st);
//		}
//		
		System.out.println(str);
		System.err.println("********************");
		List<String> collect = str.stream().filter(e->e.startsWith("v")).collect(Collectors.toList());
		List<String> collects = str.stream().filter(e->e.endsWith("d")).collect(Collectors.toList());

		System.out.println(collect);
		System.out.println("***ends with d");
		System.out.println(collects);
	
	
	}
	
}
