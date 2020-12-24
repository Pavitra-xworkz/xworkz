package com.xworkz.sports.computer;

public class Computer {
	private String companyName;
	private String memorysize;
	private String systemtype;

	public boolean turnOn() {
		System.out.println("turn on is invoked");
		return true;
	}

	public void screendisplay() {
		System.out.println("screen display is invoked");
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMemorysize() {
		return memorysize;
	}

	public void setMemorysize(String memorysize) {
		this.memorysize = memorysize;
	}

	public String getSystemtype() {
		return systemtype;
	}

	public void setSystemtype(String systemtype) {
		this.systemtype = systemtype;
	}
	
}
