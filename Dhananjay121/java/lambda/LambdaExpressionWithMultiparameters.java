package com.FinalDemo;

interface Subtract { // with paramter
	int subtract(int a, int b, int c);
}

public class LambdaExpressionWithMultiparameters {

	public static void main(String[] args) {

		Subtract s1 = (a, b, c) -> (a - b - c);
		System.out.println(s1.subtract(30, 20, 10));
	}

}
