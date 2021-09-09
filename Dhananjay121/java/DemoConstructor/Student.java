package DemoConstructor;

public class Student {
	Student(){  //zero contructor
	
	System.out.println("student details");
}

	 Student(int id, String name)//parametercontructor
	 {
		  
		System.out.println("Student id:" + id +"\nStudent name:"+ name); 
}
	 Student (int id,String name,int mobno) //overloading
	 {
		 System.out.println( "Student id:"+ id + "\nStudent name:"+ name + "\nStudent mobno :"+ mobno);
	 }
 public static void main(String args[]) {
	 Student student=new Student();
	 Student student1=new Student(1,"sk");
	 Student student2=new Student(2,"pk",746753753);
 }
}