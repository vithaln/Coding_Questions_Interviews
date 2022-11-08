package com.print.numberProgram;

public class PrintPrimeNumber1_100 {

	public static void main(String[] args) {
		
		int i,j;
		
		/*
		 * for(i=2;i<100;i++) { boolean isprimeNumber=true; for(j=2;j<i;j++) {
		 * 
		 * if(i%j==0) { isprimeNumber=false; break; }
		 * 
		 * 
		 * } if(isprimeNumber) { System.out.print(i+ " "); }
		 * 
		 * 
		 * 
		 * }
		 */
		System.out.println("============");
		
		for(i=2;i<100;i++) {
			boolean isPrimeNumber=true;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					isPrimeNumber=false;
				}
			}
			if(isPrimeNumber) {
				System.out.print(i+" ");
			}
		}
	}
}
