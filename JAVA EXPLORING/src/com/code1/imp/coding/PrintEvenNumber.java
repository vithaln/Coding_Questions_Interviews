package com.code1.imp.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintEvenNumber {

	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(12);
		li.add(23);
		li.add(6);
		li.add(9);
		li.add(7889);
		
		//by using stream print even numbers only...
		
		List<Integer> collect = li.stream().filter(e->e%2==0).collect(Collectors.toList());
		
		//System.out.println(collect);

	
		int n=13;
		int count=0;
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				count++;
			}
			
		
		}
		if(count==2) {
			System.out.println("this is prime number : "+ n);
		}
		else {
			System.out.println(n+" is not prime number :");
		}
		
		System.out.println("===========>>>>>>>>");
	int n1=12;
	System.out.println(getSquare(n1));
		
	}
	public static int getSquare(int n) {
		
		return n*n*n;
	}
}
