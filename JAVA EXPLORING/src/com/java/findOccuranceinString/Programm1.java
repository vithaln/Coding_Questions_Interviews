package com.java.findOccuranceinString;

import java.util.HashMap;
import java.util.Map;

public class Programm1 {

	public static void main(String[] args) {
		String str="vithalnivargi";
		
		Map<Character, Integer> mp=new HashMap<Character, Integer>();
		
		for(int i=str.length()-1;i>=0;i--) {
			
			if(mp.containsKey(str.charAt(i))) {
				
				Integer count = mp.get(str.charAt(i));
				mp.put(str.charAt(i), ++count);
			}
			else {
				mp.put(str.charAt(i),1);
			}
		}
		System.out.println(mp);
	}
}
