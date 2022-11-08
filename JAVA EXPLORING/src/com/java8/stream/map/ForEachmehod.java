package com.java8.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEachmehod {

	public static void main(String[] args) {
		
		//list
		List<Integer> list=Arrays.asList(15,489,58,36,95,84,78,49,12,5,5,662,51);
		System.out.println(list);
		
		//set
		Set<Integer> set=new HashSet<Integer>();
		set.add(45);
		set.add(65);
		set.add(89);
		set.add(98);
		set.add(26);
		set.add(45);
		set.add(26);
		
		System.out.println(set);
		
		
		//map
		System.out.println("====map=====");
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1, "vithal");
		map.put(2, "vikki");
		map.put(3, "subhash");
		map.put(4, "mahesh");
		map.put(1, "vikki");
		map.put(4, "kails");
		System.out.println(map);
		
		
		System.out.println("==employess=======");
		List<Employee> lists=new ArrayList<Employee>();
		lists.add(new Employee(1, "vithal", 25, "sangli", "male"));
		lists.add(new Employee(2, "subhi", 29, "miraj", "male"));
		lists.add(new Employee(3, "mahi", 28, "sonyal", "male"));
		lists.add(new Employee(3, "savi", 12, "kolapur", "female"));
		lists.add(new Employee(4, "mlai", 87, "pune", "male"));

		//System.out.println(lists);
		
		for(Employee emps:lists) {
			System.out.println(emps.getAge());
			//System.out.println(emps.getCity());
		}
		lists.stream().forEach((s)->{
			System.out.println(s.getName());
			});
	
		
	}
}

class Employee{
	
	private int id;
	private String name;
	private int age;
	private String city;
	private String gender;
	public Employee(int id, String name, int age, String city, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.gender = gender;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", gender=" + gender + "]";
	}
	
}