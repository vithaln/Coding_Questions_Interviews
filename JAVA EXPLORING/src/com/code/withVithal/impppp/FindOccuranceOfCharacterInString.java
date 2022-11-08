package com.code.withVithal.impppp;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindOccuranceOfCharacterInString {
public static void main(String[] args) {
	
	String str="VithalNagappaNivargi";
	char[] chars = str.toCharArray();
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	
	for(char ch:chars) {
		
		if(!map.containsKey(ch)) {
			map.put(ch, 1);
		}
		else {
			Integer cnt = map.get(ch);
			map.put(ch, cnt+1);
		}
	
	}
	System.out.println(map);
	
}
}
