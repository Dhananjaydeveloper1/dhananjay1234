package Interface;

interface ClassA{
	abstract public void Student();
		void book();
		void study();
		
	}
class Student1 implements ClassA{

	@Override
	public void Student() {
		// TODO Auto-generated method stub
		System.out.println("study for book");
	}

	@Override
	public void book() {
		// TODO Auto-generated method stub
		System.out.println("math");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("slow study");
	}
	
}

class ClassB implements ClassA{

	@Override
	public void Student() {
		// TODO Auto-generated method stub
		System.out.println(" study book");
	}

	@Override
	public void book() {
		// TODO Auto-generated method stub
		System.out.println("science");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("slow study");
	}
	
}

public class AbstractClass {
public static void main(String args[]) {
	Student1 s1=new Student1();
	ClassB b1=new ClassB();
	s1.Student();
	s1.book();
	s1.study();
	b1.Student();
	b1.book();
	b1.study();
	
}
}
