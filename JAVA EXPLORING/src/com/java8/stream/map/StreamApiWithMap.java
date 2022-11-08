package com.java8.stream.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamApiWithMap {

	public static void main(String[] args) {
		
		
		List<User> users=new ArrayList<User>();
		
		users.add(new User(1, "vikkki", "passward", "vikki1354@gmail.com"));
		users.add(new User(2, "hhkkki", "passward", "fdgfg@gmail.com"));
		users.add(new User(3, "violkki", "passward", "fgfg@gmail.com"));
		users.add(new User(4, "kki", "passward", "dfsd@gmail.com"));
		users.add(new User(5, "dfdgg", "passward", "yhy@gmail.com"));


		List<UserDto> userDto=new ArrayList<UserDto>();
		
		for(User user:users) {
			
			userDto.add(new UserDto(user.getId(), user.getUsername(), user.getEmail()));
		}
		
		for(UserDto dto:userDto) {
			//System.out.println(dto);
		}
		
		
		//stream and map
		
//		users.stream().map(new Function<User, UserDto>() {
//
//			@Override
//			public UserDto apply(User usr) {
//				// TODO Auto-generated method stub
//				return new UserDto(usr.getId(), usr.getUsername(), usr.getEmail());
//				
//			}
//		}
		//);
		//using lambda and stream-map
		users.stream().map((User usr)-> new UserDto(usr.getId(), usr.getUsername(), usr.getEmail()))
		.forEach(us->System.out.println(us));
				;
							
						
				
				
				
		
		
	
}

}
class User{
	
	private int id;
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", passward=" + passward + ", email=" + email + "]";
	}
	private String username;
	private String passward;
	private String email;
	public User(int id, String username, String passward, String email) {
		super();
		this.id = id;
		this.username = username;
		this.passward = passward;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
class UserDto{
	private int id;
	private String username;
//	private String passward;
	private String email;
	public UserDto(int id, String username, String email) {
		//super();
		this.id = id;
		this.username = username;
		//this.passward = passward;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	//public String getPassward() {
		//return passward;
	//}
	//public void setPassward(String passward) {
	//	this.passward = passward;
	//}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + "]";
	}

}