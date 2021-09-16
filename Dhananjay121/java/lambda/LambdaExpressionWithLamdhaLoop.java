package com.FinalDemo;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionWithLamdhaLoop {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("tk");
		li.add("rk");
		li.add("dk");
		li.add("sk");

		li.forEach((n) -> System.out.println(n));

	}

}
