package com.xworkz.constructor;

public class Season {
	public String name;
	public String startMonth;
	
	public Season() {
		System.out.println("invoked dafault");
	}
	
	public Season(String name,String startMonth) {
		System.out.println("invoked constructor");
		this.name=name;
		this.startMonth=startMonth;
	}

}
