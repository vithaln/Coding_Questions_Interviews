package com.code.java88888888888888888888;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WithoutLambdaBook {

	private int id;
	private String name;
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public WithoutLambdaBook(int id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return "WithoutLambdaBook [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	//main method
	public static void main(String[] args) {
		
		List<WithoutLambdaBook> list=new ArrayList<WithoutLambdaBook>();
		list.add(new WithoutLambdaBook(1, "java","pink"));
		list.add(new WithoutLambdaBook(2, "core java","red"));
		list.add(new WithoutLambdaBook(3, "ada java","pink"));
		list.add(new WithoutLambdaBook(4, "spring","green"));
		list.add(new WithoutLambdaBook(5, "spring-boot","white"));
		list.add(new WithoutLambdaBook(6, "microservice","blue"));
		list.add(new WithoutLambdaBook(7, "xaaa","blue"));
		list.add(new WithoutLambdaBook(8, "aaaa","RED"));
		System.out.println("ORIGINAL LIST");
		System.out.println(list);
		System.out.println("AFTER SORT");
		Collections.sort(list,new MyComparator());
		System.out.println(list);
	}
	
}

class MyComparator implements Comparator<WithoutLambdaBook>{

	@Override
	public int compare(WithoutLambdaBook o1, WithoutLambdaBook o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}