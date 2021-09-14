package com.Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashmapDemo1 {
	public static void main(String arg[]) {
		Map<String, String> mp = new LinkedHashMap<String, String>();
		mp.put("sk","pk");
		mp.put("RR", "pp");
		mp.put("cc", "aq");
		Iterator<String> itr=mp.keySet().iterator() ;
		while(itr.hasNext()) {
		String valuedemo=itr.next();
		
		
		String valuedemo1 = mp.get(valuedemo);
		
		System.out.println("key=" + valuedemo + "values=" + valuedemo1);

	}
}
}