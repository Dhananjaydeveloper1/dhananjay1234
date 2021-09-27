package com.lambda;

class Employee {
	int empNo;
	String Name;
	int Age;
	String Location;

	public Employee(int empNo, String name, int age, String location) {
		super();
		this.empNo = empNo;
		this.Name = name;
		this.Age = age;
		this.Location = location;
	}

	void putData() {
		System.out.println("\n\tEmployee empno:" + empNo);
		System.out.println("\n\tEmploye Nmae:" + Name);
		System.out.println("\n\tEmployee Age: " + Age);
		System.out.println("\n\tEmployee Location:" + Location);
	}

	public static void main(String[] args) {
		Employee E = new Employee(4140, "Dhananjay", 22, "patna");
		E.putData();
	}

}
