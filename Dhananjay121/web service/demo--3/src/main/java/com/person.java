package com;

public class person {
	private String address;
	private String Name;
	private Integer Id;
	private String email;
	// TODO Auto-generated constructor stub
	  //Constructor
	 public person()
	 {
	 super();
	 }
	 //parameterize constructor
	 public person(Integer id,String name,String email,String address)
	 {
	 super();
	 this.Id=id;
	 this.Name=name;
	 this.email=email;
	 this.address=address;
	 }
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	
}
