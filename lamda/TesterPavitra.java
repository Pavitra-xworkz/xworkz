package com.xworkz.lamda;

import com.xworkz.lamda.service.DisplayService;
import com.xworkz.lamda.service.DisplayServiceImpl;

public class TesterPavitra {
	public static void main(String[] args) {
		DisplayService service = new DisplayServiceImpl();

		service.printString((l, t) -> {
			System.out.println("validating" + l + " t" + t);
			if (l.contains("a") || l.contains("A")) {
				System.out.println(l + " " + l.hashCode());
			}
		});

	}

}
