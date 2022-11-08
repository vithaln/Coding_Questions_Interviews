package com.jav8.lambdaExpression;


class Function implements java.util.function.Function<String, Integer>{

	@Override
	public Integer apply(String text) {
		
		return text.length();
	}
	
}
public class LambdaExpression {

	public static void main(String[] args) {
		
		Function function = new Function();
		
		System.out.println(function.apply("vithalNivargi"));
	}
	

	
	
	
}
