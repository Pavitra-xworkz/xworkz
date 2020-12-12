package com.xworkz.DTO;


public class CompanyDTOTester {
	public static void main(String[] args) {
		CompanyDTO dto = new CompanyDTO();
		System.out.println(dto.getName());
		System.out.println("*******************");

		CompanyDTO dto1 = new CompanyDTO("Xworkz-ODc","Bangalore-Rajajinagar","Service-Based");
		System.out.println(dto1.getName());
		System.out.println(dto1.getLocation());
		System.out.println(dto1.getDomain());
		System.out.println("*******************");
		
		CompanyDTO dto2 = new CompanyDTO(5000,"www.xworkz.com","Government Aided");
		System.out.println(dto2.getNoOfEmployees());
        System.out.println(dto2.getWebsite());
		System.out.println(dto2.getType());

	}

}
