package com.java.mapAdFlatMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Employee {

	private int emp_Id;
	private String emp_Name;
	private List<String> cityTheyworked;
	public Employee(int emp_Id, String emp_Name, List<String> cityTheyworked) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.cityTheyworked = cityTheyworked;
	}
	public Employee() {
		super();
	}
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public List<String> getCityTheyworked() {
		return cityTheyworked;
	}
	public void setCityTheyworked(List<String> cityTheyworked) {
		this.cityTheyworked = cityTheyworked;
	}
	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", cityTheyworked=" + cityTheyworked + "]";
	}
	
	
	
	
}
