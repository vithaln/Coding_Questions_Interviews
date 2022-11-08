package com.java.findOccuranceinString;

public class CountCharinString {
	
	public static void main(String[] args) {
		String str="Vithal nagappa nivargi";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
System.out.println(count);
	}
}
