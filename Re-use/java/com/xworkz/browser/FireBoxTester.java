package com.xworkz.browser;

import com.xworkz.browser.Browser;
import com.xworkz.browser.FireBox;

public class FireBoxTester {

	public static void main(String[] args) {

		Object generic = new FireBox();

		Browser browser = new FireBox();

		FireBox firefox = new FireBox();

		// it is illegal Browser child=new Object();

		// instanceOf
		generic = new String("test");
		if (generic instanceof FireBox) {
			System.out.println("yes it is fire fox");
			FireBox fireFoxCasted = (FireBox) generic;
			System.out.println(firefox.getName());

		} else {
			System.out.println("it is not fire fox");
		}

	}

}
