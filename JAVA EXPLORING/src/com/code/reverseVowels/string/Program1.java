package com.code.reverseVowels.string;

import java.util.Scanner;

class Program1{
	
	static boolean isVowel(char ch) {
		
		return ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'||ch=='A'||ch=='I'||ch=='O'||ch=='U'||ch=='E';
	}
	public static void main(String[] args) {
		System.out.println("please enter any string...");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] chh = str.toCharArray();
		int i=0;
		int j=chh.length-1;
		
		while(i<j) {
			if(!isVowel(chh[i])) {
				i++;
				continue;
			}
			if(!isVowel(chh[j])) {
			j--;
				continue;
			}
			char temp=chh[i];
			chh[i]=chh[j];
			chh[j]=temp;
			i++;j--;
			
			System.out.println(String.copyValueOf(chh));
			
		}
		 
	}
	
	
}