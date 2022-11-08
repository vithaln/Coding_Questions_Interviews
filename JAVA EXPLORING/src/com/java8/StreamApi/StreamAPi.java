package com.java8.StreamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPi {

	public static void main(String[] args) {
		
		//way creating of stream....
		
	//1	
		Stream<String> coll=Stream.of("a","b","c");
	
		coll.forEach(System.out::println);
		
	//2
		List<String> asList = Arrays.asList("JAVA","python","c++","go","rubby","go","java");
				
		asList.stream().
		collect(Collectors.toList());
		System.out.println(asList);
	
		//3
		Set<String> asListset = new HashSet<String>(asList);
		
		asListset.stream().
		collect(Collectors.toList());
		System.out.println(asListset);

		//4
Collection<String> col=Arrays.asList("java","j2ee","adavanceJAva","js","Spring boot");
	Stream<String> stream=col.stream();
stream.forEach(System.out::println);	
	
	
	
	
	
	
	}
}
