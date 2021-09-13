package com.Package;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {

		List<String> fruitlist = new ArrayList<String>();
		fruitlist.add("apple");
		fruitlist.add("banana");
		fruitlist.add("mango");

		for (String friutsloop : fruitlist) {

			System.out.println(" list of  friuit=" + friutsloop);
		}

	}

}
