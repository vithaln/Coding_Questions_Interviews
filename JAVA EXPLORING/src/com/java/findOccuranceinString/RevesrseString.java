package com.java.findOccuranceinString;

public class RevesrseString {

	
	public static void main(String[] args) {
		
		String str="Vithal Nivargi";
		String str1="";
		int length = str.length();
		
		
		for(int i=length-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
		
		System.out.println("by using StringBuffer..");

		//Another way
		String st="vithal";
		StringBuffer sb=new StringBuffer(st);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
		
		//Another way
				String st1="Nivargi";
				StringBuffer sbb=new StringBuffer(st1);
				StringBuffer reverseb = sbb.reverse();
				
				System.out.println(reverseb);

	
	
	}
	
	
	
}
