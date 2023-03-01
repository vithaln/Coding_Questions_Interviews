package com.code.java88888888888888888888;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalClass {
public static void main(String[] args) throws Exception {
	
	List<Student> studs = StudentDB.getAllEMployess();
	System.out.println(studs);
	
	Optional<Object> empty = Optional.empty();
	System.out.println(empty);
	
	Student stud=new Student(1, "vikki", "vikki@gmail.com", "pwd");
	
	Optional<String> emailOpt = Optional.of(stud.getEmail());
	System.out.println(emailOpt);
	
	Optional<String> ofNullable = Optional.ofNullable(stud.getEmail());
	System.out.println(ofNullable.orElse("no email prsent vithal.."));
	
	Optional<String> ofNull = Optional.ofNullable(stud.getEmail());
	System.out.println(ofNull.map(String::toUpperCase).orElseGet(()->"default email"));
	
	
	
	
	System.out.println(StudentDB.getStudentByemail("vnni1256@gmail.com"));
	
	
	
	
	
	
	
}
}

class StudentDB{
	public static Student getStudentByemail(String email) throws Exception {
		
		List<Student> stds = StudentDB.getAllEMployess();
		
		return stds.stream().filter(c->c.getEmail().equals(email)).findAny().
				orElseThrow(()->new Exception("no email is present"));
	}
	
	
	public static List<Student> getAllEMployess(){
		return 
				Stream.of(
		
		new Student(1,"vithal", "vnni1256@gmail.com", "pwd"),
		new Student(2,"mahesh", "mn1256@gmail.com", "pwdd"),
		new Student(3,"saanvu", "email", "pswd")

		
		
		
		).collect(Collectors.toList());
				
				
				
	}
}
class Student{
	
	private int id;
	private String name;
	private String email;
	private String password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Student(int id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
