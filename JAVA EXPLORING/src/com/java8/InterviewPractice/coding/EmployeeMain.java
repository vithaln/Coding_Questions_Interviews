package com.java8.InterviewPractice.coding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee(1, "xyz", "sangli", 125.5265));
		empList.add(new Employee(2, "abc", "kolhapur", 125.5265));
		empList.add(new Employee(3, "kails", "pune", 125.55));
		empList.add(new Employee(3, "lokesh", "sangli", 125.55));
		empList.add(new Employee(4, "shaaji", "mubsi", 125.5255565));
		empList.add(new Employee(5, "jaiay", "solapur", 125.5255565));
		empList.add(new Employee(6, "ojopa", "kolhapur", 125.5255565));
		empList.add(new Employee(7, "porat", "pune", 451534.5265));
	
		System.out.println(empList);
		System.out.println("**********************************************");
		
		//print all employess based on salary...
		Map<Double, List<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.toList()));
		
		collect.entrySet().forEach(entry->
		{
			System.out.println(entry.getKey() +""+ entry.getValue());

		}
		);
		System.out.println("===============================");
		Map<Double, Long> collect2 = empList.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.counting()));
		
		collect2.entrySet().forEach(entry->
		{
		System.out.println(entry.getKey()+"="+entry.getValue());
		}		
				);
		
		Optional<Employee> max = empList.stream().max(Comparator.comparing(Employee::getSalary));
	System.out.println("maximum salary" +max);
	
	Optional<Employee> min = empList.stream().min(Comparator.comparing(Employee::getSalary));
	System.out.println("minimum salary" +min);
	
	Map<String, Optional<Employee>> collect3 = empList.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
	
	System.out.println(collect3);
	}
}

class Employee{
	
	private int id;
	private String name;
	private String city;
	private Double salary;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, String city, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	
}