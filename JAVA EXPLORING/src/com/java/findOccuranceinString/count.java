
package com.java.findOccuranceinString;

import java.util.HashMap;
import java.util.Map;

public class count {

	public static void main(String[] args) {
		String str="vikkikikkkgfg";
		
		Map<Character, Integer> mp=new HashMap<Character, Integer>
		();
		
	for(int i=str.length()-1;i>=0;i--) {
		
		if(mp.containsKey(str.charAt(i))) {
			int count=
			mp.get(str.charAt(i));
			mp.put(str.charAt(i),++count);
		}
		else {
			mp.put(str.charAt(i),1);
		}
	}
	System.out.println(mp);
	}
}
