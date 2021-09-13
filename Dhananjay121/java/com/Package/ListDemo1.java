package com.Package;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo1 {
public static void main(String[] args) {
	ArrayList<String>arraylist= new ArrayList<String>();
	
		arraylist.add("Mohan");
		arraylist.add("dk");
		arraylist.add("rk");
		
		Iterator<String> itr= arraylist.iterator();
		 while(itr.hasNext()){
			 System.out.println(itr.next());
	}
}
}
