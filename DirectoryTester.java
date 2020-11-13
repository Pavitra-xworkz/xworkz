package com;

public class DirectoryTester {

	public static void main(String[] args) {

		System.out.println("jvm kareyuvudu main");

		System.out.println("Total items to search" + PhoneDirectory.totalItems());
		PhoneDirectory.search("PhoneNomber");

		System.out.println("main nirgamana");
	}

}

