
  package com.code.withVithal.impppp;
  
  public class ReverseSentanceWithoutInBuiltMethods {
  
  public static void main(String[] args) {
  
		/*
		 * String str="Vithal is My Name"; str=str+" "; String word="",revesen="";
		 * 
		 * for(int i=0;i<str.length();i++) {
		 * 
		 * char ch = str.charAt(i); if(ch!=' ') {
		 * 
		 * word=word+ch; } else { revesen=word+" "+revesen; word=""; } }
		 * System.out.println(revesen);
		 * 
		 */
	  
	  String str="Vithal Nagappa Nivargi";
	  str=str+" ";
	  
	  String revesen="",word="";
	  
	  for(int i=0;i<str.length();i++) {
		  
		  char ch = str.charAt(i);
		  
		  if(ch!=' ') {
			  word=word+ch;
		  }
		  else {
			  revesen=word+" "+revesen;
			  word=" ";
		  }
	  }
	  System.out.println(revesen);
  } }
 