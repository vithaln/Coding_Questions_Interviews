package com.code.withVithal.impppp;


public class Java8FunctionalInterface {
public static void main(String[] args) {
	
	Java8FunctionalInterfaces squre=(int x)->x*x;
	
	int sqr = squre.calculate(5);
	System.out.println(sqr);
}
}
