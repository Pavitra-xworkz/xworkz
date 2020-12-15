package com.xworkz.dto2;

public class CarShowRoom {

	private String name;
	private String location;
	private Manager manager;

	public CarShowRoom() {
		System.out.println("CarShowRoom default const");
	}

	public CarShowRoom(String name, String location) {
		super();
		this.name = name;
		this.location = location;

	}

	public void addManager(String name, long contactNo) {
		if (name != null && contactNo > 0) {

			this.manager = new Manager(name, contactNo);
			System.out.println("manager added");

		} else {
			System.out.println("provide proper details");
			this.manager = null;
		}
	}

	public void addManager(Manager dto) {
		if (dto != null) {

			this.manager = dto;
			System.out.println("manager added");

		} else {
			System.out.println("manager  not added");
		}
	}

	public void displayManager() {

		if (this.manager != null) {
			System.out.println(this.manager.getName());
			System.out.println(this.manager.getContactNo());
		} else {
			System.out.println("manager is not there");
		}
	}

	public void removeManager()
	{
		this.manager=null;
	}
	
	
	
	public void updateManager(Manager name)
	{
		if(manager!=null)
		{
			this.manager=name;
		System.out.println("manager added");
	}
	else
	{
		System.out.println("Manager is not updated ");
	}
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Manager getManagerDTO() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}


}