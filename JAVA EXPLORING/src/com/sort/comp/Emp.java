package com.sort.comp;

import java.util.ArrayList;
import java.util.Collections;

public class Emp {

	public static void main(String[] args) {

		/*
		 * ArrayList<Integer> emp=new ArrayList<Integer>(); emp.add(14); emp.add(45);
		 * emp.add(10); emp.add(3); System.out.println(emp);
		 */

//sort
		/*
		 * Collections.sort(emp); System.out.println(emp);
		 */

//;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
System.out.println("By using comparable..");

ArrayList<Employee> emps=new ArrayList<Employee>();
emps.add(new Employee(1,"vithal","sangli","sonyal"));
emps.add(new Employee(2,"mahesh","sangli","sonyal"));
emps.add(new Employee(3,"subhash","sangli","sonyal"));
emps.add(new Employee(4,"saanvi","sangli","sonyal"));

System.out.println(emps);
System.out.println("----------------------");
Collections.sort(emps);
System.out.println(emps);



//;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
System.out.println("By using comparator..");

ArrayList<Employe> emp=new ArrayList<Employe>();
emp.add(new Employe(1,"vithal","sangli","sonyal"));
emp.add(new Employe(2,"mahesh","sangli","arvi"));
emp.add(new Employe(3,"subhash","sangli","kolp"));
emp.add(new Employe(4,"saanvi","sangli","baramati"));
emp.add(new Employe(5,"ashok","sangli","chiplun"));


System.out.println(emp);
System.out.println("----------------------");
Collections.sort(emp,new NameWiseSort());
System.out.println(emp);

System.out.println("-------------by adress---------");
Collections.sort(emp,new AdressWiseComp());
System.out.println(emp);
	}

}
