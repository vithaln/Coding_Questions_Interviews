package com.java8.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AssendingOrderandDesendingOrder {

	
	public static void main(String[] args) {
		
		System.out.println("===========================");
		System.out.println(AssendingOrderandDesendingOrder.getAllemployes());

		//get emp details who's salary is greaterthan 50000
	List<Employee> emplist = getAllemployes().stream().filter(emp->emp.getSalary()>50000).collect(Collectors.toList());
	System.out.println(emplist);
	
	//get emps who's salary is greaterthan 30
		List<Employee> emplists = getAllemployes().stream().filter(emp->emp.getAge()>30).collect(Collectors.toList());
		System.out.println(emplists);
	
	
	
	
	
	
	}
	static List<Employee> getAllemployes() {
		
		List<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee(1, "vithal", 23, 25000.52));
		emplist.add(new Employee(2, "mahesh", 25, 5687.52));
		emplist.add(new Employee(3, "subhash", 33, 7852.52));
		emplist.add(new Employee(4, "viki", 56, 258000.52));
		emplist.add(new Employee(5, "sahnkar", 3, 8688.52));
		emplist.add(new Employee(6, "rahul", 93, 5868.52));
		emplist.add(new Employee(7, "sanket", 83, 65565.52));

		return emplist;
	}
}
