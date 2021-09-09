package io.Exception;

public class ArithmaticExceptionDemo {
	public static void main(String args[]) {
	int a = 8;
	int b = 3;
	
	try
	{

		int c = a + b;
	 System.out.println(c);

	}catch(
	ArithmeticException e)
	{
		System.out.println("Enter the sum" + e);
	}

}}