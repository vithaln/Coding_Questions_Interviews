package com.java8.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AssendingOrderandDesendingOrder2 {

	
	public static void main(String[] args) {
		
		
		
		
	System.out.println("**************************************");
	
	List<Employee2> emplist=new ArrayList<Employee2>();
	emplist.add(new Employee2(1, "vithal", 23, 25000.52));
	emplist.add(new Employee2(2, "mahesh", 25, 5687.52));
	emplist.add(new Employee2(3, "subhash", 33, 7852.52));
	emplist.add(new Employee2(4, "viki", 56, 258000.52));
	emplist.add(new Employee2(5, "sahnkar", 3, 8688.52));
	emplist.add(new Employee2(6, "rahul", 93, 5868.52));
	emplist.add(new Employee2(7, "sanket", 83, 65565.52));
	emplist.add(new Employee2(8, "ajay", 87, 333.52));
	emplist.add(new Employee2(7, "zia", 53, 253.52));

	
		System.out.println(emplist);
		System.out.println("==========sort by age");
	List<Employee2> collect = emplist.stream().sorted((o1,o2)->o1.getAge()-o2.getAge()).collect(Collectors.toList());
	
	System.out.println(collect);
	// 2nd way....
	List<Employee2> collects = emplist.stream().sorted(Comparator.comparingLong(Employee2::getAge)).collect(Collectors.toList());
	
	System.out.println(collects);
	
	
	
	//desending oreder....
	System.out.println("==========desend by age");
	List<Employee2> collectt = emplist.stream().sorted((o1,o2)->o2.getAge()-o1.getAge()).collect(Collectors.toList());
	
	System.out.println(collectt);
	// 2nd way....
	List<Employee2> collectss = emplist.stream().sorted(Comparator.comparingLong(Employee2::getAge).reversed()).collect(Collectors.toList());
	
	System.out.println(collectss);
	//age above 50
	List<Employee2> collect2 = emplist.stream().filter(a->a.getAge()>50).collect(Collectors.toList());
	System.out.println(collect2);
	
	//sort by name
	
	System.out.println("sort by name");
	List<Employee2> collect3 = emplist.stream().sorted(Comparator.comparing(Employee2::getName)).collect(Collectors.toList());
	System.out.println(collect3);
	
	//desend order by name
	List<Employee2> collect4 = emplist.stream().sorted(Comparator.comparing(Employee2::getName).reversed()).collect(Collectors.toList());
	System.out.println(collect4);
	
	//who's name strats with 'v' 
	List<Employee2> collect5 = emplist.stream().filter(n->n.getName().startsWith("v")).collect(Collectors.toList());
	System.out.println(collect5);
	
	//find name who's name ends with 'y'
	List<Employee2> collect6 = emplist.stream().filter(n->n.getName().endsWith("y")).collect(Collectors.toList());
	System.out.println(collect6);
	
	//find emps who's salary is greatethan 20k
	List<Employee2> collect7 = emplist.stream().filter(s->s.getSalary()>20000).collect(Collectors.toList());
	System.out.println(collect7);
	
	//find emps who's salary is lessthan 20k
		List<Employee2> collect8 = emplist.stream().filter(s->s.getSalary()<20000).collect(Collectors.toList());
		System.out.println(collect8);
		
	
	
	
	
	}
	
}
