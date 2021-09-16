package com.FinalDemo;
interface Ankit{ //return type
	String Ankit();
}

public class LambdaExpressionWithNoParameter {

	public static void main(String[] args) {
		
Ankit a1=()->{
	return "hello";
};
System.out.println(a1.Ankit());
	}
}

