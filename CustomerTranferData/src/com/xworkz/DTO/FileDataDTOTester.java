package com.xworkz.DTO;

import java.util.Date;

public class FileDataDTOTester {

	public static void main(String[] args) {

		FileDataDTO dto = new FileDataDTO();
		System.out.println(dto.getName());
		System.out.println(dto.getCreatedDate());
		dto = new FileDataDTO("backup.jpg", 159.67);
		System.out.println(dto.getName());
		System.out.println(dto.getSize());
		System.out.println(dto.getCreatedDate());
		Date currentDate = new Date();
		// System.out.println(currentDate);
		dto.setCreatedDate(currentDate);
		System.out.println(dto.getCreatedDate());
		dto.setLocation("C://images");
		dto.setType("jpg");
		Date date = new Date();
		FileDataDTO dto3 = new FileDataDTO("xworkz.jpg", 100, "jpg", "C://images", date);

	}

}
