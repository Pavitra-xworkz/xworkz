package com.xworkz;

public class StringTester {

	public static void main(String[] args) {
		String CountryName="india";
		System.out.println("Country name:"+CountryName);
		
		int size=CountryName.length(); 
		System.out.println("length:"+size);
		
		CountryName=CountryName.toUpperCase();
		System.out.println("UpperCase:"+CountryName);
		
		CountryName=CountryName.toLowerCase();
		System.out.println("LowerCase:"+CountryName);
		
		char letter=CountryName.charAt(4);
		System.out.println("letter at index 4:"+letter);
		
		String Name=CountryName.substring(3);
		System.out.println("Sub String:"+Name);
		
		String Nature=" is mind blowing nature in";
		CountryName=Nature.concat(" india?");
		System.out.println("concated string:"+CountryName);
		
		String Pride="india";
		if(CountryName==Pride) {
			System.out.println( "both are same String");
		}
		else {
			System.out.println( "both are  not same String");
			
		}
		
		CountryName="";
		boolean value=CountryName.isEmpty();
		System.out.println(value);
		
		CountryName="null";
		value=CountryName.isEmpty();
		System.out.println(value);
		
		
		

	}

}
