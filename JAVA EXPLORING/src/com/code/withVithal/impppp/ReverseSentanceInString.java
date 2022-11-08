package com.code.withVithal.impppp;

public class ReverseSentanceInString {
public static void main(String[] args) {
	
	
	String str="I am Vithal Nivargi";
	String st[] =str.split(" ");
	String s="";
	
	for(int i=st.length-1;i>=0;i--) {
		s=s+st[i]+" ";
	}
System.out.print(s);
}
}
