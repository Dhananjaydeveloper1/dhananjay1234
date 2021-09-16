package com.FinalDemo;
//with parameters and return type
interface Say2 {

	String Say(String name);

}

public class LambdaExpressionWithSingleParameter {

	public static void main(String[] args) {
		Say2 s = (name) -> {

			return "my name is ." + name;
		};

		System.out.println(s.Say("dhananjay"));
	}

}
