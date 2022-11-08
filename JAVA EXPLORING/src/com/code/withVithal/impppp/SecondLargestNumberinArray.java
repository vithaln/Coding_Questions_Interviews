package com.code.withVithal.impppp;

import java.util.Arrays;

public class SecondLargestNumberinArray {
	
	//public static void printLargestNumber(int arr[]) {
/*		
		int length = arr.length;
		if(length<2) {
			
			System.out.println("Invalid array");
			return;
		}
		else {
			Arrays.sort(arr);
			
			for(int i=length-2;i>=0;i--) {
				
				if(arr[i]!=arr[length-1]) {
					System.out.println("The second largest number is : "+ arr[i]);
					
					return;
				}
			}
		}
		
	}
public static void main(String[] args) {
	
	
	int arr[]= {12,56,285,12,8,52,110,21,4,15,10,21,02,58,54545};
	
	printLargestNumber(arr);
*/
		public static void main(String[] args) {
			
		int ar[]= {12,54,32,65,25,8,15,66,52,66};
		
		printSecondLargestnumbaer(ar);
}

	private static void printSecondLargestnumbaer(int[] ar) {


		int size = ar.length;
		if(size<2) {
			System.out.println("Invalid Array...");return;
		}
		else {
			for(int i=size-2;i>=0;i--) {
				
				if(ar[i]!=ar[size-1]) {
					System.out.println(ar[i]);return;
				}
			}
		}
	}

}
