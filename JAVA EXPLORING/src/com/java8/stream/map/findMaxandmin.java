package com.java8.stream.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class findMaxandmin {

	public static void main(String[] args) {
		
		Stream<Integer> list=Stream.of(12,15,18,16,865,95,6,6,28,5);
		long count = list.count();
		System.out.println(count);
		
		Stream<Integer> list1=Stream.of(12,15,18,16,865,95,6,6,28,5);

		Optional<Integer> min = list1.min(Comparator.comparing(Integer::valueOf));
		System.out.println("minimum number "+min);
		
		Stream<Integer> list2=Stream.of(12,15,18,16,865,95,6,6,28,5);

		Optional<Integer> max = list2.max(Comparator.comparing(Integer::valueOf));
		System.out.println("maximum number "+max);
		

		
		List<Integer> lis=Arrays.asList(12,15,18,16,865,95,6,6,28,5);
		
	}
	
	
	
}
