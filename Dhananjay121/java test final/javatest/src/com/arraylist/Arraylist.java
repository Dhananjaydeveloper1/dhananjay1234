package com.arraylist;

import java.util.ArrayList;
import java.util.List;

class Employee{
	public int id;
	public String name;
	public String address;
	public String salary;
	public static int count=0;
	public Employee() {}
	public Employee(int id,String name,String address,String salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
	public int getID()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public String getaddress()
	{
		return address;
	}
	public String getsalary()
	{
		return salary;
	}
}
public class Arraylist {
	public static void main(String[] args)throws Exception
	{
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1,"Jyoti","#4346 Chandigarh","54335"));
		list.add(new Employee(2,"arushi","#34 Haryana","64335"));
		list.add(new Employee(3,"palak","#43 Sangarh","76335"));
		list.add(new Employee(4,"kalpana","#44 Ramgarh","24335"));
		list.add(new Employee(5,"isha","#334 Aligarh","4335"));
	for(Employee s:list)
	{System.out.print("Employee details are"+"--> ");
	System.out.println(s.getID()+" "+s.getname()+" "+s.getaddress()+" "+s.getsalary());
	}
	
	}
}

