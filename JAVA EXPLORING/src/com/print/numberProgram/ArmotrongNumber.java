package com.print.numberProgram;

public class ArmotrongNumber {

	public static void main(String[] args) {
		
		int num=153;
		int n=num;
		int rem;
		int rev=0;
		
		while(num!=0) {
			rem=num%10;
			rev=rev+rem*rem*rem;
			//rev=rev*10*10*10;
			num=num/10;
			
		}
		System.out.println(rev);
		
		if(rev==n) {
			System.out.println("This is Armostrong Number..");
		}
		else {
			System.out.println("This is Not Armostrong Number");
		}
	}

}
