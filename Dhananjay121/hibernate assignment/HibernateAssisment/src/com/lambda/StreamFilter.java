package com.lambda;

import java.util.ArrayList;
import java.util.List;


class StreamEmployee {
private String name;
private String location;
private int salary;
public StreamEmployee(String name, String location,int salary ) {
	super();
	this.name = name;
	this.location = location;
	this.salary = salary;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}
public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<StreamEmployee> empList=new ArrayList<>();
empList.add(new StreamEmployee("Rk","patna",5000));
empList.add(new StreamEmployee("pk","pune",7000));
empList.add(new StreamEmployee("rk","gurugram",8000));
empList.stream().filter(emp->emp.getLocation()=="pune").forEach(System.out::println);
	}

}
