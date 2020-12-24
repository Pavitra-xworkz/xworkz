package com.xworkz.sports.computer;
import com.xworkz.sports.computer.Computer;
import com.xworkz.sports.computer.Desktop;
import com.xworkz.sports.computer.Laptop;

public class DesktopTester {
public static void main(String[] args) {
	Desktop desktop=new Desktop();

	desktop.setCompanyName("HP");
	System.out.println(desktop.getCompanyName());
	desktop.setMemorysize("4 GB");
	System.out.println(desktop.getMemorysize());
	desktop.setSystemtype("64-bit");
	System.out.println(desktop.getSystemtype());
	
	
	Laptop laptop=new Laptop();
	
	desktop.setCompanyName("Dell");
	System.out.println(desktop.getCompanyName());
	desktop.setMemorysize("8-bit");
	System.out.println(desktop.getMemorysize());
	desktop.setSystemtype("32-bit");
	System.out.println(desktop.getSystemtype());
	
	
	Computer computer=new Laptop();
	if(computer instanceof Laptop) {
		System.out.println("laptop is instance of computer");
		Laptop laptopCasted=(Laptop)computer;
	}
    else {
		System.out.println("laptop is not instance of computer");
	}
	
	
}
}


