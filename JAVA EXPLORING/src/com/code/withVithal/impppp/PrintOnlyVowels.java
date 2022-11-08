package com.code.withVithal.impppp;

public class PrintOnlyVowels {
public static void main(String[] args) {
	
	String str="vikiikasdei";
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			
			System.out.print(str.charAt(i)+" ");
		}
		
	}
}
}
