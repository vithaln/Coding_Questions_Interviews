package com.code.java88888888888888888888;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Vithal
 * 
 * map()-->is used to data transformation and return in stream of data.
 * it's mapping process One to one mapping
 *  Mapper function produces single value for each input
 * it is used to stream of values
 * 
 *  FlatMap()--is used to stream of stream of values
 *  it's one to many mapping
 *  mapper function producs multiple values for each input.
 * 
 *
 */
public class MapVsFlatMap {

	public static void main(String[] args) {
		
		List<String> customer = CusomerDB.getAllCustomers()
		.stream().map(c->c.getCity()).collect(Collectors.toList());
		System.out.println(customer);
	System.out.println("================================");
		List<List<String>> mobiles = CusomerDB.getAllCustomers().stream().map(c->c.getMobilNumbers()).collect(Collectors.toList());
	System.out.println(mobiles);
	System.out.println("=========================================");
	
	List<String> mobiless = CusomerDB.getAllCustomers()
	.stream().flatMap(c->c.getMobilNumbers().stream()).collect(Collectors.toList());
	System.out.println(mobiless);
	
	
	
	
	
	
	}
}
class CusomerDB{
	
	public static List<Customer> getAllCustomers(){
		
		return
				Stream.of(
						new Customer(1, "vithal", "sangli", Arrays.asList("9321254321","656595965","2131351534","13543552")),
						new Customer(2, "mahesh", "dangli", Arrays.asList("986354321","696595965","98531351534","13543552")),
						new Customer(3, "ramesh", "miraj", Arrays.asList("6566354321","96326595965","985311234","96113543552")),
						new Customer(4, "mahesh", "dangli", Arrays.asList("8855325331","66952595965","6785563353","9633543552"))

						
						
						).collect(Collectors.toList());
	}
}
class Customer{
	
	private int id;
	private String name;
	private String city;
	private List<String> mobilNumbers;
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
	public List<String> getMobilNumbers() {
		return mobilNumbers;
	}
	public void setMobilNumbers(List<String> mobilNumbers) {
		this.mobilNumbers = mobilNumbers;
	}
	public Customer(int id, String name, String city, List<String> mobilNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobilNumbers = mobilNumbers;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", mobilNumbers=" + mobilNumbers + "]";
	}
	
	
}