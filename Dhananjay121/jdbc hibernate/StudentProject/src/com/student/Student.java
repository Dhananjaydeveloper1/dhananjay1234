package com.student;

public class Student {

	private int id;
	private String name;
	private int age;
	private String dept_name;
	private int salary;

	public Student() {

	}

	public Student(String name, int age, String dept_name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept_name = dept_name;
		this.salary = salary;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getdept_name() {
		return dept_name;
	}

	public void setdept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
