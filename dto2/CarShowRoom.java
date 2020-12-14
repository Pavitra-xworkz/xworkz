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

			this.manager = manager;
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

	public void removeManager() {
		this.manager = null;
		System.out.println("manager is removed");

	}

	public void updateManager(long contactNo) {
		if(manager=removeManager()) {
		
		System.out.println(this.manager.getContactNo());
		
		System.out.println("manager is  not updated");
	}

}

}