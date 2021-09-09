package DemoConstructor;

public class SuperClass {
	int num = 100;
	public static void main(String args[]) {

		Subclass subclass = new Subclass();
		subclass.printNumber();

	}
}

class SuperClassA {
	int num = 110;

	void printNumber() {
		System.out.println(num);

	}

	
}

class Subclass extends SuperClassA {
	int num = 110;

	void printNumber() {
		super.printNumber();
		
		System.out.println(num);

	}

	
}
