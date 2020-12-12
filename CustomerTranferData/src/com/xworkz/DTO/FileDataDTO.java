package com.xworkz.DTO;

import java.util.Date;

public class FileDataDTO {

	private String name;
	private double size;
	private String type;
	private String location;
	private Date createdDate;

	public FileDataDTO() {
		System.out.println("default const");
	}

	public FileDataDTO(String name, double size) {
		System.out.println("Created FileDTO");
		this.name = name;
		this.size = size;
	}

	public FileDataDTO(String name, double size, String type, String location, Date createdDate) {
		this.name = name;
		this.createdDate = createdDate;
		this.location = location;
		this.size = size;
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getName() {
		return name;
	}

	public double getSize() {
		return size;
	}

	public String getType() {
		return type;
	}

	public String getLocation() {
		return location;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

}
