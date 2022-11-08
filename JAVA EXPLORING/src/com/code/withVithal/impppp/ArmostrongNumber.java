package com.code.withVithal.impppp;

public class ArmostrongNumber {

	public static void main(String[] args) {
		int n=153;
		int num=n;
		
		int rem;
		int rev=0;
		while(n!=0) {
			rem=n%10;
			rev=rev+rem*rem*rem;
			n=n/10;
		}
		/* System.out.println(rev); */
		if(rev==num) {
			System.out.println("This is Armostrong number");
		}
		else
			System.out.println("this is  not armostong number");
	}
}
