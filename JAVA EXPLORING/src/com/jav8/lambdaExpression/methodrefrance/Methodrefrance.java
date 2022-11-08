package com.jav8.lambdaExpression.methodrefrance;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

interface printtable{
	
	void print(String msg);
}

public class Methodrefrance {

	//method refrance to an instance of an object...
	
	void display(String msg) {
		
		 msg = msg.toUpperCase();
		System.out.println(msg);
	}
	
	
	//static method
	static int addition(int a,int b) {
		return(a+b);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number...");
		int x = sc.nextInt();
		
	//using lambda expression
		Function<Integer, Double> fun=(input)->Math.sqrt(input);
			System.out.println(fun.apply(x));
			System.out.println("Welcome!!!");
			
	//using method refrance
		Function<Integer, Double> fn=Math::sqrt;
			System.out.println(fn.apply(25));
	
//static method by using lamda expression...
		BiFunction<Integer, Integer, Integer> biFunction=(a,b)->Methodrefrance.addition(a, b);
		System.out.println(biFunction.apply(45, 2));
			
//static method by using method refrance
		
		BiFunction<Integer, Integer, Integer> biFunction2=Methodrefrance::addition;
		System.out.println(biFunction2.apply(12,15));
	
		//2:method refrance to an instance of an object...
		//using lambda expression
		Methodrefrance methodrefrance=new Methodrefrance();
	
		printtable pt=(msg)->methodrefrance.display(msg);
		
	pt.print("hi vithal good morning");
	
	//using method refrance
	printtable ptt=methodrefrance::display;
	
	ptt.print("hi brother good morning");
		
	}
}
