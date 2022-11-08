package com.java.StringJoiner;

public class StringJoiner {

	public static void main(String[] args) {
		
		//input  ABCDPQ
		//output [A,B,C,D]
		//		 P:Q
		//		 [A,B,C,D,P:Q]
			
		
		java.util.StringJoiner str=new java.util.StringJoiner(",", "[","]");
		str.add("A").add("B").add("C").add("D");
		System.out.println(str);
		
		java.util.StringJoiner st=new java.util.StringJoiner(":");
		st.add("P").add("Q");
		System.out.println(st);
		
		str.merge(st);
		System.out.println(str);
		


		
	
	
	
	
	
	
	
	
	}
}
