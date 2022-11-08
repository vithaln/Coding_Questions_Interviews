package com.code.withVithal.impppp;

public class FibonaciiSeries {

	public static void main(String[] args) {
		int n = 10;
		int n1, n2;
		n1 = 0;
		n2 = 1;
		
		System.out.println(n1);
		System.out.println(n2);
		
		int i=1;
		while(i<=n) {
			int n3 = n1 + n2;
	
			n1=n2;
			n2=n3;
			i++;
			System.out.println(n3);
	
			
		}
		

	}

}
