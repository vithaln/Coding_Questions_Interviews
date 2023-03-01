package com.code.reverseVowels.string;

public class ReverseWordsofSentance {


public static void main(String[] args) {
	
	String input="welcome to Vithal Nivargi";
	
	System.out.println(reverseWordsofSentance(input));
}

private static String  reverseWordsofSentance(String input) {

	String[] words = input.split(" ");
	
	String result="";
	
	for(int i=words.length-1;i>=0;i--) {
		if(i==0) {
			result=result+words[i];
		}else {
			result=result+words[i]+" ";
		}
	}
	
	return result;
}
}
