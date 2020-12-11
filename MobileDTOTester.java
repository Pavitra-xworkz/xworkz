package com.xworkz.DTO;

public class MobileDTOTester {

	public static void main(String[] args) {

		MobileDTO dto = new MobileDTO();
		System.out.println(dto.getModelName());

		MobileDTO dto1 =new MobileDTO("Realme7","white","64MP",15000,5000);
		System.out.println(dto1.getModelName());
		System.out.println(dto1.getColor());
		System.out.println(dto1.getCameraPixel());
		System.out.println(dto1.getPrice());
        System.out.println(dto1.getBatteryBackup());
	

        MobileDTO dto2 =new MobileDTO( (byte)8,"External");
		System.out.println(dto2.getSize());
		System.out.println(dto2.getStorage());
		
		

	}

}

