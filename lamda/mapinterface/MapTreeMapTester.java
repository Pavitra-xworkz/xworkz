package com.xworkz.lamda.mapinterface;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class MapTreeMapTester {
	public static void main(String[] args) {
		Map<String,String>map=new TreeMap<String,String>(((a, b) -> b.compareTo(a)));
		/*here we used comparable method because 
		if we need assending order then no need to call comparable method 
		,if we want desending order then we camparable like((a, b) -> b.compareTo(a)); here b.compareto(a)means =desending 
		then a.compareto(b)=asending order.*/
		
		map.put("Jai ho", "Vijay Prakash");
		map.put("Kabira", "Arijith singh");
		map.put("Kali quarter bottle", "Vijay Prakash");
		map.put("Perfect", "Ed Shreeran");
		map.put("Happy Agide", "All Ok");
		
		Set<Entry<String,String>>entrySet=map.entrySet();
		entrySet.forEach(entry->System.out.println("Song is : " + entry.getKey() + " Singer is:" + entry.getValue()));
		map.forEach((k, v) -> System.out.println(k + " " + v));

		// Map map2;
		//  properties deal values froom file, which always will be string<String,String>
		Properties properties = new Properties();
		properties.setProperty("Name", "Email");
		properties.getProperty("Name");

		
		
	}

}
