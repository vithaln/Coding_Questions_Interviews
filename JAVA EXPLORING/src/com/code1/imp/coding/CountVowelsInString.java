package com.code1.imp.coding;

public class CountVowelsInString {

	public static void main(String[] args) {
		String s="aip";
		
	long countofVowels = s.chars().filter(i->i=='a'||i=='i'||i=='e'||i=='o'||i=='u'||i=='A'||i=='I'||i=='E'||i=='O'||i=='U').count();
		System.out.println(countofVowels);
		
		String d="12";
		Integer.parseInt(d);
		System.out.println(d);
		
	}
}
