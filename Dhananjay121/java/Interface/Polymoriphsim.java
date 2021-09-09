package Interface;

class Student{
	int id;
	String name;
	
	Student(String name,int id){
		System.out.println("this is diffault consteuctor");
	}
Student(int id,String name){
		System.out.println("Student Id : "+id + "\nStudent Name :"+name);
	}
	public void id() {
		// TODO Auto-generated method stub
		
	}
	
		
	}

public class Polymoriphsim {
public static void main (String args[]) {
	Student s=new Student("dk",1);
	s.id();
	Student s1=new Student(1,"dk");
	s1.id();
}
}
