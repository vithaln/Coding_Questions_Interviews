package com.code.withVithal.impppp;

public class Java8LambdaExpression {
public static void main(String[] args) {
	//implement functional interface in traditional way
	
	Java8LambdaExpressionFunctionalinterface d=new Java8LambdaExpressionFunctionalinterface() {
		
		@Override
		public int draw(int x) {
			System.out.println("this is without Lambda expresion way "+x);
			return x;
		}
	};
	d.draw(56);
	
	//by using Lambda expression
	
	Java8LambdaExpressionFunctionalinterface d1=(x)->{
	System.out.println("This is by using lambda expresion "+x);
	return x;
	};
	d1.draw(65);
}
}
