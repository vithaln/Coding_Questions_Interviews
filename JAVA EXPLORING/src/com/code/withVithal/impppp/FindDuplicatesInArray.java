package com.code.withVithal.impppp;

public class FindDuplicatesInArray {
public static void main(String[] args) {
	
	int a[]= {12,65,15,12,89,15,89,16,95,6,56,96,5263,6};
	
	for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]==a[j]) {
				
				System.out.print(a[i]+" ");
			}
		}
	}
}
}
