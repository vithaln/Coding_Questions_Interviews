package com.java.mapAdFlatMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpMain {

	public static void main(String[] args) {
		System.out.println("**Map function**");
		
		List<String> city=new ArrayList<String>();
		city.add("pune");
		city.add("sangli");
		city.add("kolhapur");
		city.add("banglore");
		city.add("hyderabad");

		Employee e1=new Employee(1,"vikki",city);
		System.out.println("All employees details as below...");
		System.out.println(e1);
		
		//'''''''''''''''''
		List<String> cityss=new ArrayList<String>();
		cityss.add("sonyal");
		cityss.add("miraj");
		cityss.add("karad");
		cityss.add("banglore");
		cityss.add("hyderabad");

		Employee e2=new Employee(2,"mahesh",cityss);
		System.out.println("All employees details as below...");
		System.out.println(e2);
		 
		//''''''
		List<String> citysss=new ArrayList<String>();
		citysss.add("hyderbad");
		citysss.add("phalatan");
		citysss.add("pune");
		citysss.add("jath");
		citysss.add("satar");

		Employee e3=new Employee(3,"vithal",citysss);
		System.out.println("All employees details as below...");
		System.out.println(e3);
		
		System.out.println("**********************************");
		
		List<Employee> employeesList=new ArrayList<Employee>();
		employeesList.add(e1);
		employeesList.add(e2);
		employeesList.add(e3);
		System.out.println(employeesList);
		
		System.out.println("All employee ids print");
		List<Integer> empByids = employeesList.stream().map(e->e.getEmp_Id()).collect(Collectors.toList());
		System.out.println(empByids);
		
		System.out.println("all employee get by name");
		List<String> empsname = employeesList.stream().map(e->e.getEmp_Name()).collect(Collectors.toList());
		System.out.println(empsname);
		
		System.out.println("all employees get by citytheywoked..");
		  Set<List<String>> allempscity = employeesList.stream().map(e->e.getCityTheyworked()).collect(Collectors.toSet());
		System.out.println(allempscity);
		
		System.out.println("by using Flatmap function get all city they worked..");
		
		Set<String> empscitytheyworked = employeesList.stream().flatMap(e->e.getCityTheyworked().stream()).collect(Collectors.toSet());
		System.out.println(empscitytheyworked);
		
		System.out.println("====MAP=========");
		Map<Integer, String > mp=new HashMap<Integer, String>();
				
		mp.put(1, "JAVA");
		mp.put(null, "demo");
		mp.put(1, "Spring Boot");
		
		
		System.out.println(mp);
		/*
		 * for(Map.Entry<Integer, String> mpp:mp.entrySet()) {
		 * System.out.println(mpp.getKey() +" " +mpp.getValue()); }
		 */
		
;
		}
}
