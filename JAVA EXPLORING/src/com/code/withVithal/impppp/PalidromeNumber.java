package com.code.withVithal.impppp;

public class PalidromeNumber {
public static void main(String[] args) {
	
	int n=656;
	int rev=0;
	int re=n;
	
	while(n!=0) {
		
		int rem=n%10;
		 rev=rev*10+rem;
		n=n/10;
	}
	if(rev==re) {
		System.out.println("This palindrome");
	}
	else
	System.out.println("this is not palindrome number ");
}
}
