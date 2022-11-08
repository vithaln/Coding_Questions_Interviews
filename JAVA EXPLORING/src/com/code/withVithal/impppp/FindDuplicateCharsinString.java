package com.code.withVithal.impppp;

public class FindDuplicateCharsinString {
public static void main(String[] args) {
	
	String str="vithalnivargi";
	
	String dupChar="";
	
	for(int i=0;i<str.length();i++) {
		
		for(int j=i+1;j<str.length();j++) {
			
			if(str.charAt(i)==str.charAt(j)) {
				String s=Character.toString(str.charAt(i));
				
				if(!dupChar.contains(s)) {
					dupChar=dupChar+" "+str.charAt(i);
				}
			}
			
		}
	}
	System.out.println(str);
	System.out.println(dupChar);
	
}
}
