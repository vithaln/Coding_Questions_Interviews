package com.code.withVithal.impppp;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int a[]= {12,1,5,2,5,8,41,6,53,4,98,3845,42,8,2,7};
		
		
		//sort array without any in-built method
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");

		}
		
	
	}
}
