package io.Exception;

public class ThrowsDemo {
	static void validate(int age) throws ArithmeticException {

		if (age < 20) {
			throw new ArithmeticException(" not valid");
		}

	}

	public static void main(String ar[]) {

		try {
			validate(15);  
		} catch (Exception e) {

			System.out.println("clear all");
		}
	}

}
