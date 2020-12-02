package com.xworkz.constructor;

public class VehicleTester {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle("BMW","320i","2jul2020");
		String company=vehicle.getCompany();
		String no=vehicle.getChasisNo();
		String mfgDate=vehicle.getMfgDate();
		
		System.out.println(company);
		System.out.println(no);
		System.out.println(mfgDate);
		
		String color="red";
		vehicle.setColor(color);
		
		String owner="Stefan Quandt";
		vehicle.setOwnerName(owner);

	}

}

