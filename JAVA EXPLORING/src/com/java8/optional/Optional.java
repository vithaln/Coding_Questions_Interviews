package com.java8.optional;

public class Optional {
	
	public static void main(String[] args) {
		
		/*
		 * Optional class provides a nullpointer exception and null checks Optional
		 * class provides multiples method to implements optional class. methods like...
		 * of,ofNullable,empty,map,trim,orElse, orElseGet, orElseThrow etc...
		 */
		
		String email="vnnivargi1998@gmail.com";
		
		String emails=null;
		//System.out.println(email);
		
		java.util.Optional<String> str=java.util.Optional.of(email);
		System.out.println(str);
		
		//empty method can be used by to provide empty object of an optional class.
		java.util.Optional<Object> empty = java.util.Optional.empty();
		System.out.println(empty);
		
		//ofNullable method can be use if value is null we can provide default value.
		java.util.Optional<String> ofNullable = java.util.Optional.ofNullable(emails);
		String orElse = ofNullable.orElse("default15@gmail.com");
		System.out.println(orElse);
		
		String str1=null;
		//System.out.println(str1);
		java.util.Optional<String> st=java.util.Optional.ofNullable(str1);
		String orElseGet = st.orElseGet(()->"vikiii this default value");
		System.out.println(orElseGet);
		
		if(st.isPresent()) {
			System.out.println(st.get());
		}
		else {
			System.out.println("no value is present!");
		}
		
		
		//orElseThrow
		String ss=null;
		java.util.Optional<String> st2 = java.util.Optional.ofNullable(ss);
		
	//	String orElseThrow = st2.orElseThrow(()-> new IllegalArgumentException("no email is present"));
//System.out.println(orElseThrow);
	

//ifPresent

java.util.Optional<String> gender = java.util.Optional.of("male");
	java.util.Optional<Object> empty2 = java.util.Optional.empty();
	
	gender.ifPresent((S)-> System.out.println("values is present"));
	empty2.ifPresent((S)-> System.out.println("value is not present"));
	
	
	//filter method
	String result= "  subhash";
	java.util.Optional<String> ress = java.util.Optional.of(result);
	
	ress
	.filter(res->res.contains("subhash"))
	.map(String::trim)
	.ifPresent((res)->System.out.println(res));;
	
	//map method
	
	
	
	
	}

}
