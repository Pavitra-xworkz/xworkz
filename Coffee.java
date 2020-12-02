package com.xworkz.constructor;

public class Coffee {
	
	public String coffeePowerderName="BRU";
	public int price=200;
public Coffee(String name,int coffeePrice)
{
	System.out.println("Invoked Coffie Constructor");
	
	System.out.println("argument 1::"+coffeePowerderName);
	System.out.println("argument 2::"+price);
	coffeePowerderName=name;
	price=coffeePrice;
	
	System.out.println("argument 1 value After::" +name);
	System.out.println("argument 2 value After::" +coffeePrice);
	
}

}

