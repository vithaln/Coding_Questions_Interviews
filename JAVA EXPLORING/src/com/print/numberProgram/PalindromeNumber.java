package com.print.numberProgram;

public class PalindromeNumber {

	
	public static void main(String[] args) {
		//write programm to print palindrome number...
		
		int num=545;
		int n=num;
		int rem;
		int rev=0;
		
		while(num!=0) {
			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		
		if(rev==n) {
			System.out.println("This is palindrome number...");
		}
		else {
			System.out.println("This is not Palindroome number..");
		}
	}
}
