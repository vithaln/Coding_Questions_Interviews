package com.java8.lambdaExpresion;

interface Shape{
	void reactanle();
}

class Reactangle implements Shape{

	@Override
	public void reactanle() {
		System.out.println("reactangle() method is called...");
		
	}
	

}
public class LambdaExpression {

	public static void main(String[] args) {
		
	Shape s =() ->{
			System.out.println("reactangle() method is called...");
			//s.reactanle();
			
		};
	}
}
