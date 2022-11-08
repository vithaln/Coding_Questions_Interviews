package com.code1.imp.coding;

import java.util.Arrays;
import java.util.Optional;

public class NullpointerException {

	
	public static void main(String[] args) {
		
		String[] str=new String[10];
		
		//System.out.println(Arrays.toString(str));//null,,null
		
		//System.out.println(str[4].toLowerCase());//Null Pointer exception....
	
	//handle null pointer exception
		
	
		Optional<String> ofNullable = Optional.ofNullable(str[4]);
		
if(ofNullable.isPresent()) {
	System.out.println(ofNullable.get().toLowerCase());
}
else {
	System.out.println("No value is present..");
}
	
	
	
	
	}
}
