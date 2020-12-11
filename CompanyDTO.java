package com.xworkz.DTO;

public class CompanyDTO {
	private String name;
	private String location;
	private String domain;
	private int noOfEmployees;
	private String website;
	private String type;

	public CompanyDTO() {
		System.out.println("created ComapanyDTO");
	}

	public CompanyDTO(String name, String location, String domain) {
		System.out.println("i st DTO constrctor");
		this.name = name;
		this.location = location;
		this.domain = domain;
	}

	public CompanyDTO(int noOfEmployees, String website, String type) {
		System.out.println("2nd DTO constrctor");
	    this.noOfEmployees = noOfEmployees;
		this.website = website;
		this.type = type;

	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getDomain() {
		return domain;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public String getWebsite() {
		return website;
	}

	public String getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setType(String type) {
		this.type = type;
	}

}
