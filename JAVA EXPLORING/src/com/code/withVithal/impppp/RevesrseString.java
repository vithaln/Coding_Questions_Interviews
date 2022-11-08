package com.code.withVithal.impppp;

public class RevesrseString {
	public static void main(String[] args) {
		
		String str="vithal nivargi nivargi";
		String st="";
		char[] s = str.toCharArray();
		
		for(int i=s.length-1;i>=0;i--) {
			
			st=st+str.charAt(i);
		}
	System.out.println(st);
	}

}
