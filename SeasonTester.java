package com.xworkz.constructor;

public class SeasonTester {

	public static void main(String[] args) {
		Season season=new Season();
		System.out.println(season.name);
		System.out.println(season.startMonth);
		
		Season season1=new Season("Summer","March");
		System.out.println(season1.name);
		System.out.println(season1.startMonth);
		
		Season season2=new Season("Rainy","june");
		System.out.println(season2.name);
		System.out.println(season2.startMonth);
		
		Season season3=new Season("Wintter","Nov");
		System.out.println(season3.name);
		System.out.println(season3.startMonth);



	}

}
