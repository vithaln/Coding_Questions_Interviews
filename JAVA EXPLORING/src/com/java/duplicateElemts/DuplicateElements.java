package com.java.duplicateElemts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		
		//find the duplicate elements in given list by using stream function.
		
		List<Integer> list=Arrays.asList(15,123,156,2,15,35,15,56,56,9,2,66,25,95,65,25,25);
		System.out.println(list);
		Set<Integer> set=new HashSet<Integer>();
		list.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x->System.out.print(x+" "));
	
	System.out.println("===================");
		List<Integer> lst=Arrays.asList(15,123,156,2,15,35,15,56,56,9,2,66,25,95,65,25,25);

		Set<Integer> s=new HashSet<Integer>();
		//lst.stream().filter(x->!s.add(x)).collect(Collectors.toSet()).forEach(x->System.out.print(x+ " "));
		lst.stream().filter(x->!s.add(x)).collect(Collectors.toSet()).forEach(ss->System.out.print(ss));
		
	
	
	}
	
	
	
}
