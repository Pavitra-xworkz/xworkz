package com.xworkz.constructor;

public class Country {
	public String name;
	public String nationalPortal;
	public byte noOfColorsInFlag;
	public byte noOfStates;
	public String primeMinisterName;
	public String nationalGame;
	public short republicOfIndia;
	public String nationalBird;
public Country(String nameOfcountry,String portal,byte color,byte states,String nameOfPrimeMinister,String game,short republicYear,String bird)
{
	System.out.println("name of the country::" +nameOfcountry);
	System.out.println("national portal::" +portal);
	System.out.println("number of colors in flag::" +color);
	System.out.println("number states ::" +states);
	System.out.println("name of prime minister::" +nameOfPrimeMinister);
	System.out.println("game::" +game);
	System.out.println("year of republic::" +republicYear);
	System.out.println("Bird name::" +bird);
	
	name=nameOfcountry;
	nationalPortal=portal;
    noOfColorsInFlag=color;
	noOfStates=states;
    primeMinisterName=nameOfPrimeMinister;
    nationalGame=game;
    republicOfIndia=republicYear;
	nationalBird=bird;
	
	System.out.println("name After::" +name);
	System.out.println("national portal After::" +portal);
	System.out.println("number of colors in flag After::" +name);
	System.out.println("number states After::" +states);
	System.out.println("name of prime minister After::" +nameOfPrimeMinister);
	System.out.println("game After::" +game);
	System.out.println("year of republic After::" +republicYear);
	System.out.println("Bird name After::" +bird);
	
	
	
}

	

}
