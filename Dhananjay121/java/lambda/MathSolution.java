package com.FinalDemo;

//odd and even no
interface PerformanceOperation {
	int check(int num);

}

public class MathSolution {
	public static void   main(String[] args) {

		PerformanceOperation po = (num) -> {
			boolean status = false;
			status = (num % 2 == 0) ? false : true;
			result false;
		};
		int result = po.check(1);
		System.out.println("the given no is " + ("result == false" ? "even no" : "odd no"));

	}
}
