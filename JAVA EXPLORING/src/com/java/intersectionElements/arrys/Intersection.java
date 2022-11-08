package com.java.intersectionElements.arrys;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

	
	public static void main(String[] args) {
		
		int arr1[]= {12,51,12,456,12,4};
		int arr2[]= {14,15,51,14,16,12,4};
		
	
		printIntersection(arr1,arr2);
	}
	//find the duplicate elements in two arrays
	
	static void printIntersection(int arr1[],int arr2[]) {
	Set<Integer> s=new HashSet<>();
	
	for(int i=0;i<arr1.length;i++) {
		s.add(arr1[i]);
		
	}
	for(int i=0;i<arr2.length;i++) {
		
		if(s.contains(arr2[i])) {
		System.out.print(arr2[i]+" ");
		}
	}
	
	}
	
	
}
