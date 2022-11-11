package com.code.java88888888888888888888;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * public class PredicateInterfaceDemo implements Predicate<Integer> { public
 * static void main(String[] args) {
 * 
 * 
 * //Predicate<Integer> pred=(t)->
 * 
 * Predicate<Integer> pred = new PredicateInterfaceDemo();
 * System.out.println(pred.test(6)); }
 * 
 * @Override public boolean test(Integer t) { if(t%2==0) { return true; } else {
 * return false; }
 * 
 * } }
 */
public class PredicateInterfaceDemo{
	public static void main(String[] args) {
		Predicate<Integer> pred=t->t%2==0;System.out.println(pred.test(9));
		List<Integer> list = Arrays.asList(12,15,356,145,2,6,7,3,1);
		//different ways to print--->
		//list.stream().filter(i->i%2==0).forEach(System.out::println);
		list.stream().filter(i->i%2==0).forEach(t->System.out.print(t+" "));
	}
}