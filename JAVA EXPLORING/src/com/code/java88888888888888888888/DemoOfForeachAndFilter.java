package com.code.java88888888888888888888;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoOfForeachAndFilter {
public static void main(String[] args) {
	
	List<Employee> employees = Emps.getEmployees();
	System.out.println(employees);
	List<Employee> tax = employees.stream().filter(emp->emp.getSalary()<=100000).collect(Collectors.toList());
System.out.println(tax);
List<Employee> vvvv = employees.stream().filter(emp->emp.getName().startsWith("v")).collect(Collectors.toList());
System.out.println(vvvv);
System.out.println("========Tax USERS==>");
System.out.println(evaluateTaxUsers("kkk"));
}

private static List<Employee> evaluateTaxUsers(String input) {
	return (input.equalsIgnoreCase("tax"))
	
	?Emps.getEmployees().stream().filter(e->e.getSalary()>=200000).collect(Collectors.toList())
	:Emps.getEmployees().stream().filter(e->e.getSalary()<200000).collect(Collectors.toList());		
	
	
};
}
class Emps{
	
	public static List<Employee> getEmployees(){
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1, "vithal","IT", 7878.2326));
		list.add(new Employee(2, "mahesh","DEVOPS", 54555.2326));
		list.add(new Employee(3, "subhash","TESTER", 44454545.2326));
		list.add(new Employee(4, "sanket","BACKEND", 655233.2326));
		list.add(new Employee(5, "saanvi","FRONTEND", 877587.2326));
		list.add(new Employee(6, "avi","QA", 8775756.2326));
		list.add(new Employee(7, "rohit","FULLSTACK", 5656786987.2326));

		
		
		return list;
	}
}
 class Employee{

 private int id;
 private String name;
 private String depat;
 private Double salary;
 
 
public Employee(int id, String name, String depat, Double salary) {
	super();
	this.id = id;
	this.name = name;
	this.depat = depat;
	this.salary = salary;
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
public String getDepat() {
	return depat;
}
public void setDepat(String depat) {
	this.depat = depat;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", depat=" + depat + ", salary=" + salary + "]";
}
 
 
 }