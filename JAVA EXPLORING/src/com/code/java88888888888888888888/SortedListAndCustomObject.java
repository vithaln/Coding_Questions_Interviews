package com.code.java88888888888888888888;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedListAndCustomObject {
	public static void main(String[] args) {

		// primitative data types below logic will be applicable for primitative data
		// types
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(66);
		list.add(8);
		list.add(98);
		list.add(2);
		list.add(77);
		System.out.println(list + " Original list");

		Collections.sort(list);// assending order
		System.out.println(list + " Assending Order");

		Collections.reverse(list);
		System.out.println(list + " Desending Order");

		System.out.println("CUSTOM OBJECT LOGIC");

		
		 System.out.println("+++++++++++++++++++++++++++++++++");
//lambda expression-->
		 
		  List<Employe> allEmps = EMP.getAllEmps();
		  //Collections.sort(allEmps,(o1,o2)->o1.getCity()-o2.getCity())));
		  allEmps.stream().sorted((o1,o2)->o2.getId()-o1.getId()).forEach(System.out::println);
		  System.out.println(allEmps);
		 System.out.println("+++++++++++++++++++++++++++++++++");

		List<Employe> lists = EMP.getAllEmps().stream().sorted(Comparator.comparingDouble(Employe::getSalary))
				.collect(Collectors.toList());
		System.out.println(lists + " sort by salary");

		List<Employe> li = EMP.getAllEmps().stream().sorted(Comparator.comparing(Employe::getDept))
				.collect(Collectors.toList());
		System.out.println(li + " sort by Department");

		Map<String, List<Employe>> l = EMP.getAllEmps().stream().collect(Collectors.groupingBy(Employe::getDept));
		System.out.println(l + " group by department");

	}
}

class EMP {
	public static List<Employe> getAllEmps() {

		List<Employe> list = new ArrayList<Employe>();
		list.add(new Employe(1, "vikki", "aa", "sangli", 12225643.5));
		list.add(new Employe(2, "vitu", "mech", "miraj", 552.5));
		list.add(new Employe(3, "ajay", "test", "kolha", 88888896.5));
		list.add(new Employe(4, "arfin", "mech", "karad", 45.5));
		list.add(new Employe(5, "mahewsh", "backend", "satar", 78.5));
		list.add(new Employe(6, "avi", "mech", "sonyal", 2.5));
		list.add(new Employe(7, "xadd", "zass", "uatagi", 78532655665566.5));

		return list;
	}
}


  class Employe { private int id; private String namre; private String dept;
  private String city; private Double salary;
  
  public Employe(int id, String namre, String dept, String city, Double salary)
  { super(); this.id = id; this.namre = namre; this.dept = dept; this.city =
  city; this.salary = salary; }
  
  public int getId() { return id; }
  
  public void setId(int id) { this.id = id; }
  
  public String getNamre() { return namre; }
  
  public void setNamre(String namre) { this.namre = namre; }
  
  public String getDept() { return dept; }
  
  public void setDept(String dept) { this.dept = dept; }
  
  public String getCity() { return city; }
  
  public void setCity(String city) { this.city = city; }
  
  public Double getSalary() { return salary; }
  
  public void setSalary(Double salary) { this.salary = salary; }
  
  @Override public String toString() { return "Employe [id=" + id + ", namre="
  + namre + ", dept=" + dept + ", city=" + city + ", salary=" + salary + "]"; }
  
  }
 