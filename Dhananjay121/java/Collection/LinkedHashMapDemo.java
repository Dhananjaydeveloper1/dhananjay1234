package com.Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
// //Map<STring, String> mapdemp = new LinkedHashMap<Integer, String>()
//Map<STring, integer> mapdemp = new LinkedHashMap<Integer, String>()
public class LinkedHashMapDemo {

	public static void main(String[] args) {
	
		 Map<Integer, String> mapdemp = new LinkedHashMap<Integer, String>();
	        mapdemp.put(1, "ankit");
	        mapdemp.put(2, "ram");
	        mapdemp.put(3, "tom");
	        mapdemp.put(4, "ankit");
	       
	        // converting into key and take the key from give list
	      //  1 2 3 4
	        Iterator<Integer> itr = mapdemp.keySet().iterator();

	        while (itr.hasNext()) {

	            Integer keydemo = itr.next();


	            String valuedemo = mapdemp.get(keydemo);


	            System.out.println("key   " + keydemo + "values" + valuedemo);
	        }

	    }
	}


