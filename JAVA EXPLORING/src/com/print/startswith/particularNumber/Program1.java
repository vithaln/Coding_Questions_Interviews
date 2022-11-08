package com.print.startswith.particularNumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {

	
	public static void main(String[] args) {

		//find the numbers which is starting with 2
System.out.println("******find the numbers which is starting with 2******");
		List<Integer> nums=Arrays.asList(12,296,63,262,56,98,22,525,563);
		
		nums.stream().map(n->n+"").filter(s->s.startsWith("2")).forEach(System.out::println);;
		
		System.out.println("****find the numbers which are ended by 3 in given list*****");
		//find the numbers which ended by 3 in list
		
		List<Integer> num=Arrays.asList(45,65,363,963,26,33,83,93,562,36,36,363);
		num.stream().map(n->n+"").filter(n->n.endsWith("3")).forEach(System.out::println);
		
		System.out.println("new operations....");
		
		List<Integer> lists=Arrays.asList(12,15,126,124,51224,5641,53,45354,1354,534,4,52,82,52,52,5,2);
		//lists.stream().filter(e->e.ge).collect(Collectors.toList());
		
		int max=Collections.max(lists);
	
		int min=Collections.min(lists);
		
		System.out.println(max);
		System.out.println("minimum number in given list "+min);
	
	};
	

}
