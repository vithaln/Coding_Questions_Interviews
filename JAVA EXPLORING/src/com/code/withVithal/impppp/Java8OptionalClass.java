package com.code.withVithal.impppp;

import java.util.Optional;

public class Java8OptionalClass {
public static void main(String[] args) {
	
	String str="vithal";
	
	Optional<String> optional = Optional.of(str);
	
	if(optional.isPresent()) {
	System.out.println("hello "+optional.get());
	}
	else {
		Optional<String> defaultv = Optional.of("default value");
		System.out.println("there is no value present "+defaultv.get());
	}
String st="";
	
	Optional<String> optionals = Optional.ofNullable(st);
	
	if(optionals.isPresent()) {
	System.out.println("Value is present");
	}
	else {
		
		System.out.println("there is no value present ");
	}
	
}
}
