package com.print.numberProgram;

public class FibonaciiSeries {

	
	public static void main(String[] args) {
		//print upto 10 series...
		
		
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=3;i<=10;i++) {
			
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");	

		}
	}
}
