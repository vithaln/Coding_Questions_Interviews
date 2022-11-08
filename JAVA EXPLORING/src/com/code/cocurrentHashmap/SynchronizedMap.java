package com.code.cocurrentHashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMap {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String, String>();
		
		map.put("1", "Ravi");
		map.put("2", "saanvi");
		map.put("3", "sanket");
		map.put("4", "rohit");
		map.put("5", "vithal");
		
		//itrate map
		System.out.println(map);
		System.out.println("==========by using entryset()==========");
		for(Map.Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" :"+ entry.getValue());
			
		}
		//sysnchronizedMap
		Map<String, String> synchronizedMap = Collections.synchronizedMap(map);
		System.out.println(synchronizedMap);
		
	}
	
	
	
}
