package com.xworkz.sports.computer;

public class Laptop extends Computer {
	private String processor;

	public void charging() {
		System.out.println("computer charging is invoked");
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getProcessor() {
		return processor;
	}

}
