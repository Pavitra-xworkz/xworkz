package com.xworkz.sports.computer;

import com.xworkz.sports.computer.Desktop;
import com.xworkz.sports.computer.Laptop;


public class ComputerTester {

	public static void main(String[] args) {
		Computer computer = new Desktop();
		Desktop desktop = (Desktop) computer;
		desktop.connection();
	

		Computer computer1 = new Laptop();
		Laptop laptop = (Laptop) computer1;
		laptop.charging();
		laptop.setProcessor("Intel");
		System.out.println(laptop.getProcessor());
	}

}
