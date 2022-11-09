package com.code.withVithal.impppp;

public class CountNumbers {
	public static void main(String[] args) {
		int n=12345;
		
		String str=Integer.toString(n);
	int count = str.length();
	System.out.println(count);
	//without using in built-methods
	System.out.println("=========other way>>");
	int cnt=0;
	int num=123456;
	while(num>0) {
		cnt++;//1
		num=num/10;//
	}
	
	System.out.println(cnt);
}
}