package com.xworkz.constructor;

public class Vehicle {

private String company;
private String chasisNo;
private String mfgDate;
private String color;
private String ownerName;


public Vehicle(String company,String chasisNo,String mfgDate) {
	this.company=company;
	this.chasisNo=chasisNo;
	this.mfgDate=mfgDate;
}

public String getCompany() {
	return company;
}


public String getChasisNo() {
	return chasisNo;
}

public String getMfgDate() {
	return mfgDate;
}


public void setColor(String color) {
	this.color = color;
	System.out.println("vehicle color is: "+color);
}


public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
	System.out.println("company owner is: "+ownerName);
}

}
