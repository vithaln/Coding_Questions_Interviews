package com.java.unionElements.arrys;

import java.util.HashSet;
import java.util.Set;

public class Unionelemrnts {
	
	public static void main(String[] args) {
		
		
		int ar1[]
				= {41,12,15,41,65,63};
		
		
		int ar2[]
				= {41,12,458,41,65,85685};
		
		unionElementsintwoArrrays(ar1,ar2);
	}
		static void unionElementsintwoArrrays(int ar1[],int ar2[])
		{
			Set<Integer>s=new HashSet<Integer>();
			
			for(int i=0;i<ar1.length;i++) {
				s.add(ar1[i]);
			}
			for(int i=0;i<ar2.length;i++) {
				s.add(ar2[i]);
			}
			System.out.print(s);
			
			
			
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
