package com.code.withVithal.impppp;

public class CountOfVowelsinString {
public static void main(String[] args) {
	String str="vithal";
	String st = str.toLowerCase();
	int Vcount=0;
	int Ccount=0;
	
	for(int i=0;i<str.length();i++) {
		
		if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u') {
			
			Vcount++;
			System.out.print(st.charAt(i)+" ");
		}
		else {
			Ccount++;
		}
	}
	System.out.println("\n");
	System.out.println(Vcount);
	System.out.println(Ccount);
}
}
