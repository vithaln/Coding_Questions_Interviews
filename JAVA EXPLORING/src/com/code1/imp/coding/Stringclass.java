package com.code1.imp.coding;

public class Stringclass {

	public static void main(String[] args) {
		
		String s="vithal";
		String s1=new String("vithal");
		String s2="vithal";
		String s3="vikki";
		
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s==s3);
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s3));
		System.out.println(s);
		
		
	}
}
