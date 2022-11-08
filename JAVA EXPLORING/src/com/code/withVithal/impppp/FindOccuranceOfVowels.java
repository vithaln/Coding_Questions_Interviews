package com.code.withVithal.impppp;

public class FindOccuranceOfVowels {

	public static void main(String[] args) {
		
		String st="Vithal Nagappa Nivargi";
		 st = st.toLowerCase();
		int Vcount=0;
		int Ccount=0;
		for(int i=0;i<st.length();i++) {
			
			if(st.charAt(i)=='a'||st.charAt(i)=='i'||st.charAt(i)=='e'||st.charAt(i)=='o'||st.charAt(i)=='o') {
				Vcount++;
			}
			else if(st.charAt(i)>='a' && st.charAt(i)<='z') {
				Ccount++;
			}
		}
		System.out.println("Vowels are : "+Vcount);
		System.out.println("Consonants are : "+Ccount);
		
	}
}
