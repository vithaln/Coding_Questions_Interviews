package com.code1.imp.coding;

import java.util.Arrays;

public class SortArraysSingleForloop {
public static void main(String[] args) {
	
	int a[]= {12,15,3,621,15,9};
	System.out.println(Arrays.toString(sortOrder(a)));
	
}
public static int[] sortOrder(int a[]) {
	
	for(int i=0;i<a.length-1;i++) {
		
		if(a[i]>a[i+1]) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			i=-1;
		}
	}
	return a;
}
}
