package com.code1.imp.coding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorUse {

	
	public static void main(String[] args) {
	User usr=new User(1, "vithal", "sangli");
	User usr1=new User(2, "mahesh", "kolp");
	User usr2=new User(3, "sasanvi", "sangli");
	User usr3=new User(4, "sanket", "sangli");
	User usr4=new User(5, "gaopi", "sangli");

		List<User> li=new ArrayList<User>();
		li.add(usr);
		li.add(usr1);
		li.add(usr2);
		li.add(usr3);
		li.add(usr4);
		System.out.println(li);
		System.out.println(li);System.out.println("=========");
		List<User> collect = li.stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
		
		System.out.println(collect);
		System.out.println("=======");
	}
}
