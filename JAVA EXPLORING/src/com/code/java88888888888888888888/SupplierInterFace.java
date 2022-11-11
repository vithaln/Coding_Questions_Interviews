package com.code.java88888888888888888888;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/*
 * public class SupplierInterFace implements Supplier<Integer>{
 * 
 * @Override public Integer get() {
 * 
 * return 8; } public static void main(String[] args) { Supplier<Integer>
 * sup=new SupplierInterFace(); Integer n = sup.get(); System.out.println(n);
 * 
 * }
 * 
 * 
 * }
 */

public class SupplierInterFace{
	public static void main(String[] args) {
	Supplier<Integer>sup=()->8;
	System.out.println("hello "+sup.get());
	
	List<String> list = Arrays.asList();
	String get = list.stream().findAny().orElseGet(()->"hi vithal!!");
System.out.println(get);
	}
	
	
}