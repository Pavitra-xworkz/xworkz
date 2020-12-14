package com.xworkz.dto2;

public class Manager {
	
private String name;
private long contactNo;
 
 public Manager() {
	 System.out.println("Manager default Const");
 }
 public Manager(String name,long contactNo) {
	 super();
	 this.name=name;
	 this.contactNo=contactNo;
 }

public void setName(String name) {
	this.name = name;
}

public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}

public String getName() {
	return name;
}

public long getContactNo() {
	return contactNo;
}
 
 
}
