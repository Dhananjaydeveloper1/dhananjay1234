package io.Exception;

public class MutilpleCatchBlockDemo {
public static void main(String args[]) {
	
	int array[]= {1,2,3,4,5,5};
	try {
		System.out.println(array[3]);
	}
	catch(ArithmeticException e) {
		System.out.println("enter the array:" +e);
		
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("come back soon:"+e);
		}
	}
}

