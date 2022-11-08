package com.sort.comp;

public class Employe {
	private int id;
	private String name;
	private String city;
	private String adress;
	
	
	
	
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Employe(int id, String name, String city, String adress) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.adress = adress;
	}
	public Employe() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", adress=" + adress + "]";
	}
	
	


}
