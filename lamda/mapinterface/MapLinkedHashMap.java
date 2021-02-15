package com.xworkz.lamda.mapinterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapLinkedHashMap {
	public static void main(String[] args) {
		Map<String,String> map=new LinkedHashMap<String,String>();
		map.put("jio ho","Vijay Prakash");
		map.put("kabira","Arjith");
		map.put("Kali quarter bottle", "Vijay Prakash");
		map.put("Perfect", "Ed Shreeran");
		map.put("Happy", "All ok");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		entrySet.forEach(entry -> System.out.println("Song is : " + entry.getKey() + " Singer is:" + entry.getValue()));

		
		
	}
                                                                           
}
