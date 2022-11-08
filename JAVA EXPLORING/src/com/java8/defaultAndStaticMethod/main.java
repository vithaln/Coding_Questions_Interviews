package com.java8.defaultAndStaticMethod;

class main{
	public static void main(String[]args) {

		
		MethodDemo md=new MethodDemo();
		String hello = md.hello();
		String hey = md.hey();
		String name = md.name();
		String thanks = md.thanks();
		System.out.println(hello);
		System.out.println(hey);
		System.out.println(name); 
		System.out.println(thanks);
		
String defaults = md.defaults();
	System.out.println(defaults);	
		System.out.println(methoddeandstatic.staticmethod());
		
		}
}