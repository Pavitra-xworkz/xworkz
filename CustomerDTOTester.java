package com.xworkz.DTO;

public class CustomerDTOTester {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		CustomerDTO customerDTO1 = new CustomerDTO();
		customerDTO1.setName("Pavitra");
		customerDTO1.setCustomerId(1001);
		customerDTO1.setContactNo(8050201916l);
		customerDTO1.setEmail("pavitraxworkz@gmail.com");

		System.out.println(customerDTO1.getName());
		System.out.println(customerDTO1.getCustomerId());
		System.out.println(customerDTO1.getContactNo());
		System.out.println(customerDTO1.getEmail());
		System.out.println("**************************");
		

		CustomerDTO customerDTO2 = new CustomerDTO();
		customerDTO2.setName("laxmi");
		customerDTO2.setCustomerId(2001);
		customerDTO2.setContactNo(9080201917l);
		customerDTO2.setEmail("laxmi@gmail.com");

		System.out.println(customerDTO2.getName());
		System.out.println(customerDTO2.getCustomerId());
		System.out.println(customerDTO2.getContactNo());
		System.out.println(customerDTO2.getEmail());
		System.out.println("**************************");
		

		CustomerDTO customerDTO3 = new CustomerDTO();
		customerDTO3.setName("Rajani");
		customerDTO3.setCustomerId(3001);
		customerDTO3.setContactNo(5030201412l);
		customerDTO3.setEmail("rajani@gmail.com");

		System.out.println(customerDTO3.getName());
		System.out.println(customerDTO3.getCustomerId());
		System.out.println(customerDTO3.getContactNo());
		System.out.println(customerDTO3.getEmail());
		System.out.println("**************************");
	}

}
