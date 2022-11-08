package com.code.withVithal.impppp;

import java.util.Arrays;

public class RemoveDuplicatesInArray {
public static void main(String[] args) {
	
	
	int []a= {12,65,25,18,45,96,36,61,84,75,61,65};
	
	/*
	 * for(int b:a) { System.out.print(b+" "); }
	 */
	
	for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]==a[j]) {
				a[i]=-1;
			}
		}

	}
	
	for(int i=0;i<a.length;i++) {
		if(a[i]!=-1) {
			System.out.print(a[i]+" ");

		}
	}
	
}
}
