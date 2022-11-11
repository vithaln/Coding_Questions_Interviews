package com.code.java88888888888888888888;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* traditional way -->
 * 
 * public class ConsumerInterfaceDemo implements Consumer<Integer>{
 * 
 * @Override public void accept(Integer t) { System.out.println("Hello "+t);
 * 
 * } public static void main(String[] args) { ConsumerInterfaceDemo
 * consumerInterfaceDemo=new ConsumerInterfaceDemo();
 * consumerInterfaceDemo.accept(65); }
 * 
 * }
 */
public class ConsumerInterfaceDemo{
	
	public static void main(String[] args) {
		
		Consumer<Integer> cons=t->System.out.println("hello "+t);	
		cons.accept(85);
		
		List<Integer> list = Arrays.asList(12,15,356,145,2,6,7);
		//list.stream().forEach(System.out::println);
		list.stream().forEach(t->System.out.println("print "+t));
	}
}