package com.code.java88888888888888888888;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class WithLambdaBook {
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
	public WithLambdaBook(int id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "WithLambdaBook [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	//main method
	public static void main(String[] args) {
		
		List<WithLambdaBook> list=new ArrayList<WithLambdaBook>();
		list.add(new WithLambdaBook(1, "java","pink"));
		list.add(new WithLambdaBook(2, "core java","red"));
		list.add(new WithLambdaBook(3, "ada java","pink"));
		list.add(new WithLambdaBook(4, "spring","green"));
		list.add(new WithLambdaBook(5, "spring-boot","white"));
		list.add(new WithLambdaBook(6, "microservice","blue"));
		list.add(new WithLambdaBook(7, "xaaa","blue"));
		list.add(new WithLambdaBook(8, "aaaa","RED"));
		System.out.println("ORIGINAL LIST");
		System.out.println(list);
		System.out.println("AFTER SORT");
		list.stream().collect(Collectors.groupingBy(WithLambdaBook::getColor,Collectors.toList()));
	System.out.println(list);
	}
}
