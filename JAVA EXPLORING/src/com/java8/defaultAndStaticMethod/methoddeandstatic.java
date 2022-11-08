package com.java8.defaultAndStaticMethod;

interface methoddeandstatic{
	
	String hello();
	String hey();
	String name();
	String thanks();
	default String defaults() {
		return"default methos is called";
	}
	static String staticmethod() {
		
		return "static method is called";
	}
	
}

